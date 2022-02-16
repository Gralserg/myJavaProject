package javaLesson1.src.main.java.school.Lesson_5;

import java.util.Arrays;
import java.util.List;

//	1.Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
//	2.Задача:
//1.	Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
//2.	Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
//3.	Для хранения фруктов внутри коробки можно использовать ArrayList;
//4.	Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
//5.	Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
//6.	Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
//7.	Не забываем про метод добавления фрукта в коробку.

public class Main {
    public static void main(String[] args) {

        String[] arr = {"baby", "777", "led", "ok"};

        System.out.println("Задача 1.\n" + Arrays.toString(arr));
        swapElements(arr, 0, 3);
        System.out.println(Arrays.toString(arr));

        System.out.println("Задача 2.");

        Box<Orange> orangeBox1 = new Box();
        Box<Orange> orangeBox2 = new Box();
        Box<Apple> appleBox = new Box();

        for (int i = 0; i < 2; i++) {
            orangeBox1.add(new Orange());
        }
        for (int i = 0; i < 4; i++) {
            orangeBox2.add(new Orange());
        }
        for (int i = 0; i < 6; i++) {
            appleBox.add(new Apple());
        }

        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();

        Float orange1Weigth = orangeBox1.getWeight();
        Float orange2Weigth = orangeBox2.getWeight();
        Float appleWeigth = appleBox.getWeight();
        System.out.println("Масса нетто первой коробки апельсинов: " + orange1Weigth + " кг.");
        System.out.println("Масса нетто второй коробки апельсинов: " + orange2Weigth + " кг.");
        System.out.println("Масса нетто коробки яблок: " + appleWeigth + " кг.");

        System.out.println("Равна ли масса первой коробки апельсинов с коробкой яблок? - " + orangeBox1.compare(appleBox));
        System.out.println("Равна ли масса второй коробки апельсинов с коробкой яблок? - " + orangeBox2.compare(appleBox));

        orangeBox1.moveAt(orangeBox2);
        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();
    }

    private static <T> void swapElements(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
