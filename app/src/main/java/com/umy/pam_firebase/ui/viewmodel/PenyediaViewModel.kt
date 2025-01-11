package com.umy.pam_firebase.ui.viewmodel

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.umy.pam_firebase.MahasiswaApp
//import com.umy.pam_firebase.di.Mhs

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer {
            val app = this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as MahasiswaApp
            HomeViewModel(app.containerApp.repositoryMhs)
        }
        initializer {
            val app = this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as MahasiswaApp
            InsertViewModel(app.containerApp.repositoryMhs)
        }
    }
}

//fun CreationExtras.mahasiswaApp(): MahasiswaApp =
//    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as MahasiswaApp)