package com.example.myapplication.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myapplication.R;
import com.example.myapplication.model.NobetciEzcaneModel;
import com.example.myapplication.model.ResponseModel;
import com.example.myapplication.service.ApiClient;
import com.example.myapplication.service.NobetciEzcaneAPI;

import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();

    }
    private void loadData(){

        final NobetciEzcaneAPI apiService = ApiClient.getRetrofit().create(NobetciEzcaneAPI.class);
        Call<ResponseModel> call = apiService.getData();

        call.enqueue(new Callback<ResponseModel>() {
            @Override
            public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                //System.out.println(response);
                if(response.body().getStatus().equals("success")){
                    List<NobetciEzcaneModel> veriList = response.body().getVeriler();
                    for(NobetciEzcaneModel model : veriList){
                        System.out.println(model.getName());
                    }
                }
            }

            @Override
            public void onFailure(Call<ResponseModel> call, Throwable t) {
                System.out.println("Başarısız");
            }
        });





    }
}
