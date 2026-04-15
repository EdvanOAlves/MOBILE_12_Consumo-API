package com.example.mobile_12_consumo_api.service

import com.example.mobile_12_consumo_api.model.Endereco
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface EnderecoService {
    //https://viacep.com.br/ws/01001000/json/
    @GET("{cep}/json/")
    fun getEnderecoByCep(@Path(value = "cep") cep: String): Call<Endereco>

    //https://viacep.com.br/ws/RS/Porto%20Alegre/Domingos/json/
    @GET("{uf}/{cidade}/{rua}/json/")
    suspend fun getEnderecosByUfCidadeRua(
        @Path(value = "uf") uf:String,
        @Path(value = "cidade") cidade: String,
        @Path(value = "rua") rua: String
    ):List<Endereco>
}