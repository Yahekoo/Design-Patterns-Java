package factoryMethod;

public class MacButton implements Button{

        @Override
        public void render() {
            System.out.println( """
                 .-----------.
                |   Click Me  |
                 '-----------'
                """);
        }

        @Override
        public void onClick() {
            System.out.println("Windows Button Clicked ! ");
        }
}

