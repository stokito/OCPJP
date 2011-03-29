package ru.habrahabr.blogs.java.ocpjp2.question3;

/**
 * В результате будет выведено:
 * 1. new old
 * 2. old new
 * 3. new new
 * 4. old old
 * 5. код не скомпилируется
 */
public class Test {

    public static void main(String[] args) {
        String s = "old";
        print(s, s = "new");
    }

    static void print(String s1, String s2) {
        System.out.println(s1 + " " + s2);
    }

}

/**
 * Аргументы методов вычисляются слева направо и то, что во втором аргументе мы присваиваем s новое значение уже ничего
 * не меняет, так как первый аргумент уже вычислен. Если вычисление одного из аргументов заканчивается неудачно,
 * все остальные аргументы расчитываться не будут вообще.
*/