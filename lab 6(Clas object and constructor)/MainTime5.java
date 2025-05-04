// Time.java
class Time {
    private int hours, minutes, seconds;

    public Time(int h, int m, int s) {
        hours = h;
        minutes = m;
        seconds = s;
        normalize();
    }

    private void normalize() {
        minutes += seconds / 60;
        seconds = seconds % 60;
        hours += minutes / 60;
        minutes = minutes % 60;
    }

    public Time add(Time t) {
        return new Time(this.hours + t.hours, this.minutes + t.minutes, this.seconds + t.seconds);
    }

    public Time subtract(Time t) {
        int totalSec1 = this.hours * 3600 + this.minutes * 60 + this.seconds;
        int totalSec2 = t.hours * 3600 + t.minutes * 60 + t.seconds;
        int diff = Math.abs(totalSec1 - totalSec2);

        int h = diff / 3600;
        int m = (diff % 3600) / 60;
        int s = diff % 60;

        return new Time(h, m, s);
    }

    public void display() {
        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
    }
}

// MainTime.java
public class MainTime5{
    public static void main(String[] args) {
        Time t1 = new Time(2, 45, 50);
        Time t2 = new Time(1, 30, 35);

        System.out.print("Time 1: ");
        t1.display();

        System.out.print("Time 2: ");
        t2.display();

        Time sum = t1.add(t2);
        System.out.print("Sum: ");
        sum.display();

        Time diff = t1.subtract(t2);
        System.out.print("Difference: ");
        diff.display();
    }
}