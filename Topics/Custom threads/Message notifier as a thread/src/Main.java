import java.util.Scanner;

class MessageNotifier extends Thread {

    // write fields to store variables here



    String msg;
    int repeats;

    public MessageNotifier(String msg, int repeats) {
        // implement the constructor
        this.msg = msg;
        this.repeats = repeats;
    }

    @Override
    public void run() {

        for(int i = 0; i < repeats; i++) {
            System.out.println(msg);
        }
        // implement the method to print the message stored in a field
    }
}