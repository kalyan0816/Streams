package predicates;

import enums.ChakraStyle;
import enums.VillageEnum;
import modals.Ninja;

import java.util.function.Predicate;

public class NinjaPredicates {

    public static Predicate<Ninja> checkIfNinjaHasAbilities() {
        return ninja -> ninja.getAbilities().isPresent();
    }

    public static Predicate<Ninja> checkIfNinjaChakraStyleIs(ChakraStyle chakraStyle) {
        return ninja -> ninja.getAbilities().get().getChakraStyle().get().equals(chakraStyle);
    }

    public static Predicate<? super Ninja> checkIfNinjaIsOfVillage(VillageEnum village) {
        return ninja -> ninja.getVillage().get().getVillageName().get().equals(village);
    }
}
