package org.sstctf.svr.server.html

import kotlinx.html.*
import org.sstctf.svr.server.styling.Navigation

object Root {
    fun kotlinx.html.HTML.root() {
        head {
            meta {
                httpEquiv = "refresh"
                content = "0; /home"
            }
        }
    }
}