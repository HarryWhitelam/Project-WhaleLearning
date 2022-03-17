#!/bin/bash
#BATCH --mail-type=ALL
#SBATCH --mail-user=gfs19eku@uea.ac.uk
#SBATCH -p compute-16-64
#SBATCH --mem=12G
#SBATCH --time=0-12:00
#SBATCH -o results/Rise-%j.out
#SBATCH -e results/Rise-%j.err

module load java
javac -cp ".:tsml.main.jar" RiseExperiment.java RunClassifier.java
java -cp ".:tsml.main.jar" RiseExperiment

