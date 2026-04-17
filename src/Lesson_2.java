import java.util.Arrays;

public class Lesson_2 {

    public static void main(String[] args) {
        printThreeWords();//Вызов метода - Задание_1
        checkSumSign(); //Вызов метода - Задание_2
        printColor(); //Вызов метода - Задание_3
        compareNumbers(); //Вызов метода - Задание_4
        System.out.println(checkSumNumberInBetween(2, 7));//Вызов метода и вывод на печать - Задание_5
        checkNumber(-10); //Вызов метода - Задание_6
        System.out.println(checkNumberIsNegative(-33));//Вызов метода и вывод на печать - Задание_7
        printStringValueCountTimes("Hello world!", 5);//Вызов метода - Задание_8
        System.out.println(checkYear(2026));//Вызов метода и вывод на печать - Задание_9
        arrayOne(); //Вызов метода с массивом по Заданию 10
        arrayTwo();//Вызов метода с массивом по Заданию 11
        arrayThree(); //Вызов метода с массивом по Заданию 12
        arrayFour(); //Вызов метода с массивом по Заданию 13
        int[] myArr = arrayFive (5, 10);//Вызов метода - Задание_14
        System.out.println(Arrays.toString(myArr)); //Вывод на печать - Задание_14
    }
    //Задание_1
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    //Задание_2
    public static void checkSumSign() {
        int a = 5;
        int b = 6;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    //Задание_3
    public static void printColor(){
        int value = 11;
        if (value <= 0){
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    //Задание_4
    public static void compareNumbers(){
        int a = 14;
        int b = 15;
        if(a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    //Задание_5
    public static boolean checkSumNumberInBetween(int a, int b) {
        int c = a + b;
        return c >= 10 && c <= 20;
    }
    //Задание_6
    public static void checkNumber(int x) {
        if (x >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    //Задание_7
    public static boolean checkNumberIsNegative(int a) {
        return a < 0;
    }
    //Задание_8
    public static void printStringValueCountTimes(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }
    //Задание_9
    public static boolean checkYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
    //Задание 10
    public static void arrayOne(){
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr)); //Выводим весь массив
    }
    //Задание_11
    public static void arrayTwo(){
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr)); //Выводим весь массив
    }
    //Задание_12
    public static void arrayThree(){
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr)); //Выводим весь массив
    }
    //Задание_13
    public static void arrayFour() {
        int a = 5; //Размер 5 строк и 5 столбцов
        int[][] arr = new int[a][a];
        for (int i = 0; i < a; i++) {
            arr[i][i] = 1;
            arr[i][a - 1 - i] = 1;
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(arr[i][j] + " "); //Вывод на печать
            }
            System.out.println(); // Перевод каретки на новую строку
        }
    }
    //Задание_14
    public static int[] arrayFive(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}