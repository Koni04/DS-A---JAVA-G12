package DataStructure.Recursion;

public class Main {
    public static void main(String [] args) {
        walk(5);
        System.out.println(factorial(7));
    }

    public static void walk(int steps) {
        if(steps < 1) return;
        System.out.println("You take a step!");
        walk(steps - 1);
    }

    public static int factorial(int num) {
        if(num < 1 ) return 1; // Base case
        return num * factorial(num - 1);//Recursive
    }
}
