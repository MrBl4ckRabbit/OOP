package _01._6;

/*
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name (String), age (int), address (String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате: name + " " + age + " " + address


Requirements:
1. В классе Solution создай public static класс Man.
2. В классе Solution создай public static класс Woman.
3. Класс Man должен содержать переменные: name(String), age(int) и address(String).
4. Класс Woman должен содержать переменные: name(String), age(int) и address(String).
5. У классов Man и Woman должны быть конструкторы, принимающие параметры с типами String, int и String.
6. Конструкторы должны инициализировать переменные класса.
7. В методе main необходимо создать по два объекта каждого типа.
8. Метод main должен выводить созданные объекты на экран в указанном формате.*/

import java.util.StringJoiner;

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Tom", 25, "Somewhere");
        Man man2 = new Man("Ben", 32, "Somewhere else");
        System.out.println(man1);
        System.out.println(man2);

        Woman woman1 = new Woman("Alice", 22, "Near warm sea");
        Woman woman2 = new Woman("Masha", 18, "In the center of Siberia");
        System.out.println(woman1);
        System.out.println(woman2);
    }

    public static class Man {
        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", Man.class.getSimpleName() + "\t", "")
                    .add("name='" + name + "'")
                    .add("age=" + age)
                    .add("address='" + address + "'")
                    .toString();
        }
    }

    public static class Woman {
        private String name;
        private int age;
        private String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", Woman.class.getSimpleName() + "\t", "")
                    .add("name='" + name + "'")
                    .add("age=" + age)
                    .add("address='" + address + "'")
                    .toString();
        }
    }
}

