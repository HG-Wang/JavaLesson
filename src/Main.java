public class Main {
    {
        System.out.println("This is an instance initializer block");
    }
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("Hello, World!");
    }
}