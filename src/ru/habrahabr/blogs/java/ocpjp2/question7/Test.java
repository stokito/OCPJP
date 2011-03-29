package ru.habrahabr.blogs.java.ocpjp2.question7;

/**
 * Выбросит ли данный код NullPointerException?
 */
public class Test {

    public static void main(String[] args) throws Exception {
        int[] a = null;
        int i = a[m()];
    }

    public static int m() throws Exception {
        throw new Exception("Another Exception");
    }

}

/**
 * NullPointerException в данном случае не возникнет, так как любое действие с массивом, в том числе проверка
 * существования объекта происходит только после того, как будет полностью рассчитан индекс элемента.
 * Ситуация становится интереснее, если мы присваиваем что-либо элементу массива. Например дан код:
 * int i = 0 ;
 * int[] arr = {1, 2} ;
 * arr[i] = i = 6 ;
 * Как правило, множественные операции присваивания рассчитываются справа налево. Но индексы — исключение.
 * В данном случае сначала будет вычислен индекс (arr[0]), и только потом переменной i присвоится новое значение.
 */