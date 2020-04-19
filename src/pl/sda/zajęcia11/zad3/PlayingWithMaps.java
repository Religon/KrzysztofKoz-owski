package pl.sda.zajęcia11.zad3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PlayingWithMaps {

    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<String, String>();

        dictionary.put("abstract", "sadasdsadsad");

        String definition = dictionary.get("abstract");
        if(definition != null){
            System.out.println(definition);
        }

        Set<String> keywords =  dictionary.keySet();
        Collection<String> definitions = dictionary.values();

    }

}
