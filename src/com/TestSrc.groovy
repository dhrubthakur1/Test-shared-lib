package com;

public class TestSrc{
  Script script;
public TestSrc(def this){
  script = this
  println("In contructor....");
  script.echo "In contructor...."
}
public String displayName(String name){
  println("DisplayName... ${name}")
  System.out.println("DisplayName... ${name}")
  script.echo "DisplayName... ${name}"
  return "From TestSrc ${name}"
}
}
