package ru.habrahabr.blogs.java.ocpjp1.question3;

/**
 Что произойдет при попытке выполнения данного кода:

    1. Будет выведено «Himalaya» но НЕ будет выведено «Getting Name „
    2. Будет выведено “Getting Name » и «Himalaya»
    3. Ничего не будет выведено
    4. Будет выброшен NullPointerException
    5. Будет выведено «Getting Name », а потом выброшено NullPointerException
 */
public class Mountain {
  static String name = "Himalaya";
  static Mountain getMountain() {
    System.out.println("Getting Name ");
    return null;
  }
  public static void main(String[ ] args) {
    System.out.println( getMountain().name );
  }
}

/**
 * Тут всё просто: для всех static полей и методов компилятор заменяет название объекта на название класса, и во время
 * выполнения уже не имеет никакого значения, была ссылка нулевой или нет.
 * То есть mountain.name меняется на Mountain.name. Вообще рекомендуют при обращении к статик-членам класса всегда
 * ссылаться на них именно через имя класса, а не объекта.
*/