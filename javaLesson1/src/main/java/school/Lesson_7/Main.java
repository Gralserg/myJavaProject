package javaLesson1.src.main.java.school.Lesson_7;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String s1 = "One;Two;Three";
        String s2 = "123;213;123";
        String s3 = "754;1;563";

        try (FileWriter writer = new FileWriter("C:\\Users\\Алексей\\IdeaProjects\\myJavaProject\\javaLesson1\\src\\main\\java\\school\\Lesson_7\\txt.csv", false)) {
            writer.write(s1);
            writer.append('\n');
            writer.write(s2);
            writer.append('\n');
            writer.write(s3);
            writer.append('\n');
            writer.flush();
            FileReader reader = new FileReader("C:\\Users\\Алексей\\IdeaProjects\\myJavaProject\\javaLesson1\\src\\main\\java\\school\\Lesson_7\\txt.csv");
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}


