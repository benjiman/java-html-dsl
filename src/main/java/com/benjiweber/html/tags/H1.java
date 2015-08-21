package com.benjiweber.html.tags;

import com.benjiweber.html.tags.support.Attribute;
import com.benjiweber.html.tags.support.NoAttributes;
import com.benjiweber.html.tags.support.NoChildren;

public interface H1 extends NoChildren, NoAttributes {
    default H1 h1(String content, Attribute<String>... attributes) {
        return () -> "<h1>" + content + "</h1>";
    }
}
