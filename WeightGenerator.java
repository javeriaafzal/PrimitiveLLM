package primitiveLLM;

import java.util.Random;

public class WeightGenerator {

  private static final Random random = new Random();

  public static double[][] generateWeights(int inputSize, int hiddenSize, int outputSize) {
    double[][] weights = new double[hiddenSize][inputSize + 1]; // +1 for bias term
    for (int i = 0; i < hiddenSize; i++) {
      for (int j = 0; j <= inputSize; j++) { // include bias term
        weights[i][j] = random.nextDouble() * (2.0 / Math.sqrt(inputSize)); // Xavier initialization
      }
    }
    return weights;
  }
}
