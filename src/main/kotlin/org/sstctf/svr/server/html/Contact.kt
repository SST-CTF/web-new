package org.sstctf.svr.server.html

import kotlinx.html.*
import org.sstctf.svr.server.styling.Navigation.css

object Contact {
    fun kotlinx.html.HTML.contact() {
        head {
            link(rel = "stylesheet", type = "text/css", href = "/static/css/style.css")
            title {
                +"SST CTF Contact"
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
