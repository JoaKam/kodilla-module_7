package beautifier;

public class PoemDecorUpperLetters implements PoemDecorator {

    public String decorate(String text) {
        return (text.toUpperCase());
    }
}
