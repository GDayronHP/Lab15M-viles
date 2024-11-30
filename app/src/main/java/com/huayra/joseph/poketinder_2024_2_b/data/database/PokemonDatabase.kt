package com.huayra.joseph.poketinder_2024_2_b.data.database
import androidx.room.Database
import androidx.room.RoomDatabase
import com.huayra.joseph.poketinder_2024_2_b.data.database.dao.PokemonDao
import com.huayra.joseph.poketinder_2024_2_b.data.database.entities.MyPokemonEntity

@Database(entities = [MyPokemonEntity::class], exportSchema = false, version = 1)
abstract class PokemonDatabase: RoomDatabase() {
    abstract fun getPokemonDao(): PokemonDao
}
