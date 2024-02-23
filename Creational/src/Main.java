import factoryMethod.DialogPrompt;
import factoryMethod.MacDialogPrompt;
import factoryMethod.WindowsDialogPrompt;

public class Main {
    public static void main(String[] args) {
       String os = System.getProperty("os.name");
       DialogPrompt dialog ;
       if(os.toLowerCase().contains("mac")) {
           dialog = new MacDialogPrompt();
           dialog.showDialogPrompt();
       } else if(os.toLowerCase().contains("windows")) {
           dialog = new WindowsDialogPrompt();
           dialog.showDialogPrompt();
       } else {
           // SOME EXCEPTION
       }
    }
}