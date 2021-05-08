package com.dicodingapp.academy.data.source.remote

import com.dicodingapp.academy.data.source.remote.reponse.ContentResponse
import com.dicodingapp.academy.data.source.remote.reponse.CourseResponse
import com.dicodingapp.academy.data.source.remote.reponse.ModuleResponse
import com.dicodingapp.academy.utils.JsonHelper

class RemoteDataSource private constructor(private val jsonHelper: JsonHelper) {

    companion object {
        @Volatile
        private var instance: RemoteDataSource? = null

        fun getInstance(helper: JsonHelper): RemoteDataSource =
            instance ?: synchronized(this) {
                instance ?: RemoteDataSource(helper).apply { instance = this }
            }
    }

    fun getAllCourses(): List<CourseResponse> = jsonHelper.loadCourses()

    fun getModules(courseId: String): List<ModuleResponse> = jsonHelper.loadModule(courseId)

    fun getContent(moduleId: String): ContentResponse = jsonHelper.loadContent(moduleId)

}