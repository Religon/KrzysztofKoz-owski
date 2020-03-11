package pl.sda.zajęcia10.Enum;

public class EnumExample {
    public static void main(String[] args) {
        PetType type1 = PetType.DOG;
        PetType type2 = PetType.CAT;
        PetType type3 = PetType.DOG;
        /*
        type1.giveSound();
        type2.giveSound();
        type3.giveSound();*/

        PetType[] petTypes = PetType.values();

        for (PetType z: petTypes) {
            z.giveSound();
        }
/*
        PetType pet = PetType.valueOf("COWC");
        pet.giveSound();*/

        PetType p = PetType.find("muuu");
        System.out.println(p);
    }
}
