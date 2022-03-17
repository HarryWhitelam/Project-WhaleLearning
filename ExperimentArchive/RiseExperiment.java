import weka.classifiers.Classifier;
import tsml.classifiers.interval_based.RISE;

public class RiseExperiment {
	public static void main(String[] args) throws Exception {
		Classifier rise = new RISE();
        	new RunClassifier(rise);
	}
}
