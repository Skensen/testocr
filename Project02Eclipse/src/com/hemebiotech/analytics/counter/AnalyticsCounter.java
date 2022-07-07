package com.hemebiotech.analytics.counter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnalyticsCounter implements ISymptomCounter {

	private List<String> listeDesSymptomes;

	public AnalyticsCounter(List<String> listeDesSymptomes) {
		this.listeDesSymptomes = listeDesSymptomes;
	}

	@Override
	public Map<String, Integer> compteSymptome() {
		Map<String, Integer> result = new HashMap<String, Integer>();
		int counter = 0;
		for (String symptom : listeDesSymptomes) {
			for (int i = 0; i < listeDesSymptomes.size(); i++) {
				if (symptom.equals(listeDesSymptomes.get(i))) {
					counter++;
				}
			}
			if (!result.containsKey(symptom)) {
				result.put(symptom, counter);
			}
			counter = 0;
		}
		return result;
	}
}
