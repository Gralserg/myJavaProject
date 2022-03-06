package javaLesson1.src.main.java.school.Lesson_8;

import java.util.*;

public class Arr1 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("dsfgdf");
        words.add("aasd");
        words.add("a");
        words.add("jkf");
        words.add("asf");
        words.add("kyhu");
        words.add("AAS");
        words.add("aasd");
        words.add("sdf");
        words.add("13213");
        words.add("asdanh");
        words.add("aaaa");
        words.add("bbbb");
        words.add("cccccccc");
        words.add("354gh");
        words.add("kjld");
        words.add("dsfgdf");

        System.out.println("Исходный массив:");
        words.forEach(System.out::println);

        System.out.println("\nУникальный список:");
        Set<String> unique = new HashSet<>(words);
        unique.forEach(System.out::println);

        System.out.println("\nКоличество слов:");
        Map<String, Integer> wordsCount = new HashMap<>();
        for (String s : words) {
            wordsCount.put(s, wordsCount.getOrDefault(s, 0) + 1);
        }
        wordsCount.entrySet().forEach(System.out::println);
    }
}


