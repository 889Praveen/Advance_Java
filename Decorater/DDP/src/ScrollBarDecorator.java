class ScrollBarDecorator extends TextDecorator {
    
    public ScrollBarDecorator(Text text) {
        super(text);
    }

    @Override
    public String getContent() {
        return "With Scrollbar: " + text.getContent();
    }
}
