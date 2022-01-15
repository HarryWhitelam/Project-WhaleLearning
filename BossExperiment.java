import weka.classifiers.Classifier;
import tsml.src.main.java.tsml.classifiers.dictionary_based.*;

public class BossExperiment {
	public static void main(String[] args) throws Exception {
		Classifier boss = new BOSS();
        	new RunClassifier(boss);
	}
}
