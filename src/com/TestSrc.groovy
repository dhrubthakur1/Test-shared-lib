package com;

public class TestSrc{
public TestSrc(){
println("In contructor....");
}
public String displayName(String name){
  println("DisplayName... ${name}")
  System.out.println("DisplayName... ${name}")
  return "From TestSrc ${name}"
}
}
