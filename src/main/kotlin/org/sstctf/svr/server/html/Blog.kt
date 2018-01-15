package org.sstctf.svr.server.html

import kotlinx.html.*

object Blog {
    fun kotlinx.html.HTML.blog() {
        head {
            link(rel = "stylesheet", type = "text/css", href = "/static/css/style.css")
            title {
                +"SST CTF Blog"
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
