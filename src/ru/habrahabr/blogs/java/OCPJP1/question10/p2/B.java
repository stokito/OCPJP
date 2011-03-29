package ru.habrahabr.blogs.java.OCPJP1.question10.p2;

/**
 * В результате выполнения класса В мы получим:
 *  1. Будет выведено «20»
 *  2. Будет выведено «10»
 *  3. Код не скомпилирутся
 *  4. Возникнет ошибка времени выполнения
 *  5. Все ответы неверны
 */

import ru.habrahabr.blogs.java.OCPJP1.question10.p1.*;

public class B extends A {
    public void process(A a) {
//        a.i = a.i * 2;
    }

    public static void main(String[] args) {
        A a = new B();
        B b = new B();
        b.process(a);
        System.out.println(a.getI());
    }
}