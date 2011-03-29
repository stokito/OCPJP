package ru.habrahabr.blogs.java.OCPJP1.question7;

/**
 * Есть еще более забавный пример:
 */
public class TemplateClass {
    public static void main(String... args) {
        X string = new X("constructor");
        X integer = new X(1);
    }
}

class X {
  <X> X(X x) {
    System.out.println(x);
  }
}

/**
 * Это тоже рабочий код, который печатает любой объект, который указать в конструкторе класса X.
*/
