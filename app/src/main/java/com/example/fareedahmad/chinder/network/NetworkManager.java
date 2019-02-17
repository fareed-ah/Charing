package com.example.fareedahmad.chinder.network;

import com.example.fareedahmad.chinder.model.Organization;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.util.List;

import io.reactivex.Single;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkManager {
    private CharingApiService charingApiService = new Retrofit.Builder()
            .baseUrl("https://test-backend-charing.herokuapp.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(new OkHttpClient())
            .build()
            .create(CharingApiService.class);

    public Single<List<Organization>> getCollections(){return charingApiService.getOrganizations();}
}
