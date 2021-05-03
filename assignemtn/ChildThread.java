package assignemtn;

public class ChildThread extends Thread {
    public void rum() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child thread");
        }
    }
}
