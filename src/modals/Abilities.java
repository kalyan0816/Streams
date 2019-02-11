package modals;

import enums.ChakraStyle;

import java.util.List;
import java.util.Optional;
import java.util.StringJoiner;

public class Abilities {

    private ChakraStyle chakraStyle;
    private String title;
    private List<String> juthsus;

    public Abilities() {
    }

    public Abilities(ChakraStyle chakraStyle, String title, List<String> juthsus) {
        this.chakraStyle = chakraStyle;
        this.title = title;
        this.juthsus = juthsus;
    }


    public Optional<ChakraStyle> getChakraStyle() {
        return Optional.ofNullable(chakraStyle);
    }

    public void setChakraStyle(ChakraStyle chakraStyle) {
        this.chakraStyle = chakraStyle;
    }

    public Optional<String> getTitle() {
        return Optional.ofNullable(title);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Optional<List<String>> getJuthsus() {
        return Optional.ofNullable(juthsus);
    }

    public void setJuthsus(List<String> juthsus) {
        this.juthsus = juthsus;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Abilities.class.getSimpleName() + "[", "]")
                .add("chakraStyle=" + chakraStyle)
                .add("title='" + title + "'")
                .add("juthsus=" + juthsus)
                .toString();
    }
}