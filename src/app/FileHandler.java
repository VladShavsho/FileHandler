package app;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {
    private final static String BASE_PATH_OUT = "/Hill/Java/DEMO/ABC_16/FileHandler/";

    public String writeFile(String fileName, String fileContent) {
        try (FileWriter fw = new FileWriter(BASE_PATH_OUT + fileName + ".txt")) {
            fw.write(fileContent);
            return "Success.";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public String readFile(String fileName) {
        try (FileReader reader = new FileReader(BASE_PATH_OUT + fileName + ".txt")) {
            int sym;
            StringBuilder stringBuilder = new StringBuilder();
            while ((sym = reader.read()) != -1) {
                stringBuilder.append((char) sym);
            }
            return stringBuilder.toString();
        } catch (IOException ex) {
            return ex.getMessage();
        }
    }
}
