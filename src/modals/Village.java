package modals;

import enums.VillageEnum;

import java.util.Optional;
import java.util.StringJoiner;

public class Village {

    private VillageEnum villageName;
    private String kage;
    private Integer ranking;

    public Village() {
    }

    public Village(VillageEnum villageName, String kage, Integer ranking) {
        this.villageName = villageName;
        this.kage = kage;
        this.ranking = ranking;
    }

    public Optional<VillageEnum> getVillageName() {
        return Optional.ofNullable(villageName);
    }

    public void setVillageName(VillageEnum villageName) {
        this.villageName = villageName;
    }

    public Optional<String> getKage() {
        return Optional.ofNullable(kage);
    }

    public void setKage(String kage) {
        this.kage = kage;
    }

    public Optional<Integer> getRanking() {
        return Optional.ofNullable(ranking);
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Village.class.getSimpleName() + "[", "]")
                .add("villageName=" + villageName)
                .add("kage='" + kage + "'")
                .add("ranking=" + ranking)
                .toString();
    }
}
