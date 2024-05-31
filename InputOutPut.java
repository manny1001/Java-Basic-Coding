import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class InputOutPut {
    public static void main(String[] args) {
        /*
         * WriteFile();
         * ReadFile();
         */
    }
    // #region
    public static void WriteFile() {
        String data = "Hello , this is an example of this writing in Java";
        try (FileWriter fileWriter = new FileWriter("example1.txt")) {
            fileWriter.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // #endregion
    // #region
    public static void ReadFile() {

        try (FileReader fileReader = new FileReader("example1.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // #endregion
}
