package pl.sda.zajęcia11.zad4;

import java.util.HashMap;
import java.util.Map;

public class zad4 {
    public static void main(String[] args) {
        Map<Long, String> names = new HashMap<>();

        names.put(1L , "krzysztof");
        names.put(2L, "Agnieszka");
        names.put(3L, "Ala");
        names.put(4L, "Jan");

        for (String name: names.values()) {
            if(name.startsWith("A")){
                System.out.println(name);
            }
        }

        for(Map.Entry<Long, String> entry: names.entrySet()){
            if("Jan".equals(entry.getValue())){
                System.out.println("ID: " + entry.getKey() + " to Jan");
            }
        }
    }
}
