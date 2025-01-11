package com.umy.pam_firebase.di

import android.content.Context

object Mhs {
    lateinit var container: MahasiswaContainer
        private set

    fun initialize(context: Context) {
        container = MahasiswaContainer(context)
    }
}