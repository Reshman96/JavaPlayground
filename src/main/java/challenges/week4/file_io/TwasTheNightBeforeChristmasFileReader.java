package challenges.week4.file_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TwasTheNightBeforeChristmasFileReader {

    // read the file
    // count everything
    // take parts of speech block, and see if u can find num of nouns etc

    public static void main(String[] args) {

        List<String> listOfWords = listOfWords();
//        System.out.println(Arrays.toString(listOfWords.toArray()));
        int num = countAllWords(listOfWords);
        System.out.println(num);
    }

    public static int countAllWords(List<String> listOfWords) {
        int count = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/twas_the_night_before_christmas.txt"))) {
            String lineFromFile = bufferedReader.readLine();
            while (lineFromFile != null) {
                for (String wordFromFile : lineFromFile.split(" ")) {
                    for (String wordFromList : listOfWords) {
                        if (wordFromFile.equals(wordFromList)) {
                            count++;
                            break;
                        }
                    }
                }
                lineFromFile = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File not found!");
        }

        return count;
    }

    public static List<String> listOfWords() {
        List<String> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/english.txt"))){
            String line = bufferedReader.readLine();
            while (line != null) {
                list.add(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

}
