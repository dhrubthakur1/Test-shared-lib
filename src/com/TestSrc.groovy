package com;

public class TestSrc{
  Script script;
public TestSrc(){
  println("In contructor....");
  Script.echo "In contructor...."
}
public String displayName(String name){
  println("DisplayName... ${name}")
  System.out.println("DisplayName... ${name}")
  Script.echo "DisplayName... ${name}"
  return "From TestSrc ${name}"
}
}
