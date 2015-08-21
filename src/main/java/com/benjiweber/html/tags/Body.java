package com.benjiweber.html.tags;
import com.benjiweber.html.tags.support.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

public interface Body extends NoAttributes {
    default Body body(Stream<Tag> children) {
        return body(children.collect(toList()).toArray(new Tag[0]));
    }
    default Body body(Tag... children) {
        return new Body() {
            public String asString() { return tag("body"); }
            public List<Tag> children() { return asList(children); }
        };
    }
}
