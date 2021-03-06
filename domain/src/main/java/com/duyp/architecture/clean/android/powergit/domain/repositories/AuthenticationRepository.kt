package com.duyp.architecture.clean.android.powergit.domain.repositories

import com.duyp.architecture.clean.android.powergit.domain.entities.AuthenticationEntity
import io.reactivex.Single

interface AuthenticationRepository {

    /**
     * Get all account in Android account manager
     * @return list of account's username
     */
    fun getAllAccounts() : Single<List<String>>

    fun getAuthenticatedAccounts(): Single<List<AuthenticationEntity>>

    /**
     * Get authentication token of given username
     */
    fun getAuthentication(username: String): String?

    /**
     * Add or update an user
     */
    fun addOrUpdateUser(username: String, password: String, auth: String)

    /**
     * Logout specific user by given username
     */
    fun logout(username: String)
}
