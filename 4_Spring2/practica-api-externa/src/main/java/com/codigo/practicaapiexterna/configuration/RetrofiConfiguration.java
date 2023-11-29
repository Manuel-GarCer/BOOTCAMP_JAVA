package com.codigo.practicaapiexterna.configuration;

import com.codigo.practicaapiexterna.service.RucInformationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

@Configuration
public class RetrofiConfiguration {

    @Bean
    public Retrofit retrofit(){
        return new Retrofit.Builder()
                .baseUrl("https://api.apis.net.pe")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }

    @Bean
    public RucInformationService rucInformationService(){
        return retrofit().create(RucInformationService.class);
    }
}
