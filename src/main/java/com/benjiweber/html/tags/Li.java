package com.benjiweber.html.tags;

import com.benjiweber.html.tags.support.Simple;

public interface Li extends Simple {
    default Li li(String value) {
        return () -> tag("li", value);
    }
}
