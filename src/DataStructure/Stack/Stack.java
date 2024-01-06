package DataStructure.Stack;
import java.util.*;
public class Stack
{
    public static void main(String[]args)
    {

        Stackclass s = new Stackclass();
        Scanner in = new Scanner(System.in);

        do {

            System.out.println("\n******** MENU *******");
            System.out.println("\n1.PUSH");
            System.out.println("\n2.POP");
            System.out.println("\n3.PEEK");
            System.out.println("\n4 IS EMPTY");
            System.out.println("\n5. Display");
            System.out.println("\n6. Search");
            System.out.println("\n7.Exit");
            System.out.print("\n enter ur choice : ");

            switch(in.nextInt())
            {
                case 1:
                    System.out.print("\nenter the value ");
                    s.push(in.next());
                    break;
                case 2:
                    System.out.println("\n popped element : "+ s.pop());
                    break;
                case 3:
                    System.out.println("\n top element : "+ s.peek());
                    break;
                case 4: System.out.println("\n is empty : "+ s.isEmpty());
                    break;
                case 5: System.out.println(s.display());
                    break;
                case 6: System.out.println("Enter a value: ");
                    String val = in.next();
                    int index = s.search(val);

                    if (index != -1) {
                        System.out.println("Item found at index: " + index);
                    } else {
                        System.out.println("Item not found");
                    }
                    break;
                case 7: System.exit(0);
                    break;
                default: System.out.println("\n Error Choice!");
                    break;
            }
            System.out.println("\n 1/2 do u want to continue... ");
        }
        while(in.nextInt() == 1);

    }
}