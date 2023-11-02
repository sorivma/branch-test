public class Main {
    public static void main(String[] args) {
        System.out.println("Это добавлено в ветке main");
        mainDude();
    }

    private static void mainDude() {
        System.out.println("ama main void dude");
        System.out.println("Это написано в dev");
        doStuff();
        doAnotherStuff();
    }

    public static void doStuff() {
        System.out.println("doin stuff");
        System.out.println("argh");
    }

    public static void doAnotherStuff() {
        System.out.println("another stuff");
        System.out.println("oooh");
    }
}
