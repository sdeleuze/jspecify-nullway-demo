package org.example

fun main() {
    val extractor: TokenExtractor = DefaultTokenExtractor()
    val token = extractor.extractToken("...")
    println("The token has a length of " + token.length)
}