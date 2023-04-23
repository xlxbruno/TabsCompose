package com.example.tabs

import androidx.compose.runtime.Composable

typealias ComposableFun = @Composable () -> Unit
sealed class TabItem
    (var icon: Int, var title: String, var screen: ComposableFun){
    object Music : TabItem(R.drawable.music, "Music", { MusicScreen() })
    object Movies : TabItem(R.drawable.movies, "Movies", { MoviesScreen() })
    object Books : TabItem(R.drawable.books, "Books", { BooksScreen() })
}