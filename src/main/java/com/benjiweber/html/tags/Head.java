package com.benjiweber.html.tags;

import com.benjiweber.html.tags.support.NoAttributes;
import com.benjiweber.html.tags.support.Tag;

import java.util.List;

import static java.util.Arrays.asList;

public interface Head extends NoAttributes {
    interface Child extends Tag {}
    default Head head(Child... children) {
        return new Head() {
            public String asString() { return tag("head"); }
            public List<Tag> children() { return asList(children); }
        };
    }
}
