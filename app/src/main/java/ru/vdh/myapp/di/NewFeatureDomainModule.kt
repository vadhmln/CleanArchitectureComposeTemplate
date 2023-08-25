package ru.vdh.myapp.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import ru.vdh.myapp.newfeature.domain.repository.NewFeatureRepository
import ru.vdh.myapp.newfeature.domain.usecase.GetNewFeatureUseCase

@Module
@InstallIn(ViewModelComponent::class)
class NewFeatureDomainModule {

    @Provides
    fun provideGetNewFeatureUseCase(
        newFeatureRepository: NewFeatureRepository,
    ): GetNewFeatureUseCase =
        GetNewFeatureUseCase(
            newFeatureRepository = newFeatureRepository,
        )
}