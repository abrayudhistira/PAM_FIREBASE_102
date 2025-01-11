package com.umy.pam_firebase

import android.app.Application
import com.google.firebase.FirebaseApp
import com.umy.pam_firebase.di.MahasiswaContainer

class MahasiswaApp : Application() {
    lateinit var containerApp: MahasiswaContainer

    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(this)
        containerApp = MahasiswaContainer(this)
    }
}