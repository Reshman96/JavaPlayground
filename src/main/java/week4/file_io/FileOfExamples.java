package week4.file_io;

import java.io.*;

public class FileOfExamples {

    public static void printLines() {
        String fileLocation = "src/main/resources/twas_the_night_before_christmas.txt";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileLocation));
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printAllLinesUsingForLoop(String fileLocation) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileLocation));
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File not found!");
        }
    }

    public static void writeToAFile() {
      try {
          BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/write_example.txt"));
          bufferedWriter.write("this is a new line");
          bufferedWriter.close();
      } catch (IOException e) {
          e.printStackTrace();
      }
    }

    public static void main(String[] args) {
        FileOfExamples.printLines();
//        FileOfExamples.printAllLinesUsingForLoop("src/main/resources/twas_the_night_before_christmas.txt");
        writeToAFile();
    }
}
