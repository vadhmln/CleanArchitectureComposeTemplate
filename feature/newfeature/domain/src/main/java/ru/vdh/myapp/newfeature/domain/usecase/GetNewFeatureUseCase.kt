package ru.vdh.myapp.newfeature.domain.usecase

import ru.vdh.myapp.newfeature.domain.repository.NewFeatureRepository

class GetNewFeatureUseCase(
    private val newFeatureRepository: NewFeatureRepository,
) {

    operator fun invoke() =
        newFeatureRepository.get()
}