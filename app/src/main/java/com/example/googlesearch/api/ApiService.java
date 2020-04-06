package com.example.googlesearch.api;


import com.example.googlesearch.pojo.Items;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ApiService {

    @GET("v1?key=AIzaSyCCgwiRwhUUG_-B6cStmymaKN59a3Wu-Cc&cx=013909217334106613332:oq3okfe7n4v" + "&q=Apple")
    Observable<Items> getItems();


}
