package factoryMethod;

/**
 * This is the Creator Class
 * It will be extended by Sub classes ..
 * Each sub class will provide its own implementation to create products (Buttons)
 */
public abstract class DialogPrompt {

    public void showDialogPrompt() {
        Button createdButton = createButton();
        System.out.println("This is the dialog window, Click below");
        createdButton.render();
    }


    public abstract Button createButton();
}
