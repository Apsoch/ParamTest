package ru.netology.bonus.ru;

public class SQRService {
  public int calculateNumberSquares (int upperBorder, int bottomBorder) {
    int counter = 0;
    for (int i = 10; i <= 99; i++) {
      if (i * i >= upperBorder && i * i <= bottomBorder) {
        counter++;
      }

    }
    return counter;

  }
}