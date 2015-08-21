package com.benjiweber.html.tags;

import com.benjiweber.html.tags.support.Attribute;
import com.benjiweber.html.tags.support.NoChildren;
import com.benjiweber.html.values.PixelMeasurement;
import com.benjiweber.html.values.ScriptType;

import java.util.List;

import static java.util.Arrays.asList;

public interface Img extends NoChildren {
    default Img img(Attribute<String> src, Attribute<PixelMeasurement> dim1, Attribute<PixelMeasurement> dim2) {
        return new Img() {
            public String asString() { return tag("img"); }
            public List<Attribute> attributes() { return asList(dim1, dim2, src); }
        };
    }
}
