package com.benjiweber.html.tags;

import com.benjiweber.html.tags.support.Attribute;
import com.benjiweber.html.tags.support.NoChildren;

import java.util.List;

import static java.util.Arrays.asList;

public interface Meta extends NoChildren, Head.Child {
    default Meta meta(Attribute<String>... attributes) {
        return new Meta() {
            public String asString() { return tag("meta");  }
            public List<Attribute> attributes() { return asList(attributes); }
        };
    }
}
