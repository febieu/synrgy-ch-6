package com.example.ch6.presentation.auth.login.usecase

import com.example.ch6.domain.repository.AuthRepository
import kotlinx.coroutines.flow.Flow

class CheckLoginUseCase (
    private val authRepository: AuthRepository,
){
    suspend operator fun invoke(): Flow<Boolean?> {
        return authRepository.isLoggedIn()
    }
}