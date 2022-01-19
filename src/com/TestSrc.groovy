package com;

public class TestSrc{
public TestSrc(){
  println("In contructor....");
  echo "In contructor...."
}
public String displayName(String name){
  println("DisplayName... ${name}")
  System.out.println("DisplayName... ${name}")
  echo "DisplayName... ${name}"
  return "From TestSrc ${name}"
}
}
