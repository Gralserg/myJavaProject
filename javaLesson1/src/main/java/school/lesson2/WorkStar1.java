package school.lesson2;

public class WorkStar1 {
    static boolean visGod(int a) {

        if (((a % 4 == 0) && (a % 100 != 0)) || (a % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Год высокосный - " + visGod(2022));
    }
}

