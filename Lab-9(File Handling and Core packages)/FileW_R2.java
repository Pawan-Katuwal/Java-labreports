import java.io.*;

public class FileW_R2{
    public static void main(String[] args) throws IOException {
        String text = "This is a FileWriter and FileReader.";

        FileWriter writer = new FileWriter("FileW_R2.txt");
        writer.write(text);
        writer.close();

        FileReader reader = new FileReader("FileW_R2.txt");
        int ch;
        while ((ch = reader.read()) != -1) {
            System.out.print((char) ch);
        }
        reader.close();
    }
}