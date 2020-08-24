package ru.geekbrains.javacore1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // ЗАДАНИЕ 6

        System.out.println();
        System.out.println();
        System.out.println("ЗАДАНИЕ 6");
        System.out.println();

        int[] arr6 = { 3, 6, 5, 4, 3, 4, 3, 5, 9 };

        System.out.println("ИСХОДНЫЙ МАССИВ:");
        System.out.println(Arrays.toString(arr6));
        System.out.println();

        //System.out.println("Результат массива: " + checkArr (arr6));

        checkArr (arr6);

    }


    static void checkArr (int [] arr) {

        int sum = 0;
        int sum1 = arr [0];

        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];
        }


        System.out.println("Для информации. Сумма элементов массива: " + sum);
        System.out.println();

        for (int i = 0; i < arr.length-1; i++) {

            if (sum1 == (sum - sum1)) {

                System.out.println ("Есть баланс после элемента номер " + i + " (начиная с нулевого элемента). Дальше не проверялось.");
                System.out.println();
                System.out.println ("Сумма каждой равной стороны массива равна " + sum1 + ".");
                break;
            }

            else sum1 = sum1 + arr[i+1];

        }

        System.out.println();
        
    }


    }

