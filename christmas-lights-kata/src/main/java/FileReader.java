import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    public List<String> ReadFile(String filePath)
    {
        try {
            var reader = new BufferedReader(new java.io.FileReader(filePath));
            String line;

            while ((line = reader.readLine()) != null) {
                // Process the line as needed
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            return new ArrayList<>();
        }
        return new ArrayList<>();
    }
}
