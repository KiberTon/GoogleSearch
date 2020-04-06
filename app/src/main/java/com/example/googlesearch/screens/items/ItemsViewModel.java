package com.example.googlesearch.screens.items;

import android.app.Application;
import android.content.Intent;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.googlesearch.api.ApiFactory;
import com.example.googlesearch.api.ApiService;
import com.example.googlesearch.data.AppDataBase;
import com.example.googlesearch.pojo.Item;
import com.example.googlesearch.pojo.Items;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class ItemsViewModel extends AndroidViewModel {

    private static AppDataBase db;
    private LiveData<List<Item>> items;
    private CompositeDisposable compositeDisposable;
    private MutableLiveData<Throwable> errors;



    public ItemsViewModel(@NonNull Application application) {
        super(application);
        db = AppDataBase.getInstance(application);
        items = db.itemDao().getAllItems();
        errors = new MutableLiveData<>();
    }


    LiveData<Throwable> getErrors() {
        return errors;
    }

    void clearErrors() {
        errors.setValue(null);
    }

    public LiveData<List<Item>> getItems() {
        return items;
    }

    @SuppressWarnings("unchecked")
    private void insertItems(List<Item> items) {
        new InsertItemsTask().execute(items);
    }

    public static class InsertItemsTask extends AsyncTask<List<Item>, Void, Void> {

        @SafeVarargs
        @Override
        protected final Void doInBackground(List<Item>... lists) {
            if (lists != null && lists.length > 0) {
                db.itemDao().insertItem(lists[0]);
            }
            return null;
        }
    }

    private void deleteAllItems() {
        new DeleteAllItemsTask().execute();
    }

    public static class DeleteAllItemsTask extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... voids) {
            db.itemDao().deleteAllItems();
            return null;
        }
    }


    void loadData() {
        ApiFactory apiFactory = ApiFactory.getInstance();
        ApiService apiService = apiFactory.getApiService();
        compositeDisposable = new CompositeDisposable();
        Disposable disposable = apiService.getItems()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Items>() {
                    @Override
                    public void accept(Items items) throws Exception {
                        deleteAllItems();
                        insertItems(items.getItems());
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        errors.setValue(throwable);
                    }
                });
        compositeDisposable.add(disposable);
    }

    @Override
    protected void onCleared() {
        compositeDisposable.dispose();
        super.onCleared();
    }
}
