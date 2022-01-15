import weka.classifiers.Classifier;
import weka.classifiers.lazy.IBk;

public class kNNExperiment {
    public static void main(String[] args) throws Exception {  
        Classifier kNN = new IBk(101);
        new RunClassifier(kNN);
    }
}

