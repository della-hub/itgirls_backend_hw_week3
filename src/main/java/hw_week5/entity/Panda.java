package hw_week5.entity;

import hw_week5.util.AbstractAnimal;

public class Panda extends AbstractAnimal {

    @Override
    void voice() {
        System.out.println("Я панда и я слишком ленив, чтобы разговаривать");
    }

    @Override
    void walk() {
        System.out.println("Я панда и я слишком ленив, чтобы двигаться");
    }
}
