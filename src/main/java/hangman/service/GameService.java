package hangman.service;

import hangman.domain.Answer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GameService {

    public List<String> createHint(String word) {
        return IntStream.range(0, word.length())
                .mapToObj(i -> " _")
                .toList();
    }

    public void updateHint(String input, List<String> hint, Answer answer) {
        int index = 0;
        while ((index = answer.getIndex(input, index)) != -1) {
            hint.set(index, input);
        }
    }
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
