package javaLesson1.src.main.java.school.lesson_3;

public class OutPerson {

    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Иванов И.И.", "Агент рекламный", "example@mail.ru", 1523456, 1000, 35);
        persArray[1] = new Person("Жеглов Г.С.", "Мент", "mus@mail.ru", 6666666, 2000, 60);
        persArray[2] = new Person("Дудь Ю.Ю", "Журналист", "dude@mail.ru", 6464646, 5000, 41);
        persArray[3] = new Person("Бык А.К.", "Музыкант", "music@mail.ru", 6314623, 3000, 25);
        persArray[4] = new Person("Окси М.И.", "Рэпер", "miron@mail.ru", 6996582, 64643, 50);

        for (int i = 0; i < persArray.length; i++)
            if (persArray[i].getAge() > 40)

                System.out.println(persArray[i].toString());
    }
}






