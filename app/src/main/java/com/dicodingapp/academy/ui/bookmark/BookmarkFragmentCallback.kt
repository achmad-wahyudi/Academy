package com.dicodingapp.academy.ui.bookmark

import com.dicodingapp.academy.data.source.local.entity.CourseEntity

interface BookmarkFragmentCallback {
    fun onShareClick(course: CourseEntity)
}
