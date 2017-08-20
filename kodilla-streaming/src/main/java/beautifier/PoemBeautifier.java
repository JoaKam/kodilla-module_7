package beautifier;

public class PoemBeautifier {

    public String beautify(String text, PoemDecorator poemDecorator) {
        String decoratedText = poemDecorator.decorate(text);
        return decoratedText;
    }
}
