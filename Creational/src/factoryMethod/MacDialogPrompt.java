package factoryMethod;

public class MacDialogPrompt extends DialogPrompt{
    @Override
    public Button createButton() {
        return new MacButton();
    }
}
