package com.android.githubjobs.util

import android.widget.ImageView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import com.android.githubjobs.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

@BindingAdapter("downloadImage")
fun download(view: ImageView, urlToImage: String) {
    val uri = urlToImage.toUri().buildUpon().scheme("https").build()

    Glide
        .with(view.context)
        .load(uri)
        .apply(
            RequestOptions()
                .placeholder(R.drawable.loading_animation)
                .error(R.drawable.ic_broken_image)
        )
        .into(view)
}