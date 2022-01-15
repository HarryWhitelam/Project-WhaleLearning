import weka.classifiers.Classifier;
import weka.classifiers.bayes.NaiveBayes;


public class NaiveBayesExperiment {
    public static void main(String[] args) throws Exception {
        Classifier naiveBayes = new NaiveBayes();
        new RunClassifier(naiveBayes);
    }
}
