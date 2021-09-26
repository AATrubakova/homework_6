public abstract class Animal {

    protected String name;
    private static int count = 0;

    Animal() {
        count ++;
    }

    public abstract void running(int distance);

    public abstract void swimming(int distance);

    public static void printCount() {
        System.out.println("Число животных: " + count);
    }
}
