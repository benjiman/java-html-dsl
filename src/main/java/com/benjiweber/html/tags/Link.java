package com.benjiweber.html.tags;

import com.benjiweber.html.tags.support.Attribute;
import com.benjiweber.html.tags.support.Simple;
import com.benjiweber.html.values.Rel;
import com.benjiweber.html.values.Style;

public interface Link extends Simple, Head.Child {
    default Link link(Attribute<Rel> rel, Attribute<?>... attributes) {
        return () -> "";
    }
}
