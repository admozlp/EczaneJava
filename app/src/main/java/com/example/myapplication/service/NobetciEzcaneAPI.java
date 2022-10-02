package com.example.myapplication.service;

import com.example.myapplication.model.ResponseModel;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface NobetciEzcaneAPI {


    //https://www.nosyapi.com/apiv2/pharmacyLink?city=istanbul&county=avcilar&apikey=r9wjtg0RW5J7iGUjHCDLKyuMr43QOAvarL0RwO5t6ed64MUnHI5TgSugBLE0

//get almak için
    @GET("pharmacyLink?city=istanbul&county=avcilar&apikey=r9wjtg0RW5J7iGUjHCDLKyuMr43QOAvarL0RwO5t6ed64MUnHI5TgSugBLE0")

    //Observable<List<ResponseModel>> getData();

     Call<ResponseModel> getData();
    //butun bu modele getdata dedık
}
