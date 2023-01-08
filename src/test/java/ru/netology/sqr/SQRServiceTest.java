package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void rangeWithZeroSquareRoot() {

        SQRService service = new SQRService();

        int actual = service.calcSqr(10, 99);
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void rangeWithOneSquareRoot() {

        SQRService service = new SQRService();

        int actual = service.calcSqr(10, 100);
        int expected = 1;

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void maximumNumberOfSquareRoots() {

        SQRService service = new SQRService();

        int actual = service.calcSqr(10, 9801);
        int expected = 90;

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void sqrNegativeNumber() {

        SQRService service = new SQRService();

        int actual = service.calcSqr(-9801, -10);
        int expected = 0;

        Assertions.assertEquals(expected, actual);


    }

}