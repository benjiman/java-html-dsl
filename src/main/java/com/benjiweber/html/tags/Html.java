package com.benjiweber.html.tags;

import com.benjiweber.html.tags.support.NoAttributes;
import com.benjiweber.html.tags.support.Tag;
import org.w3c.tidy.Tidy;

import java.util.List;

import static java.util.Arrays.asList;

public interface Html extends NoAttributes {
    default Html html(Head head, Body body) {
        return new Html() {
            public String asString() { return tidy(tag("html")); }
            public List<Tag> children() { return asList(head, body); }
        };
    }
}
