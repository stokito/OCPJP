package ru.habrahabr.blogs.java.ocpjp2.question6;

/**
 * Варианты ответа (ВОЗМОЖНО НЕСКОЛЬКО ПРАВИЛЬНЫХ ОТВЕТОВ):
 * 1. будет выведено «habr»
 * 2. Из класса Habr нельзя получить доступ к значению VALUE
 * 3. Код будет работоспособным, только если удалить VALUE в одном из интерфейсов
 * 4. код не скомпилируется
 */
public class Habr implements I1, I2 {

    public void m() {
        System.out.println("habr");
    }

    public static void main(String[] args) {
        Habr habr = new Habr();
        habr.m();
    }
}

/**
 * Данный код абсолютно работоспособен. То, что в обоих интерфейсах присутствует одинаковый метод m() не создает проблем,
 * так как реализация в любом случае будет одна. Сложнее с полем VALUE. Мы не можем напрямую обращаться к нему,
 * так как возникнет неоднозначность. Но это можно сделать, например, так:
 * ( (I1) habr).VALUE;
 * После приведения объекта к одному из интерфейсов, мы получаем доступ к полям, которые ранее не могли использовать.
 */