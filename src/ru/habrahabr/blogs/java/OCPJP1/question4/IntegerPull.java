package ru.habrahabr.blogs.java.OCPJP1.question4;

/**
 * Created by IntelliJ IDEA.
 * User: s_ponomarev
 * Date: 14.01.11
 * Time: 14:58
 * To change this template use File | Settings | File Templates.
 */
public class IntegerPull {
    public static void main(String... args) {
        Integer a = 120;
        Integer b = 120;
        Integer c = 130;
        Integer d = 130;
        System.out.println(a==b);
        System.out.println(c==d);
    }
}

/**
 * Многим данный вопрос знаком. Для остальных расскажу. Для более эффективного использования памяти, в джаве
 * используются так называемые пулы. Есть строковый пул, Integer pool итд. Когда мы создаем объект не используя операцию
 *  new, объект помещается в пул, и в последствии, если мы захотим создать такой же объект (опять не используя new),
 * новый объект создан не будет, а мы просто получим ссылку на наш объект из пула.
 * Особенность Integer-пула — он хранит только числа, которые помещаются в тип данных byte: от -128 до 127.
 *  Для остальных чисел пул не работает.
 */