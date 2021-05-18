package headFirst.strategy;

public class SimpleFileManager extends FileManager{
    @Override
    public void performReader() {
        this.reader = new SimpleReader();
    }

    @Override
    public void performWriter() {

    }
}
