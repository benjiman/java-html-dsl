package com.benjiweber.html.tags;

import com.benjiweber.html.tags.support.Attribute;
import com.benjiweber.html.tags.support.NoChildren;
import com.benjiweber.html.tags.support.Simple;
import com.benjiweber.html.values.ScriptType;

import java.util.List;

import static java.util.Arrays.asList;

public interface Script extends NoChildren, Head.Child {
    default Script script(Attribute<ScriptType> type, Attribute<String> src) {
        return new Script() {
            public String asString() { return tag("script"); }
            public List<Attribute> attributes() { return asList(type, src); }
        };
    }
}
