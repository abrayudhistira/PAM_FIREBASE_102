package com.umy.pam_firebase.di

import android.content.Context
import com.google.firebase.firestore.FirebaseFirestore
import com.umy.pam_firebase.repository.NetworkRepositoryMhs
import com.umy.pam_firebase.repository.RepositoryMhs

interface InterfaceContainerApp {
    val repositoryMhs: RepositoryMhs
}

class MahasiswaContainer(private val context: Context) : InterfaceContainerApp {
    private val firestore : FirebaseFirestore = FirebaseFirestore.getInstance()
    override val repositoryMhs: RepositoryMhs by lazy {
        NetworkRepositoryMhs(firestore)
    }
}
