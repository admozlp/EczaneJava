package com.example.myapplication.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

import com.example.myapplication.R;
import com.example.myapplication.model.NobetciEzcaneModel;
import com.example.myapplication.model.ResponseModel;
import com.example.myapplication.service.NobetciEzcaneAPI;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    ArrayList<NobetciEzcaneModel> nobetciEzcaneModels;
    private   String BASE_URL="  https://www.nosyapi.com/apiv2/";
    Retrofit retrofit;
    CompositeDisposable compositeDisposable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //https://www.nosyapi.com/apiv2/pharmacyLink?city=istanbul&county=avcilar&apikey=r9wjtg0RW5J7iGUjHCDLKyuMr43QOAvarL0RwO5t6ed64MUnHI5TgSugBLE0

         //Retroift & JSON

        Gson gson=new GsonBuilder().setLenient().create();
        retrofit =new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())//gelen json retrofite de bıldiriyor
                .build();



        loadData();


        }
        private void loadData(){
        //ilk interface olusturmamız gerekıyor
           final   NobetciEzcaneAPI nobetciEzcaneAPI=retrofit.create(NobetciEzcaneAPI.class);

          /* compositeDisposable=new CompositeDisposable();
           compositeDisposable.add(nobetciEzcaneAPI.getData()
                   .subscribeOn(Schedulers.io())//hangı theadrde kayıt olma ıslemının yapılacagı
                   .observeOn(AndroidSchedulers.mainThread())//nerde gözlemlıcez
                   .subscribe());//ortaya cıkan seyı burda ele alıcaz bnu söylememız gerek
*/

            Call<List<ResponseModel>> call=nobetciEzcaneAPI.getData();

            call.enqueue(new Callback<List<ResponseModel>>() {
                @Override
                public void onResponse(Call<List<ResponseModel>> call, Response<List<ResponseModel>> response) {
                    ResponseModel obje = new ResponseModel();
                 System.out.println(obje.getStatus());
                }

                @Override
                public void onFailure(Call<List<ResponseModel>> call, Throwable t) {
                    System.out.println("false");
                    
                }
            });


        }


    }
