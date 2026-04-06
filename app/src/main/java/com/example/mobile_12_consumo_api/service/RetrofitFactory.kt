package com.example.mobile_12_consumo_api.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitFactory {
    private val BASE_URL =  "https://viacep.com.br/ws/"
    private val retrofitFactory = Retrofit
        .Builder() // Declarando que vamos querer o builder
        .addConverterFactory(GsonConverterFactory.create()) //Declarando que vamos querer um conversor para Gson
        .baseUrl(BASE_URL) // Declarando a rota
        .build() //Instanciando com as configurações inseridas

    fun getEnderecoService(): EnderecoService{
        return retrofitFactory.create(EnderecoService::class.java)
    }
}