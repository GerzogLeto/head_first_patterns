package headFirst.strategy;

public class SimpleReader implements ReaderBehavior{
    @Override
    public void read() {
        System.out.println("This is simple reader from local file system.");
    }
}
