package Fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setStatus(true);
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setColor("Blue");
        fan2.setStatus(false);

        System.out.println(fan1.toString(fan1.isStatus()));
        System.out.println(fan2.toString(fan2.isStatus()));

    }
}
