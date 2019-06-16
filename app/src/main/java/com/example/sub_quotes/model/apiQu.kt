package com.example.sub_quotes.model
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

data class apiQu(
    @SerializedName("quote")
    val quotes: Quote?
) {


    data class Quote(
        @SerializedName("private")
        val `private`: Boolean,
        @SerializedName("author")
        val author: String,
        @SerializedName("author_permalink")
        val authorPermalink: String,
        @SerializedName("body")
        val body: String,
        @SerializedName("dialogue")
        val dialogue: Boolean,
        @SerializedName("downvotes_count")
        val downvotesCount: Int,
        @SerializedName("favorites_count")
        val favoritesCount: Int,
        @SerializedName("id")
        val id: Int,
        @SerializedName("tags")
        val tags: List<String>,
        @SerializedName("upvotes_count")
        val upvotesCount: Int,
        @SerializedName("url")
        val url: String
    )
}

