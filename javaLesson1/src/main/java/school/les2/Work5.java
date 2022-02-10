package javaLesson1.src.main.java.school.les2;

public class Work5 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < 6; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }

            System.out.print(arr[i] + " ");
        }


    }
}


