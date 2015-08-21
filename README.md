# java-html-dsl

DSL for writing html in Java http://benjiweber.co.uk/blog/2015/08/21/html-in-java

This

```java
String doc =
    html(
        head(
            meta(charset -> "utf-8"),
            link(rel->stylesheet, type->css, href->"/my.css"),
            script(type->javascript, src -> "/some.js")
        ),
        body(
            h1("Hello World", style->"font-size:200%;"),
            article(
                p("Here is an interesting paragraph"),
                p(
                    "And another",
                    small("small")
                ),
                ul(
                        li("An"),
                        li("unordered"),
                        li("list")
                )
            )
        )
    ).asString();
```
Generates

```html
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN">

<html>
  <head>
    <meta name="generator" content=
    "HTML Tidy for Java (vers. 2009-12-01), see jtidy.sourceforge.net">
<meta charset="utf-8"><script type="text/javascript" src=
"/some.js">
</script>

    <title></title>
  </head>

  <body>
    <h1>Hello World</h1>

    <p>Here is an interesting paragraph</p>

    <p>And another<small>small</small></p>

    <ul>
      <li>An</li>

      <li>unordered</li>

      <li>list</li>
    </ul>
  </body>
</html>

```