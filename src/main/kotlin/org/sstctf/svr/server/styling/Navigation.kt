package org.sstctf.svr.server.styling

import azadev.kotlin.css.*
import azadev.kotlin.css.colors.*
import azadev.kotlin.css.dimens.*
import io.ktor.application.call
import io.ktor.content.resolveResource
import io.ktor.routing.Route
//import io.ktor.locations.*
import io.ktor.response.respond

object Navigation {
    val css = Stylesheet {
        c("navigator") {
            ul {
                listStyleType = "none"
                margin = 0
                padding = 0
                overflow = "hidden"
                backgroundColor = hex("#333")
            }
            li {
                float = "left"
            }
            li.a {
                display = "block"
                color = hex("#ffffff")
                textAlign = "center"
                padding = 14.px
                padding = 16.px
                textDecoration = "none"
                hover {
                    backgroundColor = hex("#111")
                }
            }
        }
    }

    init {
        css.renderToFile("style.css")
    }
}