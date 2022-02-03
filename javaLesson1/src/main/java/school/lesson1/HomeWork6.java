package school.lesson1;

public class HomeWork6 {
    public static void main(String[] args) {
        printTreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void printTreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }
    static void checkSumSign() {
        int a = 2;
        int b = -5;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 100) {
            System.out.println("Зеленый");
        } else {
            System.out.println("Желтый");
        }
    }
    static void compareNumbers() {
        int a = 101;
        int b = 150;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}
