package org.sstctf.svr.server.html

import kotlinx.html.*

object Schedule {
    fun kotlinx.html.HTML.schedule() {
        head {
            link(rel = "stylesheet", type = "text/css", href = "/static/css/style.css")
            title {
                +"SST CTF Schedule"
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