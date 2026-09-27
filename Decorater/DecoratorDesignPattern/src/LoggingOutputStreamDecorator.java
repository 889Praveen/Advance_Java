import java.io.IOException;
import java.io.OutputStream;

public class LoggingOutputStreamDecorator extends OutputStreamDecorator {
    private int byteCount = 0;

    public LoggingOutputStreamDecorator(OutputStream stream) {
        super(stream);
    }

    @Override
    public void write(int b) throws IOException {
        byteCount++;
        System.out.println("Byte Written: " + b);
        decoratedStream.write(b);
    }

    // Getter for byte count
    public int getByteCount() {
        return byteCount;
    }
}
