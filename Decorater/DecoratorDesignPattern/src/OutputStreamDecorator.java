import java.io.IOException;
import java.io.OutputStream;

public abstract class OutputStreamDecorator extends OutputStream {
    protected OutputStream decoratedStream;

    public OutputStreamDecorator(OutputStream stream) {
        this.decoratedStream = stream;
    }

    @Override
    public void write(int b) throws IOException {
        decoratedStream.write(b);
    }
}

