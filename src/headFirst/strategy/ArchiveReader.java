package headFirst.strategy;

public class ArchiveReader implements ReaderBehavior{
    @Override
    public void read() {
        System.out.println("reader from archive");
        System.out.println("unzip archive");
        System.out.println("getting file");
    }
}
