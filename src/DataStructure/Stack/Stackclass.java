package DataStructure.Stack;

public class Stackclass
{
    String[] name;
    int top;

    Stackclass() {
        name = new String[100];
        top = -1;
    }

    void push(String x) {
        if (top == name.length - 1)
            System.out.println("overflow");
        else
            name[++top] = x;
    }

    String pop() {
        if (top == -1) {
            System.out.println("underflow");
            return null;
        } else
            return name[top--];
    }

    boolean display() {
        for (int i = 0; i <= top; i++)
            System.out.print(name[i] + " ");
        System.out.println();
        return false;
    }

    boolean isEmpty() {
        return top == -1;
    }

    String peek() {
        if (top == -1)
            return null;
        return name[top];
    }
}
