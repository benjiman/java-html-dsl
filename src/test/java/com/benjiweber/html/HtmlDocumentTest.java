package com.benjiweber.html;

import org.junit.Test;
import static com.benjiweber.html.values.Rel.*;
import static com.benjiweber.html.values.Style.*;
import static com.benjiweber.html.values.ScriptType.*;
import static org.junit.Assert.assertEquals;

public class HtmlDocumentTest implements HtmlDsl {
    @Test
    public void html_example() {
        String doc =
            html(
                head(
                    meta(charset -> "utf-8"),
                    link(rel->stylesheet, type->css, href->"/my.css"),
                    script(type->javascript, src -> "/some.js")
                ),
                body(
                    h1("Hello World", style->"font-size:200%;"),
                    article(
                        p("Here is an interesting paragraph"),
                        p(
                            "And another",
                            small("small")
                        ),
                        ul(
                                li("An"),
                                li("unordered"),
                                li("list")
                        )
                    )
                )
            ).asString();

        assertEquals(
                "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01//EN\">\n" +
                "\n" +
                "<html>\n" +
                "  <head>\n" +
                "    <meta name=\"generator\" content=\n" +
                "    \"HTML Tidy for Java (vers. 2009-12-01), see jtidy.sourceforge.net\">\n" +
                "<meta charset=\"utf-8\"><script type=\"text/javascript\" src=\n" +
                "\"/some.js\">\n" +
                "</script>\n" +
                "\n" +
                "    <title></title>\n" +
                "  </head>\n" +
                "\n" +
                "  <body>\n" +
                "    <h1>Hello World</h1>\n" +
                "\n" +
                "    <p>Here is an interesting paragraph</p>\n" +
                "\n" +
                "    <p>And another<small>small</small></p>\n" +
                "\n" +
                "    <ul>\n" +
                "      <li>An</li>\n" +
                "\n" +
                "      <li>unordered</li>\n" +
                "\n" +
                "      <li>list</li>\n" +
                "    </ul>\n" +
                "  </body>\n" +
                "</html>\n",
            doc
        );
    }
}