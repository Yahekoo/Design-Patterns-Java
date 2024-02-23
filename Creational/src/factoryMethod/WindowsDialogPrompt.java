package factoryMethod;

public class WindowsDialogPrompt extends DialogPrompt{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
