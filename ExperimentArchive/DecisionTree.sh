#!/bin/bash
#SBATCH --mail-type=ALL
#SBATCH --mail-user=gfs19eku@uea.ac.uk
#SBATCH -p compute-16-64
#SBATCH --mem=12G
#SBATCH --time=0-05:00
#SBATCH --job-name=Decision_Tree
#SBATCH -o results/Decision_Tree_RF-%j.out
#SBATCH -e results/Decision_Tree_RF-%j.err

module load java
javac DecisionTreeExperiment.java RunClassifier.java
java DecisionTreeExperiment
