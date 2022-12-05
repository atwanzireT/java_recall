import java.util.HashMap;

class Hashmaps {
    public static void main(String[] args) {
        System.out.println("Learning LinkedHashMaps ...");
        HashMap <String, String> hm = new HashMap<String, String>();

        // putting values into our LinkedHashMap
        hm.put("Ramesh", "Intermediate");
        hm.put("Shiva", "B-Tech");
        hm.put("Santosh", "B-Com");
        hm.put("Asha", "Msc");
        hm.put("Raghu", "M-Tech");

        // accessing hashmap elements
        System.out.println(hm.get("Shiva"));

        // printingthe hashmap
        System.out.println(hm);

    }
}
