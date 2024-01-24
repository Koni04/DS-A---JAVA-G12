package DataStructure.Hashtable;

import java.util.Hashtable;

public class Main {
    public static void main(String [] args) {
        Hashtable<Integer, String> table = new Hashtable<>(10);

        table.put(1, "Koni");
        table.put(23, "Mist");
        table.put(434, "Niux");
        table.put(84, "Sus");
        table.put(87, "Komi");

        for (Integer key : table.keySet()) {
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
        }
    }
}
