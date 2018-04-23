package com.example.sergei.retrofittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import junit.framework.Test;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getTimeFromServer();

    }
    public void getTimeFromServer(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://date.jsontest.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        TimeJSONAPI api = retrofit.create(TimeJSONAPI.class);
        Call<TestTime> call = api.getTime();
        call.enqueue(new Callback<TestTime>() {
            @Override
            public void onResponse(Call<TestTime> call, Response<TestTime> response) {
                TestTime testTime = response.body();
                TextView tv = (TextView) findViewById(R.id.time);
                tv.setText(testTime.getTime());
            }

            @Override
            public void onFailure(Call<TestTime> call, Throwable t) {
                Toast.makeText(getApplicationContext(),t.toString(),Toast.LENGTH_LONG).show();
            }
        });

    }
}
