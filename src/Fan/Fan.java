package Fan;

public class Fan {
    final int SLOW = 1, MEDIUM = 2, HIGH = 3;
    private int speed = SLOW;
    private boolean status;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public boolean isStatus() {
        return status;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan(){
    }

    public String toString(boolean status) {
        if (status) {
            return "Fan{" +
                    "speed = " + speed +
                    ", radius = " + radius +
                    ", color = " + color +
                    ", Fan is on" +
                    '}';
        }
        else {
            return "Fan{" +
                    "radius =" + radius +
                    ", color = " + color +
                    ", Fan is off" +
                    '}';
        }
    }
}
