package challenges.week4.file_io;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwasTheNightBeforeChristmasFileReader {
    private static final String FILEPATH_NBC_PARSE = "src/main/resources/nbc_parse.txt";
    private static final String FILEPATH_NBC = "src/main/resources/twas_the_night_before_christmas.txt";
    private static final String FILEPATH_ENGLISH = "src/main/resources/english.txt";

    public static void main(String[] args) {
        writeNumOfWords(FILEPATH_NBC_PARSE, (HashSet<String>) setOfUniqueWordsInNBCFile());
    }

    // adds all unique words in night_before_christmas into a hashset
    public static Set<String> setOfUniqueWordsInNBCFile() {
        HashSet<String> set = new HashSet<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILEPATH_NBC))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                for (String word : line.split(" ")) {
                    word = word.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
                    set.add(word);
                }
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return set;
    }

    private static void writeNumOfWords(String filepath, HashSet<String> set) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filepath))) {
            for (String word : set) {
                int count = countWords(word, FILEPATH_NBC);
                bufferedWriter.write(word + " -> " + count + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // counts the total number of times the word appears in the file provided
    private static int countWords(String word, String filepath) {
        int count = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath))) {
            while (bufferedReader.readLine() != null) {
                for (String wordInFile : bufferedReader.readLine().split(" ")) {
                    wordInFile = wordInFile.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
                    if (word.equals(wordInFile)) {
                        count++;
                    }
                }
                bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    // returns the total number of words in the twas_the_night_before_christmas.txt file
    public static int countAllWords() {
        int count = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILEPATH_NBC))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                for (String word : line.split(" ")) {
                    count++;
                }
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    // writes to a file named nbc_parse.txt
    public static void writeToFile(String filepath) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filepath))) {
            bufferedWriter.write(Integer.toString(countAllWords()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int compareToWordsInEnglishFile(List<String> listOfWords) {
        int count = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILEPATH_NBC))) {
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

    // returns an arraylist with list of all the words in the english.txt file
    public static List<String> listOfWordsInEnglishFile() {
        List<String> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILEPATH_ENGLISH))) {
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


