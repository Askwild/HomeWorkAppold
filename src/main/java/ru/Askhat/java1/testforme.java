package ru.Askhat.java1;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;

public class testforme {


    public static void main(String[] args) {
    }


    //1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static boolean doThree(int a, int b) {
        System.out.println("\nЗадание 3.");
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }

}
