import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;
public class FileStatistics {
    public static void main(String[] args) {
        Path file = Paths.get("/root/sandbox/FileStatistics.java");
        try
        {
            BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);

            System.out.println("File name is " + file.getFileName().toString());
            System.out.println("File's size is " + attr.size());
            System.out.println("Folder name is "+file.getParent().getFileName());
            System.out.println("File's creation time is " + attr.creationTime());
        }
        catch (IOException error)
        {
            System.out.println("IO Exception: " + error.getMessage());
        }

    }
}
