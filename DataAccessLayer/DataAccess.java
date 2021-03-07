package DataAccessLayer;

import java.io.*;
import java.util.*;

public class DataAccess {
    //Write the data from Wedding and birthday parties to a Text file
    public void WriteFile(String data, String writeTo) throws IOException {

        File file = new File(writeTo);
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file.getName(), true);
        BufferedWriter bw = new BufferedWriter(fileWriter);
        bw.append(data);
        bw.close();
        return;
    }

    //Read the data from Wedding and birthday parties from a Text file
    public ArrayList<String> ReadFile(String readFrom) throws IOException {
        BufferedReader reader;
        ArrayList<String> values = new ArrayList<String>();
        reader = new BufferedReader(new FileReader(
                readFrom));
        String line = reader.readLine();
        while (line != null) {
            values.add(line);
            line = reader.readLine();
        }
        reader.close();
        return values;
    }
}
