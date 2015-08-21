package com.benjiweber.html.tags.support;

import com.benjiweber.typeref.NamedValue;

public interface Attribute<T> extends NamedValue<T> {
    default String asString() {
        return name() + "=\"" + value()+"\"";
    }
}
