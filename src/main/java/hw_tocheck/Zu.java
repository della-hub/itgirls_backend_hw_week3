package hw_tocheck;


public class Zu {
    public static void main(String[] args) {
        Zukeeper john = new Zukeeper();
        Butterfly kelly = new Butterfly();


        System.out.println("Сейчас смотритель за животными попросит выполнить команду ГОЛОС");
        System.out.println("------------------------");
        john.makeVoice(kelly);
        System.out.println("------------------------");
    }
}
