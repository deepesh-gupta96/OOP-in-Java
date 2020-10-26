import java.nio.file.*;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;
import java.net.*;
public class ReadBankAccountsRandomly {
    public static void main(String[] args) {
        Path file = Paths.get("/root/sandbox/BankAccounts.txt");

        Scanner sc = new Scanner(System.in);

        String s = "0000,        ,00000.00" + System.getProperty("line.separator");
        final int RECSIZE = s.length();
        byte data[] = s.getBytes();
        ByteBuffer buffer = ByteBuffer.wrap(data);
        FileChannel fc = null;
        String delimiter = ",";
        String idString;
        int id;
        String name;
        double balance;
        final String QUIT = "9999";
        try
        {
            fc = (FileChannel)Files.newByteChannel(file, READ, WRITE);
            System.out.print("Enter account number: ");
            idString = sc.nextLine();
            while(!idString.equals(QUIT))
            {
                id = Integer.parseInt(idString);
                fc.position(id * RECSIZE);
                fc.read(buffer);
                buffer= ByteBuffer.wrap(data);
                s = new String(data);
                System.out.println("ID #" + id + "  " + s);
                System.out.print("Enter next account number or " + QUIT + " to quit");
                idString = sc.nextLine();
            }
            fc.close();
        }
        catch (Exception e)
        {
            System.out.println("Error message: " + e);
        }
    }
}

