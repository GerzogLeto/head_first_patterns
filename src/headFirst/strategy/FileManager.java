package headFirst.strategy;

public abstract class FileManager {
    protected ReaderBehavior reader;
    protected WriterBehavior writerBehavior;

    public abstract void performReader();
    public abstract void performWriter();
}
