package com.example.myticket.Server;

public class APIUtils {
    public static final String Base_Url = "http://192.168.7.101/mycao/";
    public static DataClient getData(){
        return RetrofitClient.getClient (Base_Url).create (DataClient.class);

    }
}
