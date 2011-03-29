package ru.habrahabr.blogs.java.OCPJP1.question5.testPackage;

/*
* Прошлый вопрос уже когда-то поднимался на хабре, поэтому этот вопрос для тех, кому был не интересен предыдущий:
* В результате мы получим:
*  1. false true true false true
*  2. false false true false true
*  3. true true true true true
*  4. true true true false true
*  5. Все ответы неверны
 */

class Test {
    public static void main(String[] args) {
        String hello = "Hello";
        System.out.print((ru.habrahabr.blogs.java.OCPJP1.question5.testPackage.Other.hello == hello) + " ");
        System.out.print((ru.habrahabr.blogs.java.OCPJP1.question5.other.Other.hello == hello) + " ");
        System.out.print((hello == ("Hel" + "lo")) + " ");
        String lo = "lo";
        System.out.print((hello == ("Hel" + lo)) + " "); // runtime
        final String llo = "llo";
        System.out.print((hello == ("Hel" + lo)) + " "); // compiletime
        System.out.println(hello == ("Hel" + lo).intern());
    }
}

class Other {
    static final String hello = "Hello";
}

/**
 * Всё тот же строковый пул, но с нюансами.
 * Итак, 6 малоизвестных фактов о строках в Java:
 * 1. Строковые литералы в одном классе представляют собой ссылки на один и тот же объект.
 * 2. Строковые литералы в разных классах, но в одном пакете представляют собой ссылки на один и тот же объект.
 * 3. Строковые литералы в разных классах и разных пакетах всё равно представляют собой ссылки на один и тот же объект )).
 * 4. Строки, получающиеся сложением констант, вычисляются во время компиляции и далее смотри пункт первый.
 * 5. Строки, создаваемые во время выполнения НЕ ссылаются на один и тот же объект. (поэтому четвертый вывод — false)
 * 6. Метод intern в любом случае возвращает объект из пула, вне зависимости от того, когда создается строка, на этапе компиляции или выполнения. (Поэтому последний вывод — true).
 * Более подробно эта тема описана в пункте 3.10.5 спецификации Java.
 */