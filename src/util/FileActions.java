package util;

import java.io.*;
import java.util.*;

public class FileActions {

    public static List<String> readFile(String filename) {
        List<String> result = new ArrayList<>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(filename));
            String line = reader.readLine();
            while (line != null) {
                result.add(line.trim());
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
