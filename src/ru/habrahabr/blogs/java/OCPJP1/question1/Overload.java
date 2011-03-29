package ru.habrahabr.blogs.java.OCPJP1.question1;

/**
 * Результатом его компиляции и выполнения будет:
 *  1. Ошибка компиляции
 *  2. Ошибка времени выполнения
 *  3. «Object»
 *  4. «FileNotFoundException»
 *  5. «IOException»
 */
public class Overload{
  public void method(Object o) {
    System.out.println("Object");
  }
  public void method(java.io.FileNotFoundException f) {
    System.out.println("FileNotFoundException");
  }
  public void method(java.io.IOException i) {
    System.out.println("IOException");
  }
  public static void main(String args[]) {
    Overload test = new Overload();
    test.method(null);
  }
}

/**
 * Наверное, мой любимый вопрос. Большинство людей угадывает ответ с 5-го раза. FileNotFoundException — последнее,
 * о чем думаешь глядя на этот код. Но на самом деле всё просто. Начнем с того, что в любой метод можно передать null.
 * А дальше компилятор выбирает наиболее узкую версию метода из возможных. В данном случае FileNotFoundException это
 * подкласс IOException, который, в свою очередь, подкласс Object. Поэтому компилятор выбирает именно данный метод.
*/