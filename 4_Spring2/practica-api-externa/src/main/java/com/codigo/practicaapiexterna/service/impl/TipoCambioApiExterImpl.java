package com.codigo.practicaapiexterna.service.impl;

import com.codigo.practicaapiexterna.response.ResponseTC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;

@Service
public class TipoCambioApiExterImpl {

    @Autowired
    private RestTemplate restTemplate;

    public ResponseTC consultarTC(){
        String URL = "https://api.apis.net.pe/v2/sbs/tipo-cambio";

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Authorization","Bearer "+"apis-token-6142.RO0T5zLJBXrNzY2-AIL8z0OhNOPuhRyW"); //añadir el token

        HttpEntity<String> entity = new HttpEntity<>(httpHeaders);


        ResponseEntity<ResponseTC> response = restTemplate.exchange(URL, HttpMethod.GET,entity,ResponseTC.class);

        if(response.getStatusCode().is2xxSuccessful()){
            ResponseTC responseTC = new ResponseTC();
            responseTC.setPrecioCompra(response.getBody().getPrecioCompra());
            responseTC.setPrecioVenta(response.getBody().getPrecioVenta());
            responseTC.setMoneda("DOLARES");
            responseTC.setFecha(response.getBody().getFecha());
            return responseTC;
        }else{
            return null;
        }
    }
}
