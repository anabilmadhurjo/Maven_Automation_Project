package Day4;

public class SplitMessage {
    public static void main(String[] args) {
        String splitMessage = " I name is John";

        String[] splitMessageArray = splitMessage.split ("I");

        System.out.println("My first name is " + splitMessageArray[1]);

    }
}
