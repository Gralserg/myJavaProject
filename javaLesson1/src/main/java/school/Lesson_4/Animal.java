package javaLesson1.src.main.java.school.Lesson_4;

public class Animal {
    protected String name;
    protected String type;
    protected int maxRun;
    protected int maxSwim;
    protected int eat;


    public Animal(String name) {
        this.name = name;


    }



    public void run(int dist) {
        if (this.maxRun >= dist)
            System.out.println(this.type + " " + this.name + " пробежал " + dist + " м.");
        else System.out.println(this.type + " " + this.name + " не может столько пробежать");
    }

    public void swim(int dist) {
        if (this.maxSwim >= dist)
            System.out.println(this.type + " " + this.name + " проплыл " + dist + " м.");
        else System.out.println(this.type + " " + this.name + " не может столько проплыть");
    }


}


