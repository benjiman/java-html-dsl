package com.benjiweber.html.tags.support;

import java.util.Collections;
import java.util.List;

public interface NoAttributes extends Tag {
    default List<Attribute> attributes() {
        return Collections.emptyList();
    }
}
