package primitiveLLM;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Word2Vec {

  private final Map<String, double[]> wordVectors;

  public Word2Vec(String word2vecFilePath) throws Exception {
    wordVectors = new HashMap<>();
    BufferedReader reader = new BufferedReader(new FileReader(word2vecFilePath));
    String line;
    while ((line = reader.readLine()) != null) {
      String[] parts = line.split(" ");
      String word = parts[0];
      double[] vector = new double[parts.length - 1];
      for (int i = 1; i < parts.length; i++) {
        vector[i - 1] = Double.parseDouble(parts[i]);
      }
      wordVectors.put(word, vector);
    }
    reader.close();
  }

  public double[] getWordVector(String word) {
    return wordVectors.get(word);
  }
}
