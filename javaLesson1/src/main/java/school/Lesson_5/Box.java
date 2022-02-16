package javaLesson1.src.main.java.school.Lesson_5;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    public List<T> getList() {
        return list;
    }

    private final List<T> list;

    public Box() {
        list = new ArrayList<>();
    }

    void add(T obj) {
        list.add(obj);
    }

    void moveAt(Box<T> box) {
        box.getList().addAll(list);
        list.clear();
    }

    void info() {
        if (list.isEmpty()) {
            System.out.println("Коробка пуста");
        } else {
            System.out.println("В коробке " + list.get(0).toString() + " - " + list.size() + " шт.");
        }
    }

    float getWeight() {
        if (list.isEmpty()) {
            return 0;
        } else {
            return list.size() * list.get(0).getWeight();
        }
    }

    boolean compare(Box<? extends Fruit> box) {
        return this.getWeight() == box.getWeight();
    }
}
