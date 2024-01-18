package DataStructure.LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String []args) {
        LinkedList<String> namesList = new LinkedList<String>();

//        LinkedList as a Stack Data Structure
//        namesList.push("koni");
//        namesList.push("Hakdog");
//        namesList.push("Mist");
//        namesList.push("Cady");
//        namesList.pop();

//        LinkedList as a Queue Data Structure
        namesList.offer("koni");
        namesList.offer("Hakdog");
        namesList.offer("Mist");
        namesList.offer("Cady");
//        namesList.poll();

        namesList.add(2, "Senpia");
        namesList.remove("Mist");

        System.out.println(namesList.indexOf("Cady"));

        System.out.println(namesList.peekFirst());
        System.out.println(namesList.peekLast());

        namesList.addFirst("Slythe");
        namesList.addLast("Pseudo");

        System.out.println(namesList);

    }
}
