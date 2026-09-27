import java.io.IOException;
import java.io.InputStream;

public abstract class InputStreamDecorator extends InputStream {
    protected InputStream decoratedStream;

    public InputStreamDecorator(InputStream stream) {
        this.decoratedStream = stream;
    }

    @Override
    public int read() throws IOException {
        return decoratedStream.read();
    }
}
