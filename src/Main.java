public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Emre",15,100,85,30);
        Fighter f2 = new Fighter("ismail",13,101,75,20);
        Match r1 = new Match(f1,f2,65,105);
        r1.run();
    }
}
