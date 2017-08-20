package beautifier;

public class PoemDecorPokemon {

    public static String decoratePoem (String text) {
        String resultPoem;
        resultPoem = text.replaceAll("a", "@");
        resultPoem = resultPoem.replaceAll("i", "!");
        resultPoem = resultPoem.replaceAll("o", "0");
        resultPoem = resultPoem.replaceAll("l", "1");

        return resultPoem;
    }
}
