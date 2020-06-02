package com.example.myticket.Server;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface DataClient {

//post duwx lieeuj dangj text
    @FormUrlEncoded
    @POST("insert.php")
    Call<String > InsertData(@Field ("TenND") String TenND
                             ,@Field ("SDT") String SDT
                              ,@Field ("CMT") String CMT
                                ,@Field ("GioiTinh") String GioiTinh
                               ,@Field ("MatKhau") String MatKhau);

    @FormUrlEncoded
    @POST("login.php")
    Call<List>
}
