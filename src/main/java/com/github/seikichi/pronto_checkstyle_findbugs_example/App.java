package com.github.seikichi.pronto_checkstyle_findbugs_example;

public class App {
  public String getGreeting() {
    return "Hello world.";
  }

  public static void main(String[] args) {
    if ("foo" == String.format("%soo", "f")) { // findbugs violation
    System.out.println("foo!"); // checkstyle violation
    }
    System.out.println(new App().getGreeting());
  }
}
