package school.lesson2;

public class Work2 {
    static String plusMinus(int a) {
        if (a >= 0) {
            return "положительное";
        } else {
            return "отрицательное";
        }
    }

    public static void main(String[] args) {
        System.out.println(plusMinus(-10));
    }
}
