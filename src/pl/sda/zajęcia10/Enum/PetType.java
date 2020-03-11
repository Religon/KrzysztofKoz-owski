package pl.sda.zajęcia10.Enum;

import java.util.SortedMap;

public enum PetType {
    DOG("wuf wuf"), CAT("miau"), FISH("?"), RABBIT("wiii"), COW("muuu");
    private String sound;

    private PetType(String sound){
        this.sound = sound;
    }

    public void giveSound(){
        System.out.println(sound);
    }

    public static PetType find(String input){
        for(PetType petType : values()){
            if(petType.sound.equals(input)){
                return petType;
            }
        }
        return  null;
    }
}
