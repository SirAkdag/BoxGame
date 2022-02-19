public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Ali",15,100,85,0);
        Fighter f2 = new Fighter("Veli",13,101,75,0);
        Match r1 = new Match(f1,f2,65,105);
        r1.run();
    }
}
