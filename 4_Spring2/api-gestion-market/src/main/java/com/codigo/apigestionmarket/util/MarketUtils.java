package com.codigo.apigestionmarket.util;

import com.codigo.apigestionmarket.pojo.Usuarios;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class MarketUtils {

    private MarketUtils(){

    }

    public static ResponseEntity<String> getResponseEntity(String message, HttpStatus httpStatus){
        return new ResponseEntity<String>("Mensaje : " + message,httpStatus);
    }


}
