package _02._1;

/*
Создать в цикле по 50 000 объектов Cat и Dog.
(Java-машина должна начать уничтожать неиспользуемые, и метод finalize хоть раз да вызовется).


Requirements:
1. В классе Cat должен быть void метод finalize.
2. В классе Dog должен быть void метод finalize.
3. Метод finalize класса Cat должен выводить на экран "A Cat was destroyed".
4. Метод finalize класса Dog должен выводить на экран "A Dog was destroyed".
5. Метод main должен создавать 50000 объектов типа Cat и 50000 объектов типа Dog.*/

public class Solution {
    public static void main(String[] args) throws Throwable {
        for (int i = 1; i <= 50_000; i++) {
            Cat cat = new Cat();
            System.out.println("Cat №" + (i) + " was created");
            cat.finalize();

        }
        System.out.println("**************************************");
        for (int i = 1; i <= 50_000; i++) {
            Dog dog = new Dog();
            System.out.println("Dog №" + (i) + " was created");
            dog.finalize();
        }
    }
}

class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Dog was destroyed");
    }
}

