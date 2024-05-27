package hw_week5._main;

import hw_week5.entity.Cheetah;
import hw_week5.entity.Zookeeper;
import hw_week5.entity.Kangaroo;
import hw_week5.entity.Panda;

public class ZooTheZoo {
    public static void main(String[] args) {
        Zookeeper johnTheZookeper = new Zookeeper();
        Kangaroo kellyTheKangaroo = new Kangaroo();
        Panda paulThePanda = new Panda();
        Cheetah charlieTheCheetah = new Cheetah();

        System.out.println("Сейчас смотритель за животными попросит выполнить команду ГОЛОС");
        System.out.println("------------------------");
        johnTheZookeper.makeVoice(kellyTheKangaroo);
        System.out.println("------------------------");
        johnTheZookeper.makeVoice(paulThePanda);
        System.out.println("------------------------");
        johnTheZookeper.makeVoice(charlieTheCheetah);
        System.out.println("------------------------");

        System.out.println("Сейчас смотритель за животными попросит..");
        System.out.println("------------------------");
        johnTheZookeper.makeWalk(kellyTheKangaroo);
        System.out.println("------------------------");
        johnTheZookeper.makeWalk(paulThePanda);
        System.out.println("------------------------");
        johnTheZookeper.makeWalk(charlieTheCheetah);
        System.out.println("------------------------");

    }
}
