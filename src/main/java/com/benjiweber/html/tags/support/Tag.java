package com.benjiweber.html.tags.support;

import org.apache.commons.lang.StringEscapeUtils;
import org.w3c.tidy.Tidy;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;

import static java.util.stream.Collectors.joining;

public interface Tag {
    String asString();
    List<Tag> children();
    List<Attribute> attributes();
    default String childrenAsString() {
        return children().stream().map(Tag::asString).collect(joining());
    }
    default String attributesAsString() {
        return attributes().size() > 0 ? " " + attributes().stream().map(Attribute::asString).collect(joining(" ")) : "";
    }
    default String tag(String name) {
        return tag(name, "");
    }
    default String tag(String name, String content) {
        return "<" + name + attributesAsString() + ">" + StringEscapeUtils.escapeHtml(content) + childrenAsString() + "</" + name + ">";
    }
    default String tidy(String html) {
        Tidy tidy = new Tidy();
        tidy.setXHTML(false);
        tidy.setSmartIndent(true);
        StringWriter writer = new StringWriter();
        tidy.parse(new StringReader(html), writer);
        return writer.toString();
    }
}
