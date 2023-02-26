package ru.netology.stat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatServiceTest {

  @Test
  void shouldCalculateSum() {
    StatService service = new StatService();

    int[] managerSales = {25, 10, 40, 39, 101, 55};
    int expected = 270;

    int actual = service.calculateSum(managerSales);

    assertEquals(expected, actual);
  }
}