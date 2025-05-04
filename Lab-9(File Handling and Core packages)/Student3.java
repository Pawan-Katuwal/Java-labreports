import java.io.*;

public class Student3{
    public static void main(String[] args) throws IOException {
        String[] students = {
            "1, Bipin, Kritipur, 9841000001",
            "2, Sita, Bhaktapur, 9841000002",
            "3, Nabin, Kritipur, 9841000003"
        };

        FileWriter writer = new FileWriter("student3.txt");
        for (String student3 : students) {
            writer.write(student3 + "\n");
        }
        writer.close();

        BufferedReader br = new BufferedReader(new FileReader("student3.txt"));
        String line;
        System.out.println("Students from Kritipur:");
        while ((line = br.readLine()) != null) {
            if (line.contains("Kritipur")) {
                System.out.println(line);
            }
        }
        br.close();
    }
}