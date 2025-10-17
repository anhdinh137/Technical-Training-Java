public class dynamicBinding {
    // Dynamic binding (or late binding): occurs at runtime instead of at compile time
    // Applies to overridden method (non-static, non-final)

    public static void main(String[] args) {
        class Walk {
            public void start() {
                System.out.println("Walking");
            }
        }

        class Run extends Walk {
            public void start() {
                System.out.println("Running");
            }
        }

        Run run = new Run();
        Walk walk = new Walk();
        Walk wr = new Run();
        // Compiler only know that 'wr' is of type Walk
        // But at runtime, the jvm will see that 'wr' is Run, so it will run Run.start()
        run.start();
        walk.start();
        wr.start();
    }
}
