package ru.vdh.myapp.secondfeature.domain.usecase

import ru.vdh.myapp.secondfeature.domain.model.NewFeatureDomainModel
import ru.vdh.myapp.secondfeature.domain.repository.NewFeatureRepository

class GetSecondFeatureUseCase(
    private val newFeatureRepository: NewFeatureRepository,
)  {

    operator fun invoke(request: NewFeatureDomainModel) =
        newFeatureRepository.get()
}