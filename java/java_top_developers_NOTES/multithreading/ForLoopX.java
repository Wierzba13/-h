package multithreading;

public class ForLoopX implements Runnable  {
    private Long range;

    public ForLoopX(Long range) {
        this.range = range;
    }

    @Override
    public void run() {
        for (int i = 0; i < range; i++) continue;
    }
}
