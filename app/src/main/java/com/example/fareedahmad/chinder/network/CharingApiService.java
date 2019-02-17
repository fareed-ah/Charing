package com.example.fareedahmad.chinder.network;

import com.example.fareedahmad.chinder.model.Organization;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;

public interface CharingApiService {
    @GET("organizations")
    Single<List<Organization>> getOrganizations();
}
