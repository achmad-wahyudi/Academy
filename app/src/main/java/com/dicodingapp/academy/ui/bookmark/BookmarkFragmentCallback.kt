package com.dicodingapp.academy.ui.bookmark

import com.dicodingapp.academy.data.CourseEntity

interface BookmarkFragmentCallback {
    fun onShareClick(course: CourseEntity)
}
