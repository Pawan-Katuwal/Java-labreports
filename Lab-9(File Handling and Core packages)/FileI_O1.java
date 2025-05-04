import java.io.*;

public class FileI_O1{
    public static void main(String[] args) throws IOException {
        String text = "Java is Object Oriented Programming";

       
        FileOutputStream fos = new FileOutputStream("FileI_O1.txt");
        fos.write(text.getBytes());
        fos.close();


        FileInputStream fis = new FileInputStream("FileI_O1.txt");
        int ch;
        int vowelCount = 0;
        while ((ch = fis.read()) != -1) {
            char c = (char) ch;
            if ("AEIOUaeiou".indexOf(c) != -1) {
                vowelCount++;
            }
        }
        fis.close();

        System.out.println("Total number of vowels: " + vowelCount);
    }
}