package org.nhathuy.timeoflife

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform