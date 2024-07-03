package _01._1;

/*
Геттеры и сеттеры для класса Dog
Создать class Dog. У собаки должна быть кличка String name и возраст int age.
Создай геттеры и сеттеры для всех переменных класса Dog.


Requirements:
1. Программа не должна считывать данные с клавиатуры.
2. У класса Dog должна быть переменная name с типом String.
3. У класса Dog должна быть переменная age с типом int.
4. У класса должен быть сеттер для переменной name.
5. У класса должен быть геттер для переменной name.
6. У класса должен быть сеттер для переменной age.
7. У класса должен быть геттер для переменной age.*/

public class Dog {
    private String nickName;
    private int age;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dog" + "\t");
        sb.append("nickName='").append(nickName).append('\'');
        sb.append(", age=").append(age);
        return sb.toString();
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setNickName("Bobik");
        dog.setAge(2);
        System.out.println(dog);
    }
}

