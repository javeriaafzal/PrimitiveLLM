public class Main {

  public static void main(String[] args) {
    int inputSize = 100; // Vocabulary size
    int hiddenSize = 50; // Number of hidden units
    int outputSize = 100; // Output vocabulary size

    double[][] weights = WeightGenerator.generateWeights(inputSize, hiddenSize, outputSize);

    // Use vectors or word2vec (if implemented)
    // ...
  }
}
