package com.huayra.joseph.poketinder_2024_2_b.data.model

data class PokemonListResponse(
    val count: Int,
    val next: String,
    val results: List<PokemonResponse>
)