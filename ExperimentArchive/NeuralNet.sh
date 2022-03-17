#!/bin/bash
#BATCH --mail-type=ALL
#SBATCH --mail-user=gfs19eku@uea.ac.uk
#SBATCH -p compute-16-64
#SBATCH --mem=12G
#SBATCH --time=0-05:00
#SBATCH --job-name=Neural_Net
#SBATCH -o results/Neural_Net-%j.out
#SBATCH -e results/Neural_Net-%j.err

module load java
javac -cp ".:tsml.main.jar" NeuralNetExperiment.java RunClassifier.java
java -cp ".:tsml.main.jar"  NeuralNetExperiment
