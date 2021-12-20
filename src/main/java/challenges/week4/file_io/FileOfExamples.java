package challenges.week4.file_io;

import java.io.FileReader;
import java.io.IOException;

public class FileOfExamples {

    public static void printLines() {
        String fileLocation = "src/main/resources/twas_the_night_before_christmas.txt";

        try {
            FileReader fileReader = new FileReader(fileLocation);

            int character = fileReader.read();
            while (character != -1) {
                System.out.println(fileReader.read());
                character = fileReader.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FileOfExamples.printLines();
    }
}
