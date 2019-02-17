package com.example.fareedahmad.chinder.network;

import com.example.fareedahmad.chinder.model.Organization;

import java.util.List;

import io.reactivex.Single;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface CharingApiService {
    @GET("organizations")
    Single<List<Organization>> getOrganizations(@Query("name") String organizationName);

    @POST("login")
    Single<ResponseBody> register(@Body String params);
}
