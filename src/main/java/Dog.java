public class Dog extends Animal {

    private static int count = 0;

    Dog(String name) {
        this.name = name;
        count ++;
    }

    @Override
    public void running(int distance) {
        if (distance <= 500) {
            System.out.println(name + " пробежал " + distance + " м");
        } else {
            System.out.println(name + " не пробежал " + distance + " м, он устал");
        }
    }

    @Override
    public void swimming(int distance) {
        if (distance <= 10) {
            System.out.println(name + " проплыл " + distance + " м");
        } else {
            System.out.println(name + " не проплыл " + distance + " м, утонул");
        }
    }

    public static void printCount() {
        System.out.println("Число собак: " + count);
    }
}
