package com.example.androidexpert1.core.di

import com.example.androidexpert1.core.data.RecipeRepository
import com.example.androidexpert1.core.domain.repository.IRecipeRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module(includes = [NetworkModule::class, DatabaseModule::class])
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun provideRepository(recipeRepository: RecipeRepository): IRecipeRepository
}











