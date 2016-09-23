package com.example.angelinilorenzo.views.javafx

import com.example.angelinilorenzo.models.Contact
import com.example.angelinilorenzo.views.html.contactsView
import javafx.scene.web.WebView
import tornadofx.View

class HTML5View : View() {
    companion object {
        fun resourceLink(path: String) = "${HTML5View::class.java.getResource(path)}"
    }

    override val root = WebView()
    private val contacts = listOf(Contact("Paul Black", "+39 334256789", "paul.black@example.com", "282 Kevin Brook Street, Imogeneborough"),
                                  Contact("John Red", "+44 340556677", "john.red@example.com", "3316 Arron Smith Drive, New Roads"),
                                  Contact("Ken White", "+32 39876544", "ken.white@example.com", "169 Ersel Street, Paxtonville"))

    init {
        with(root) {
            setPrefSize(800.0, 600.0)
            // Atomatically set the title of the window as the HTML document title
            titleProperty.bind(engine.titleProperty())
            // Show all the contacts
            engine.loadContent(contactsView(contacts))
        }
    }
}