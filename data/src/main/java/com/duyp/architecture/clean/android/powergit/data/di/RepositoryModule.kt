package com.duyp.architecture.clean.android.powergit.data.di

import com.duyp.architecture.clean.android.powergit.data.repositories.*
import com.duyp.architecture.clean.android.powergit.domain.repositories.*
import dagger.Binds
import dagger.Module

@Module
abstract class RepositoryModule {

    @Binds abstract fun androidInteractor(androidInteractorImpl: AndroidInteractorImpl): AndroidInteractor

    @Binds abstract fun userRepository(userRepositoryImpl: UserRepositoryImpl): UserRepository

    @Binds abstract fun authenticationRepository(authenticationRepositoryImpl: AuthenticationRepositoryImpl): AuthenticationRepository

    @Binds abstract fun settingRepository(settingRepositoryImpl: SettingRepositoryImpl): SettingRepository

    @Binds abstract fun repoRepository(repositoryImpl: RepoRepositoryImpl): RepoRepository

    @Binds abstract fun eventRepository(eventRepositoryImpl: EventRepositoryImpl): EventRepository

    @Binds abstract fun searchRepository(searchRepositoryImpl: SearchRepositoryImpl): SearchRepository

    @Binds abstract fun recentRepoRepository(recentRepoRepositoryImpl: RecentRepoRepositoryImpl): RecentRepoRepository

    @Binds abstract fun issueRepository(issueRepositoryImpl: IssueRepositoryImpl): IssueRepository
}
