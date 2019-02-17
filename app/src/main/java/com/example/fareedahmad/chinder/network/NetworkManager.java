package com.example.fareedahmad.chinder.network;

import com.example.fareedahmad.chinder.model.Organization;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.util.List;

import io.reactivex.Single;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
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

    public Single<List<Organization>> getCollections(String name){return charingApiService.getOrganizations(name);}

    public Single<ResponseBody> register(RequestBody params){return charingApiService.register(params);}
}
