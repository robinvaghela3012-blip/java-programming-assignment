import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5050);

            BufferedReader userInput = new BufferedReader(
                    new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            System.out.print("Enter message: ");
            String msg = userInput.readLine();

            out.println(msg);

            String response = in.readLine();
            System.out.println("Server reply: " + response);

            socket.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}