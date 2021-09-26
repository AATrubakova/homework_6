public class Application {
    public static void main(String[] args) {
        Dog bobik = new Dog("Бобик");
        Dog sharik = new Dog("Шарик");
        Dog pushok = new Dog("Пушок");

        Cat leo = new Cat("Леопольд");
        Cat murzik = new Cat("Мурзик");
        Cat vasya = new Cat("Вася");

        bobik.running(100);
        sharik.running(500);
        pushok.running(550);

        bobik.swimming(10);
        sharik.swimming(50);
        pushok.swimming(55);

        leo.running(150);
        murzik.running(250);
        vasya.running(100);

        murzik.swimming(1);

        Animal.printCount();
        Dog.printCount();
        Cat.printCount();
    }
}
