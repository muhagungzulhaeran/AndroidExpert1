package com.example.androidexpert1.core.data.source.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.androidexpert1.core.data.source.local.entity.RecipeEntity

@Database(entities = [RecipeEntity::class], version = 1, exportSchema = false)
abstract class RecipeDatabase : RoomDatabase(){
    abstract fun recipesDao(): RecipeDao
}