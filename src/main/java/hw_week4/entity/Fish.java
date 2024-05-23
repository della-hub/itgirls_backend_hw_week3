package hw_week4.entity;

import hw_week4.util.Swimming;

public class Fish implements Swimming {
    @Override
    public void swim() {
        worms();
        System.out.println("I am a little swimmer");
    }
    private void worms() {
        System.out.println("I am a fish and I eat worms");
    }
}
