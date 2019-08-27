import java.net.*;
import java.io.*;

import java.util.Scanner;

public class server {
 
    public static void main(String[] args) throws IOException {
        
        int num, temp;
        ServerSocket s1 = new ServerSocket(1342);
        Socket ss = s1.accept();
        Scanner sc = new Scanner(ss.getInputStream());
        num = sc.nextInt();
        temp = num*num;
        PrintStream p = new PrintStream(ss.getOutputStream());
        p.println(temp);
    }
}
