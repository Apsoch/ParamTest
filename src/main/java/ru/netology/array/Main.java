package ru.netology.array;

public class Main {
  public static void main(String[] args) {
    String apple = "Яблоко";
    String pear = "Груша";
    String pineapple = "Ананас";

    String[] fruits = {apple, pear, pineapple};
    //System.out.println(fruits[1]);
    fruits[1] = "Киви";
   // System.out.println(fruits[1]);

    for (String fruit: fruits) {
      System.out.println(fruit);
    }
    System.out.println("Вышли из цикла");
  }
}
