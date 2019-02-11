package repository;


import enums.ChakraStyle;
import enums.VillageEnum;
import modals.Abilities;
import modals.Ninja;
import modals.Village;

import java.util.ArrayList;
import java.util.List;

public class NinjaRepository {

    private static List<Ninja> ninjas;

    public static List<Ninja> init() {
        ninjas = new ArrayList<>();
        System.out.println("Initializing repo data\n");
        ninjas.add(getNinja("Naruto Uzumaki", VillageEnum.LEAF, "Kakashi Hatake", ChakraStyle.WIND, "Hero of the leaf", null));
        ninjas.add(getNinja("Sasuke Uchiha", VillageEnum.LEAF, "Kakashi Hatake", ChakraStyle.LIGHTNING, null, null));
        ninjas.add(getNinja("Itachi Uchiha", VillageEnum.LEAF, "Kakashi Hatake", null, null, null));
        ninjas.add(getNinja("Hinata Hyuga", VillageEnum.LEAF, "Kakashi Hatake", ChakraStyle.FIRE, "Byakugan princess", null));
        ninjas.add(getNinja("Gaara", VillageEnum.SAND, "Gaara", ChakraStyle.WIND, null, null));
        return ninjas;
    }

    private static Ninja getNinja(String ninjaName, VillageEnum villageName, String kage, ChakraStyle chakraStyle, String title, ArrayList<String> juthsus) {
        return new Ninja(ninjaName, new Village(villageName, kage, 1), new Abilities(chakraStyle
                , title, juthsus));
    }
}
