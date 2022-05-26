package ru.netology.org;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @Test
    public void shouldCalcSquare() {
        SQRService Service = new SQRService();
        int lowerlimit = 200;
        int upperlimit = 300;
        int expected = 3;


        int actual = Service.calcSquare(lowerlimit, upperlimit);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcSquareMore() {
        SQRService Service  = new SQRService();
        int lowerlimit = 100;
        int upperlimit =  2000_00;
        int expected = 3;


        int actual = Service.calcSquare(lowerlimit, upperlimit);

        assertEquals(expected, actual);


    }



    @Test
    public void shouldalcSquareBrokenTest() {
        SQRService Service  = new SQRService();
        int lowerlimit = 200;
        int upperlimit = 300;
        int expected = 4;


        int actual = Service.calcSquare(lowerlimit, upperlimit);

        assertEquals(expected, actual);
    }


    }