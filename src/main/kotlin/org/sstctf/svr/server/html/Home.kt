package org.sstctf.svr.server.html

import io.ktor.application.*
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.*
import javax.swing.text.html.HTML
import kotlinx.html.*

object Home {
    fun kotlinx.html.HTML.home() {
        head {
            link(rel = "stylesheet", type = "text/css", href = "/static/css/style.css")
            title {
                +"SST CTF Home"
            }
        }
        body {
            ul {
                li {
                    a("/home") { +"Home" }
                }
                li {
                    a("/schedule") { +"Schedule" }
                }
                li {
                    a("/blog") { +"Blog" }
                }
                li {
                    a("/about") { +"About" }
                }
                li {
                    a("/contact") { +"Contact" }
                }
            }
        }
    }
}
