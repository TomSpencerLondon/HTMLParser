package com.codurance;

public class HTMLParser {
  public String findParagraph(String html) {
    int index1 = html.indexOf("<p>");
    int index2 = html.indexOf("</p>", index1);


    return html.substring(index1 + 3, index2);
  }
}
