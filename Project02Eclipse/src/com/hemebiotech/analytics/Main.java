package com.hemebiotech.analytics;
import com.hemebiotech.analytics.counter.AnalyticsCounter;
import com.hemebiotech.analytics.reader.ReadSymptomDataFromFile;
import com.hemebiotech.analytics.writer.WriteSymptomDataFromfile;

import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {

        /** Lecture des symptômes */
        ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile("Project02Eclipse/src/symptoms.txt");
        List<String> listOfSymptoms = readSymptomDataFromFile.donneSymptomes();

        /** Compte les symptômes de la liste */
        AnalyticsCounter analyticsCounter = new AnalyticsCounter(listOfSymptoms);
        Map<String, Integer> symptomCounter = analyticsCounter.compteSymptome();

        /** Ecrit le nombre des symptômes */
        WriteSymptomDataFromfile symptomsCountFile = new WriteSymptomDataFromfile(symptomCounter, "result.out");
        symptomsCountFile.nombreSymptomes(); // Calcule le nombre de répercution de chaques symptômes
    }
}