package org.sstctf.svr.server

import io.ktor.application.call
import io.ktor.html.respondHtml
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import org.sstctf.svr.server.extentions.static
import org.sstctf.svr.server.html.About.about
import org.sstctf.svr.server.html.Blog.blog
import org.sstctf.svr.server.html.Contact.contact
import org.sstctf.svr.server.html.Home.home
import org.sstctf.svr.server.html.Root.root
import org.sstctf.svr.server.html.Schedule.schedule
import org.sstctf.svr.server.styling.Navigation


fun main(args: Array<String>) {
    embeddedServer(Netty, 3000) {
        routing {
            Navigation
            static()
            get("/") {
                call.respondHtml {
                    root()
                }
            }
            get("/home") {
                call.respondHtml {
                    home()
                }
            }
            get("/schedule") {
                call.respondHtml {
                    schedule()
                }
            }
            get("/about") {
                call.respondHtml {
                    about()
                }
            }
            get("/contact") {
                call.respondHtml {
                    contact()
                }
            }
            get("/blog") {
                call.respondHtml {
                    blog()
                }
            }
        }
    }.start(true)
}