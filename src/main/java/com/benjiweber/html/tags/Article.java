package com.benjiweber.html.tags;

import com.benjiweber.html.tags.support.*;

import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

public interface Article extends NoAttributes {
    default Article article(Tag... children) {
        return new Article() {
            public String asString() { return childrenAsString(); }
            public List<Tag> children() { return asList(children); }
        };
    }
}
