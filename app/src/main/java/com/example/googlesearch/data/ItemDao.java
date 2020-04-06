package com.example.googlesearch.data;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.googlesearch.pojo.Item;

import java.util.List;
@Dao
public interface ItemDao {
    @Query("SELECT * FROM item")
    LiveData<List<Item>> getAllItems();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertItem(List<Item> items);

    @Query("DELETE FROM item")
    void deleteAllItems();
}
