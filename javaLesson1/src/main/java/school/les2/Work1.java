package javaLesson1.src.main.java.school.les2;

public class Work1 {

    static boolean summaTrue(int a, int b) {


        return (a + b >= 10 && a + b <= 20);

    }

    public static void main(String[] args) {
        System.out.println(summaTrue(5, 10));
    }
}
