package javaLesson1.src.main.java.school.les2;

public class Work8 {
    public static void main(String[] args) {
        int num = 5;
        int[][] arr = new int[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                arr[i][j] = 0;
                {
                    if ((i == j) || (num - i - 1 == j))
                    arr[i][j] = 1;
                    else
                    arr[i][j] = 0;
                }

                System.out.printf("%d  ", arr[i][j]);
            }
            System.out.println();
        }
    }
}







