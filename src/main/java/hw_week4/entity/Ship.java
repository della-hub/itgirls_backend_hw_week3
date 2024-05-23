package hw_week4.entity;

import hw_week4.util.Swimming;

public class Ship implements Swimming {
    @Override
    public void swim() {
        fuel();
        System.out.println("I am a boat and I can swim");

    }
    private void fuel() {
        System.out.println("I am a boat and I need fuel to swim");
    }
}
