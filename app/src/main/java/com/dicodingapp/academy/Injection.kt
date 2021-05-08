package com.dicodingapp.academy

import android.content.Context
import com.dicodingapp.academy.data.source.AcademyRepository
import com.dicodingapp.academy.data.source.remote.RemoteDataSource
import com.dicodingapp.academy.utils.JsonHelper

object Injection {
    fun provideRepository(context: Context): AcademyRepository {

        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))

        return AcademyRepository.getInstance(remoteDataSource)
    }
}