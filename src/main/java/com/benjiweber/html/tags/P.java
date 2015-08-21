package com.benjiweber.html.tags;

import com.benjiweber.html.tags.support.NoAttributes;
import com.benjiweber.html.tags.support.Tag;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.joining;

public interface P extends NoAttributes {
    default P p(String content, PhrasingContent... children) {
        return new P() {
            public String asString() { return tag("p", content); }
            public List<Tag> children() { return asList(children); }
        };
    }
}
