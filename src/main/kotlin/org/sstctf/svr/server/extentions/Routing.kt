package org.sstctf.svr.server.extentions

import io.ktor.content.file
import io.ktor.content.static
import io.ktor.routing.Routing

fun Routing.static() {
    static("static") {
        file("/css/style.css", "style.css")
    }
}