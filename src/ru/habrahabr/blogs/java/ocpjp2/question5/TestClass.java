package ru.habrahabr.blogs.java.ocpjp2.question5;

/**
 * В результате его выполнения мы получим:
 * 1. In Pooler
 * 2. In Threader
 * 3. код не скомпилируется
 * 4. ошибку времени выполнения
 */
public class TestClass {

    public static void main(String[] args) {
        Threader t = new Threader();
        Thread h = new Pooler(t);
        h.start();
    }

}

/**
 * Известно, что при создании объектов класса Thread в конструктор можно передавать Runnable объект, метод run()
 * которого будет выполняться в отдельном потоке. Поэтому ожидаемый ответ — вывод «In Threader».
 * Причина нестандартного поведения — это метод run() в классе Pooler. Переопределив метод run(), мы тем самым потеряли
 * дефолтное поведение класса Thread.
 */
