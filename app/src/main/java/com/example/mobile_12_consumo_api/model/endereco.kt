package com.example.mobile_12_consumo_api.model

import com.google.gson.annotations.SerializedName

data class Endereco(
    val cep:String = "",
    //usando do gson para converter como chega o valor para como vamos querer armazenar
    @SerializedName (value="logradouro") val rua:String = "",
    @SerializedName (value="localidade") val cidade:String = "",
    val bairro:String = "",
    val uf:String = ""
)