package com.benjiweber.html;

import com.benjiweber.html.tags.*;

public interface HtmlDsl extends
        Html,
        Head,
        Body,
        Link,
        Meta,
        P,
        Script,
        H1,
        Li,
        Ul,
        Article,
        Small,
        Img {
    default String asString() { return ""; }
}
