package com.example.googlesearch.api;


import com.example.googlesearch.pojo.Items;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ApiService {

    @GET(")
    Observable<Items> getItems();


}
