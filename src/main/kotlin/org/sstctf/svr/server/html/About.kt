package org.sstctf.svr.server.html

import kotlinx.html.*

object About {
    fun kotlinx.html.HTML.about() {
        head {
            link(rel = "stylesheet", type = "text/css", href = "/static/css/style.css")
            title {
                +"SST CTF About"
            }
        }
        body {
            div("navigator") {
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
}
