package ru.netology.sqr;

public class SQRService {
    public SQRService() {
    }

    public int calcSqr(int min, int max) {

        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr >= min) {
                if (sqr <= max) {
                    counter++;

                }
            }

        }

        return counter;

    }
}
