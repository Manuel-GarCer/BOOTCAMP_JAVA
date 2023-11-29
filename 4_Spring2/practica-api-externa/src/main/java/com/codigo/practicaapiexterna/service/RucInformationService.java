package com.codigo.practicaapiexterna.service;

import com.codigo.practicaapiexterna.response.ResponsePrueba;
import com.codigo.practicaapiexterna.response.ResponseRUC;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface RucInformationService {
    @GET("/v2/sunat/ruc")
    Call<ResponseRUC> consultarRUC(@Query("numero") String numero, @Header("Authorization") String token);
}
