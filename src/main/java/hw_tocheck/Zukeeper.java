package hw_tocheck;

public class Zukeeper {

    public void makeVoice(AbstractAnimal abstractAnimal) {
        System.out.println("Я смотритель за животными в зоопарке и сейчас я попрошу животное выполнить команду ГОЛОС");
        abstractAnimal.voice();
    }
    public void makeWalk(AbstractAnimal abstractAnimal) {
        System.out.println("Я смотритель за животными и сейчас я поведу животное на прогулку");
        abstractAnimal.walk();
    }
}
