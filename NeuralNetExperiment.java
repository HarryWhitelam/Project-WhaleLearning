import weka.classifiers.Classifier;
import weka.classifiers.functions.VotedPerceptron;

public class NeuralNetExperiment {
    public static void main(String[] args) throws Exception {
        Classifier perceptron = new VotedPerceptron();
        new RunClassifier(perceptron);
    }
}

