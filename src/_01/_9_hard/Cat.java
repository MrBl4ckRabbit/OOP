package _01._9_hard;

/*
Реализовать метод fight
Реализуй метод boolean fight(Cat anotherCat):
продумай механизм драки котов в зависимости от их веса, возраста и силы.
Сравни каждый критерий по отдельности, чтобы победителем был тот,
у кого были лучшие показатели по большинству критериев.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true,
если выиграли и false - если проиграли.
Если ничья и никто не выиграл, возвращаем false.


Requirements:
1. Класс Cat должен содержать конструктор без параметров.
2. Класс Cat должен содержать всего три поля: age, weight и strength. Поля должны быть публичные.
3. В классе Cat должен быть метод fight.
4. В методе fight реализовать механизм драки котов в зависимости от их веса, возраста и силы согласно условию.
5. Метод должен возвращать одно и тоже значение, если мы деремся с одним и тем же котом.
6. Если некий кот1 выигрывает у кота кот2, то кот2 должен проигрывать коту кот1.*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        if (this.age > anotherCat.age && this.weight > anotherCat.weight && this.strength > anotherCat.strength) {
            return true;
        } else if (this.age < anotherCat.age && this.weight < anotherCat.weight && this.strength < anotherCat.strength) {
            return false;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.age = 3;
        cat1.weight = 5;
        cat1.strength = 7;

        Cat cat2 = new Cat();
        cat2.age = 4;
        cat2.weight = 6;
        cat2.strength = 8;

        System.out.println("Cat1 vs Cat2: " + cat1.fight(cat2));
    }
}

