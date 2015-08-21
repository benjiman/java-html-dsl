package com.benjiweber.html.tags;

public interface Small extends PhrasingContent {
    default Small small(String content) {
        return () -> tag("small", content);
    }
}
