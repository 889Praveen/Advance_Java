import java.io.IOException;
import java.io.InputStream;

public class EnhancedInputStreamDecorator extends InputStreamDecorator {
    private int byteCount = 0;
    private int characterCount = 0;
    private int wordCount = 0;
    private int lineCount = 0;
    private boolean inWord = false;

    public EnhancedInputStreamDecorator(InputStream stream) {
        super(stream);
    }

    @Override
    public int read() throws IOException {
        int byteRead = decoratedStream.read();
        
        if (byteRead != -1) {
            byteCount++;

            // Convert byte to char
            char c = (char) byteRead;
            if (Character.isWhitespace(c)) {
                if (inWord) {
                    wordCount++;
                    inWord = false;
                }
                if (c == '\n') {
                    lineCount++;
                }
            } else {
                inWord = true;
                characterCount++;
            }

            // Log the byte read
            System.out.println("Byte Read: " + byteRead);
        }

        return byteRead;
    }

    // Getter methods
    public int getByteCount() {
        return byteCount;
    }

    public int getCharacterCount() {
        return characterCount;
    }

    public int getWordCount() {
        return wordCount;
    }

    public int getLineCount() {
        return lineCount;
    }
}
