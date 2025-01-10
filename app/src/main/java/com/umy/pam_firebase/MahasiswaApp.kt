package com.umy.pam_firebase

import android.app.Application
import com.umy.pam_firebase.di.MahasiswaContainer

class MahasiswaApp : Application() {
    lateinit var containerApp: MahasiswaContainer

    override fun onCreate() {
        super.onCreate()

        containerApp = MahasiswaContainer(this)
    }
}