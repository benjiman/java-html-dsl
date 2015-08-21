package com.benjiweber.html.tags.support;

import java.util.Collections;
import java.util.List;

public interface NoChildren extends Tag {
    default List<Tag> children() {
        return Collections.emptyList();
    }
}
