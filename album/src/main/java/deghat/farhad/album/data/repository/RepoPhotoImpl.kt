package deghat.farhad.album.data.repository

import deghat.farhad.album.data.local.Cache
import deghat.farhad.album.domain.model.Photo
import deghat.farhad.album.domain.repository.RepoPhoto
import deghat.farhad.common.domain.usecase.base.ModelWrapper
import javax.inject.Inject

class RepoPhotoImpl @Inject constructor(
    private val cache: Cache
) : RepoPhoto {
    override suspend fun getPhotos(): ModelWrapper<List<Photo>> {
        return cache.getPhotos()
    }

    override suspend fun invalidateAndRefreshCache(): ModelWrapper<List<Photo>> {
        return cache.invalidateAndRefresh()
    }
}