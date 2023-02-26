package com.example.eatit

import io.ktor.client.*
import io.ktor.client.engine.android.*

class KtorHttpClient {

    private val httpClient = HttpClient(Android) {
        engine {
            
        }
    }
}