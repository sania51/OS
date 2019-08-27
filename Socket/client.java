import java.net.*;
import java.io.*;
import java.util.Scanner;


public class client {
 
    public static void main(String[] args) throws IOException {
        
        int num, temp;
        Scanner scan = new Scanner(System.in);
        Socket s = new Socket("192.168.1.14", 1342);
        Scanner scan1 = new Scanner(s.getInputStream());
        System.out.println("from client");
        num = scan.nextInt();
        PrintStream p = new PrintStream(s.getOutputStream());
        p.println(num);
        temp = scan1.nextInt();
        System.out.println(temp);
    }
}
