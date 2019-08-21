import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        SocketServer server  = new SocketServer();
        try {
            server.conn();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
