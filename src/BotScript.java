public abstract class BotScript {
    private boolean running = true;

    public void start() {
        init();
        while (running) {
            loop();
            try {
                Thread.sleep(getLoopDelay());
            } catch (InterruptedException e) {
                stop();
            }
        }
        cleanup();
    }

    public void stop() {
        running = false;
    }

    protected abstract void init();
    protected abstract void loop();
    protected abstract void cleanup();
    protected int getLoopDelay() {
        return 1000; // default delay in ms
    }
}
