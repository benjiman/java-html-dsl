package com.benjiweber.html.tags;

import com.benjiweber.html.tags.support.NoAttributes;
import com.benjiweber.html.tags.support.Tag;

import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

public interface Ul extends NoAttributes {
    default Ul ul(Li... items) {
        return new Ul() {
            public String asString() { return tag("ul"); }
            public List<Tag> children() { return asList(items); }
        };
    }
}
