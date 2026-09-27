public class DecoratorPatternExample {
    public static void main(String[] args) {
        SimpleText simpleText = new SimpleText("Hello, World!");
        
        // Add border functionality
        Text borderedText = new BorderDecorator(simpleText);
        System.out.println(borderedText.getContent()); // Output: Bordered: [Hello, World!]
        
        // Add scrollbar functionality to the bordered text
        Text scrollableText = new ScrollBarDecorator(borderedText);
        System.out.println(scrollableText.getContent()); // Output: With Scrollbar: Bordered: [Hello, World!]
    }
}