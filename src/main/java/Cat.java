public class Cat extends Animal {

    private static int count = 0;

    Cat(String name) {
        this.name = name;
        count ++;
    }

    @Override
    public void running(int distance) {
        if (distance <= 200) {
            System.out.println(name + " пробежал " + distance + " м");
        } else {
            System.out.println(name + " не пробежал " + distance + " м, он устал");
        }
    }

    @Override
    public void swimming(int distance) {
        System.out.println("коты плавать не умеют, " + name + " утонул");
    }

    public static void printCount() {
        System.out.println("Число котов: " + count);
    }
}
