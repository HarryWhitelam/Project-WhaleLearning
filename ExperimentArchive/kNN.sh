#!/bin/bash
#BATCH --mail-type=ALL
#SBATCH --mail-user=gfs19eku@uea.ac.uk
#SBATCH -p compute-16-64
#SBATCH --mem=12G
#SBATCH --time=0-05:00
#SBATCH --job-name=kNN
#SBATCH -o results/kNN_101-%j.out
#SBATCH -e results/kNN_101-%j.err

module load java
javac kNNExperiment.java RunClassifier.java
java kNNExperiment
