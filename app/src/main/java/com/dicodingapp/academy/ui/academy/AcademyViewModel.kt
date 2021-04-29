package com.dicodingapp.academy.ui.academy

import androidx.lifecycle.ViewModel
import com.dicodingapp.academy.data.CourseEntity
import com.dicodingapp.academy.utils.DataDummy

class AcademyViewModel : ViewModel() {

    fun getCourses(): List<CourseEntity> = DataDummy.generateDummyCourses()
}