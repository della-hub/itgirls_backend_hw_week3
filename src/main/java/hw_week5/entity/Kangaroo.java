package hw_week5.entity;

public class Kangaroo extends AbstractAnimal {

    @Override
    void voice () {
        System.out.println("Я кенгуру и я говорю ю-хууу");
    }

    @Override
    void walk() {
        System.out.println("Я кенгуру и я высоко прыгаю");
    }

}
