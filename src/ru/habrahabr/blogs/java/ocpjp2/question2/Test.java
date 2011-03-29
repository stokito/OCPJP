package ru.habrahabr.blogs.java.ocpjp2.question2;

/**
 * Что мы получим в результате выполнения:
 * 1. ошибку компиляции
 * 2. ошибку времени выполнения
 * 3. будет выведено YES
 * 4. будет выведено NO
 * 5. ничего не будет выведено
 */
public class Test {

    public static void main(String[] args) {
        boolean b1 = false;
        boolean b2 = false;
//        if (b2 != b1 = !b2) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
    }

}

/**
 * Тут мы получим ошибку компиляции. Всё просто, вопрос только в приоритете операторов.
 * != имеет более высокий приоритет, соответственно мы получим false = !b2, то есть попытку присвоить значение константе.
 */