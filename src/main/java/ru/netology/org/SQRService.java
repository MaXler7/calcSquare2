package ru.netology.org;

public class SQRService {

    public int calcSquare(int lowerlimit, int upperlimit) {
        int counter = 0;
        for (int i = 10; i < 100; i++) {
            if (i * i > lowerlimit && i * i < upperlimit) {
                counter++;
            }
        }
        return counter;
    }

}
