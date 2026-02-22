package lab4;
public class LetterCreator extends DocumentCreator {
    @Override
    public Document createDocument() { return new Letter(); }
}