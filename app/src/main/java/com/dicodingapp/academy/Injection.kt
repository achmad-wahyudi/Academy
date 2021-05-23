package com.dicodingapp.academy

import android.content.Context
import com.dicodingapp.academy.data.AcademyRepository
import com.dicodingapp.academy.data.source.local.LocalDataSource
import com.dicodingapp.academy.data.source.local.room.AcademyDatabase
import com.dicodingapp.academy.data.source.remote.RemoteDataSource
import com.dicodingapp.academy.utils.AppExecutors
import com.dicodingapp.academy.utils.JsonHelper

object Injection {
    fun provideRepository(context: Context): AcademyRepository {

        val database = AcademyDatabase.getInstance(context)

        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))
        val localDataSource = LocalDataSource.getInstance(database.academyDao())
        val appExecutors = AppExecutors()

        return AcademyRepository.getInstance(remoteDataSource, localDataSource, appExecutors)
    }
}