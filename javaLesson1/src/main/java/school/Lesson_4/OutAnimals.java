package javaLesson1.src.main.java.school.Lesson_4;

public class OutAnimals {

    public static void main(String[] args) {
        Cat cat = new Cat("Пушок");
        Dog dog = new Dog("Амур");

        dog.run(400);
        dog.swim(5);

        System.out.println();


        cat.run(150);
        cat.swim(5);


    }

}
