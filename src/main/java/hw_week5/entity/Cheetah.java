package hw_week5.entity;

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
