import enums.ChakraStyle;
import enums.VillageEnum;
import modals.Ninja;
import repository.NinjaRepository;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Ninja> repo = NinjaRepository.init();
        ChakraStyle chakraStyle = ChakraStyle.WIND;
        VillageEnum village = VillageEnum.LEAF;
/*
//      getting ninjas with abilities

        repo.stream().filter(NinjaPredicates::hasAbilities).forEach(System.out::println);
*/

/*
//      get if any ninja exists

        boolean hasNinjaWithAbilities = repo.stream().anyMatch(NinjaPredicates::hasAbilities);

        System.out.println(hasNinjaWithAbilities);
*/

/*
//      ninjas of a given Chakra Style

        repo.stream().filter(NinjaPredicates.checkIfNinjaHasAbilities())
                .filter(NinjaPredicates.checkIfNinjaChakraStyleIs(chakraStyle))
                .forEach(System.out::println);
*/

/*//    ninjas of a given village and chakraStyle

        repo.stream().filter(NinjaPredicates.checkIfNinjaHasAbilities())
                .filter(NinjaPredicates.checkIfNinjaChakraStyleIs(chakraStyle).and(NinjaPredicates.checkIfNinjaIsOfVillage(village)))
                .forEach(System.out::println);
*/

/*
//      chakraStyles of ninjas of given village
        repo.stream().filter(NinjaPredicates.checkIfNinjaIsOfVillage(village))
                .map(Ninja::getAbilities)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .map(Abilities::getChakraStyle)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .forEach(System.out::println);
*/


    }
}