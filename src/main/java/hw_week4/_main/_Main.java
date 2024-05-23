package hw_week4._main;

import hw_week4.entity.Fish;
import hw_week4.entity.Ship;
import hw_week4.util.Swimmer;

public class _Main {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Ship ship = new Ship();

        Swimmer swimmer = new Swimmer();

        swimmer.doSwim(fish);
        swimmer.doSwim(ship);
    }
}
