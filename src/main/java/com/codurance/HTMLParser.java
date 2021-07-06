package com.codurance;

public class HTMLParser {
  public String findParagraph(String html) {
    int index1 = html.indexOf("<p>");
    int index2 = html.indexOf("</p>");

    if (index1 == -1){
      return "";
    }else {
      String substring = html.substring(index1 + 3, index2);
      String replacedHTML = html.replace("<p>" + substring + "</p>", "");

      return (substring + "\n" + findParagraph(replacedHTML)).strip();
    }
  }
}
