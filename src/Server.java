import java.net.*;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Server {
    private static int records;
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(8081);
        Socket input = serverSocket.accept();
        Scanner sc = new Scanner(input.getInputStream());
        while (sc.hasNext()) {
            System.out.println("Connected");
        }
        sc.close();
        input.close();
        serverSocket.close();
    }
}
