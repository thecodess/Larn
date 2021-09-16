package com.apps.larn

import android.app.Application
import coil.ImageLoader
import coil.ImageLoaderFactory
import com.apps.larn.ui.utils.UnsplashSizingInterceptor

@Suppress("unused")
class LarnApplication : Application(), ImageLoaderFactory {

    /**
     * Create the singleton [ImageLoader].
     * This is used by [rememberImagePainter] to load images in the app.
     */
    override fun newImageLoader(): ImageLoader {
        return ImageLoader.Builder(this)
            .componentRegistry {
                add(UnsplashSizingInterceptor)
            }
            .build()
    }
}