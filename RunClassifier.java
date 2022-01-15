import weka.classifiers.Classifier;
import weka.core.Instance;
import weka.core.Instances;
import java.io.File;
import java.io.FileReader;

public class RunClassifier {
    public Instances loadData(String filePath) {
        try{
            File file = new File(filePath);
            FileReader reader = new FileReader(file);
            return new Instances(reader);
        } catch(Exception e){
            System.out.println("Exception caught: " + e);
            return null;
        }
    }

    private void runTest(Instances test, Classifier classifier) throws Exception {
        int correctCount = 0;
        int incorrectCount = 0;
        for (Instance i : test) {
            // System.out.println(i.classValue());
            switch ((int) classifier.classifyInstance(i)) {
                case 0:
                    System.out.println("Predict: No Whale");
                    if (i.classValue() == 0.0)
                        correctCount++;
                    else
                        incorrectCount++;
                    break;
                case 1:
                    System.out.println("Predict: Right Whale");
                    if (i.classValue() == 1.0)
                        correctCount++;
                    else
                        incorrectCount++;
                    break;
            }
        }

        System.out.println("\nCorrect Predictions: " + correctCount);
        System.out.println("Incorrect Predictions: " + incorrectCount);
        System.out.println("Accuracy: " + (correctCount * 100) / (correctCount + incorrectCount) + "%");
    }

    public RunClassifier(Classifier classifier) throws Exception {
        System.out.println(classifier.getClass().getName() + " Classifier loaded.");
        String trainLocation = "WhaleData/RightWhaleCalls_TRAIN.arff";
        Instances train = loadData(trainLocation);
        String testLocation = "WhaleData/RightWhaleCalls_TEST.arff";
        Instances test = loadData(testLocation);
        System.out.println("Training and Testing Data successfully loaded.");

        if (train != null && test != null) {
            train.setClassIndex(train.numAttributes() - 1);
            test.setClassIndex(test.numAttributes() - 1);

            classifier.buildClassifier(train);
            System.out.println("Classifier trained");
            System.out.println("\nResults: ");
            runTest(test, classifier);
            System.out.println("Testing complete.");
        }
    }
}
