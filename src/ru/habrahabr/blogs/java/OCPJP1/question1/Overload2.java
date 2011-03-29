package ru.habrahabr.blogs.java.OCPJP1.question1;

/**
 * Вот немного другая ситуация:
*/
public class Overload2 {
  public void method(Object o) {
    System.out.println("Object");
  }
  public void method(String s) {
    System.out.println("String");
  }
  public void method(StringBuffer sb) {
    System.out.println("StringBuffer");
  }
  public static void main(String args[]) {
    Overload test = new Overload();
    test.method(null);
  }
}

/**
 * На первый взгляд код почти такой же, но он даже не скомпилируется, так как тут есть два метода на одном уровне иерархии, и компилятор не может выбрать наиболее специфичный из них.
*/