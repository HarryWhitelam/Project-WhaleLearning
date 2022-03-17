import weka.classifiers.Classifier;
import tsml.classifiers.dictionary_based.BOSS;

public class BossExperiment {
	public static void main(String[] args) throws Exception {
		Classifier boss = new BOSS();
        	new RunClassifier(boss);
	}
}
