package com.codigo.practicaapiexterna.controller;

import com.codigo.practicaapiexterna.response.ResponsePrueba;
import com.codigo.practicaapiexterna.response.ResponseRUC;
import com.codigo.practicaapiexterna.response.ResponseTC;
import com.codigo.practicaapiexterna.service.RucInformationService;
import com.codigo.practicaapiexterna.service.impl.TipoCambioApiExterImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import retrofit2.Call;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RestController
@RequestMapping("/api/practica")
public class PracticaController {

    @Autowired
    private RucInformationService rucInformationService;

    @Autowired
    private TipoCambioApiExterImpl tipoCambioApiExter;

    @GetMapping("/rucInformation")
    public ResponseRUC consultarRuc(@RequestParam() String numero) throws IOException {
        Call<ResponseRUC> call = rucInformationService.consultarRUC(numero,"Bearer "+"apis-token-6142.RO0T5zLJBXrNzY2-AIL8z0OhNOPuhRyW");
        retrofit2.Response<ResponseRUC> responseRUCResponse = call.execute();

        if(responseRUCResponse.isSuccessful()){

            return responseRUCResponse.body();
        }else{
            return null;
        }
    }

    @GetMapping("/tipoCambio")
    public ResponseTC consultarTC(){
        return tipoCambioApiExter.consultarTC();
    }
}
