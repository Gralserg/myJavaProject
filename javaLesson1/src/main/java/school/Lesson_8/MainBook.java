package javaLesson1.src.main.java.school.Lesson_8;

public class MainBook {
    public static void main(String[] args) {
        PhoneSpr phonebook = new PhoneSpr();

        phonebook.add(375296464, "Агутин");
        phonebook.add(375646488, "Зеленский");
        phonebook.add(375623488, "Зеленский");
        phonebook.add(375646899, "Зеленский");
        phonebook.add(375646199, "Путин");
        phonebook.add(375464612, "Байден");
        phonebook.add(375461495, "Байден");

        phonebook.get("Зеленский");
        phonebook.get("Агутин");
        phonebook.get("Сталин");
    }
}
