package hangman.service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GameService {

    public String getRandomWord(List<String> words) {
        int size = words.size();
        int randomNumber = new Random().nextInt(size);
        return words.get(randomNumber);
    }
    public List<String> getFileData(String filePath) {
        List<String> words = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                words.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return words;
    }
}
