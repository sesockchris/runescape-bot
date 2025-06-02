public class SampleBot extends BotScript {

    @Override
    protected void init() {
        System.out.println("Bot started!");
        // Initialize hooks, settings, etc.
    }

    @Override
    protected void loop() {
        System.out.println("Performing bot action...");
        // Perform game interaction logic (e.g., simulate mouse clicks, read screen data)
    }

    @Override
    protected void cleanup() {
        System.out.println("Bot stopped!");
    }

    public static void main(String[] args) {
        new SampleBot().start();
    }
}
