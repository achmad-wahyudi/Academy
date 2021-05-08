package com.dicodingapp.academy.data.source

import androidx.lifecycle.LiveData
import com.dicodingapp.academy.data.CourseEntity
import com.dicodingapp.academy.data.ModuleEntity

interface AcademyDataSource {
    fun getAllCourses(): LiveData<List<CourseEntity>>

    fun getBookmarkedCourses(): LiveData<List<CourseEntity>>

    fun getCourseWithModules(courseId: String): LiveData<CourseEntity>

    fun getAllModulesByCourse(courseId: String): LiveData<List<ModuleEntity>>

    fun getContent(courseId: String, moduleId: String): LiveData<ModuleEntity>
}