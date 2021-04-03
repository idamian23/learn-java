package io.learnstuff.tutorial.ReadAndRevertAnArrayFromAFile;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class RevertArrayFromFile {
    public static void main(String[] arg) throws FileNotFoundException, UnsupportedEncodingException {
        String path = "D:/FEAA SIA/SEM 1/JAVA/AssignmentsLearnStuffAcademy/src/io/learnstuff/tutorial/ReadAndRevertAnArrayFromAFile/file.txt";
        String line = "";
        String[] values = new String[10];

        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
                PrintWriter writer = new PrintWriter("returnedValues.txt", StandardCharsets.UTF_8);
        ) {


            while ((line = bufferedReader.readLine()) != null) {
                values = line.split(",");
            }
            for (int i = values.length - 1; i >= 0; i--) {
                writer.append(values[i] + " ");
            }
            writer.close();
            System.out.println("Values printed on document: ");
            for (int i = values.length - 1; i >= 0; i--) {
                System.out.print(values[i] + " ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



