package com.example.kmmkotestsample

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform