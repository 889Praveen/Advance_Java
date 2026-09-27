import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class DecoratorPatternTest {

    public static void main(String[] args) throws IOException {
        // Test Enhanced InputStreamDecorator
        String input = "Hello World!\nThis is a test input stream.\n";
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(input.getBytes());
        
        try (EnhancedInputStreamDecorator enhancedInputStream = new EnhancedInputStreamDecorator(byteArrayInputStream)) {
            while (enhancedInputStream.read() != -1) {
                // Reading and tracking data
            }

            System.out.println("Number of bytes read: " + enhancedInputStream.getByteCount());
            System.out.println("Number of characters read: " + enhancedInputStream.getCharacterCount());
            System.out.println("Number of words read: " + enhancedInputStream.getWordCount());
            System.out.println("Number of lines read: " + enhancedInputStream.getLineCount());
        }
        // Test Logging OutputStreamDecorator
        String output = "Output Stream Test";
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        
        try (LoggingOutputStreamDecorator loggingOutputStream = new LoggingOutputStreamDecorator(byteArrayOutputStream)) {
            for (byte b : output.getBytes()) {
                loggingOutputStream.write(b);
            }

            System.out.println("Total bytes written: " + loggingOutputStream.getByteCount());
        }
    }
}

