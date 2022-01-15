#!/bin/bash
#SBATCH --mail-type=ALL
#SBATCH --mail-user=gfs19eku@uea.ac.uk
#SBATCH -p compute-16-64
#SBATCH --mem=12G
#SBATCH --time=0-05:00
#SBATCH --job-name=Naive_Bayes
#SBATCH -o results/Naive_Bayes-%j.out
#SBATCH -e results/Naive_Bayes-%j.err

module load java
javac NaiveBayesExperiment.java RunClassifier.java
java NaiveBayesExperiment
