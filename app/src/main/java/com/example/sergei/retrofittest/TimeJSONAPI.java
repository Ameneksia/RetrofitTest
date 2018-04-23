package com.example.sergei.retrofittest;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;

public interface TimeJSONAPI {
    @GET("/")
    public Call<TestTime> getTime();
}
