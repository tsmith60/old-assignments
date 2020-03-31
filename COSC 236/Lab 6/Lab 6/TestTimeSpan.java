//Ted Smith III   Cosc 236 Section 003
//  Lab 6 Problem 3

public class TestTimeSpan {
    public static void main(String[] args) {
        TimeSpan t1 = new TimeSpan();
        System.out.println(t1 + " is " + t1.getTotalHours() + " hours");

        t1.add(3, 45);
        System.out.println(t1 + " is " + t1.getTotalHours() + " hours");

        t1.add(2, 30);
        System.out.println(t1 + " is " + t1.getTotalHours() + " hours");

        TimeSpan t2 = new TimeSpan(0, 55);
        t1.add(t2);
        System.out.println(t1 + " is " + t1.getTotalHours() + " hours");

        TimeSpan t3 = new TimeSpan(7, 10);
        TimeSpan t4 = new TimeSpan(4, 10);
        System.out.println(t1 + " equals " + t3 + "? " + t1.equals(t3));
        System.out.println(t1 + " equals " + t4 + "? " + t1.equals(t4));
    }
}
