package com.dicodingapp.academy.ui.bookmark

import androidx.lifecycle.ViewModel
import com.dicodingapp.academy.data.CourseEntity
import com.dicodingapp.academy.utils.DataDummy

class BookmarkViewModel : ViewModel() {

    fun getBookmarks(): List<CourseEntity> = DataDummy.generateDummyCourses()
}