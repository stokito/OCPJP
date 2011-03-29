package ru.habrahabr.blogs.java.OCPJP1.question8;

/**
 * Created by IntelliJ IDEA.
 * User: s_ponomarev
 * Date: 14.01.11
 * Time: 15:26
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    static void method(int... a) {
        System.out.println("int... a");
    }

    static void method(long a, long b) {
        System.out.println("long a, long b");
    }

    static void method(Integer a, Integer b) {
        System.out.println("Integer a, Integer b");
    }

    static void method(int a, int b) {
        System.out.println("int a, int b");
    }

    static void method(int a, Integer b) {
        System.out.println("int a, Integer b");
    }

    static void method(Integer a, int b) {
        System.out.println("Integer a, int b");
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        method(a, b);
    }
}

/**
 * В данном случае вызовется метод, принимающий тип long. Это сделано по той причине, что до 5й джавы не существовало
 * ни методов с переменным количеством параметров, ни автоупаковки. Поэтому в старых версиях джавы вызвался бы метод
 * long как единственный возможный. Поскольку нововведения не должны влиять на выполнение старого кода, вполне логично,
 * что запускается метод long.
 * Если бы у нас было только два метода, «int... a» и «Integer a, Integer b», запустился бы последний. Таким образом,
 * приоритет автоупаковки в Java выше, чем приоритет vararg'ов.
 */