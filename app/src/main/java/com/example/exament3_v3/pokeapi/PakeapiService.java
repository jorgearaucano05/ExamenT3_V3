package com.example.exament3_v3.pokeapi;

import com.example.exament3_v3.models.PokemonRespuesta;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PakeapiService {
    @GET("pokemon")
    Call<PokemonRespuesta>obtenerListaPokemon();
}
