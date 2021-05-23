package com.dicodingapp.academy.ui.academy

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.dicodingapp.academy.data.AcademyRepository
import com.dicodingapp.academy.data.source.local.entity.CourseEntity
import com.dicodingapp.academy.vo.Resource

class AcademyViewModel(private val academyRepository: AcademyRepository) : ViewModel() {

    fun getCourses(): LiveData<Resource<List<CourseEntity>>> = academyRepository.getAllCourses()
}