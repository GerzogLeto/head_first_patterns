package headFirst.strategy;

public class NetReader implements ReaderBehavior{
    @Override
    public void read() {
        System.out.println("reader for net.");
        System.out.println("connection with net.");
        System.out.println("authorization");
        System.out.println("reading file");
    }
}
