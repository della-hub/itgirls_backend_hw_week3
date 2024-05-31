package hw_week5.entity;

import hw_week5.util.AbstractAnimal;

public class Cheetah extends AbstractAnimal {

    @Override
    void voice(){
        System.out.println("Я гепард и я рычу");
    }

    @Override
    void walk() {
        super.walk();
        System.out.println("Я гепард, я умею не только ходить, но еще и очень быстро бегать");
    }
}
