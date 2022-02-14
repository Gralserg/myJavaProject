package javaLesson1.src.main.java.school.Lesson_4;

public class Cat extends Animal {
    public Cat(String name) {

        super(name);


        this.maxRun = 200;
        this.type = "Кот";
        this.eat = 10;


    }

    @Override
    public void swim(int dist) {
        System.out.println("Кот не умеет плавать");
    }
}
