import beautifier.*;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier newPoem = new PoemBeautifier();

        String text = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua.";

        System.out.println(newPoem.beautify(text, (s) -> s.toUpperCase()));
        System.out.println(newPoem.beautify(text, PoemDecorStars::decoratePoem));
        System.out.println(newPoem.beautify(text, PoemDecorPokemon::decoratePoem));

    }
}
