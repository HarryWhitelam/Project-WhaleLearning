import weka.classifiers.Classifier;
import weka.classifiers.trees.RandomTree;

public class DecisionTreeExperiment {
    public static void main(String[] args) throws Exception {
        Classifier decTree = new RandomTree();
        new RunClassifier(decTree);
    }
}
