package com.benjiweber.html.tags;
import com.benjiweber.html.tags.support.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

public interface Body extends NoAttributes {
    default Body body(Tag... children) {
        return new Body() {
            public String asString() { return tag("body"); }
            public List<Tag> children() { return asList(children); }
        };
    }
}
