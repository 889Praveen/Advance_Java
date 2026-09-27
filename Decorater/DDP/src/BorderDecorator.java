class BorderDecorator extends TextDecorator {
    
    public BorderDecorator(Text text) {
        super(text);
    }

    @Override
    public String getContent() {
        return "Bordered: [" + text.getContent() + "]";
    }
}