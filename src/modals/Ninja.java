package modals;

import java.util.Optional;
import java.util.StringJoiner;

public class Ninja {

    private String name;
    private Village village;
    private Abilities abilities;

    public Ninja(String name, Village village, Abilities abilities) {
        super();
        this.name = name;
        this.village = village;
        this.abilities = abilities;
    }

    public Ninja() {
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<Village> getVillage() {
        return Optional.ofNullable(village);
    }

    public void setVillage(Village village) {
        this.village = village;
    }

    public Optional<Abilities> getAbilities() {
        return Optional.ofNullable(abilities);
    }

    public void setAbilities(Abilities abilities) {
        this.abilities = abilities;
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", Ninja.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("village=" + village)
                .add("abilities=" + abilities)
                .toString();
    }
}
