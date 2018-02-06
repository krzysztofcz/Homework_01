package pl.coderslab.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GenerateRandom {

	public static void main(String[] arg) {
		System.out.println(checkRand(50000,10));
	}

	public static Map<Integer, Integer> checkRand(int amount, int interval) {
		
		Random rand = new Random();
		Map<Integer, Integer> discreteUniformDistribution = new HashMap<Integer, Integer>();
		for (int i = 0; i < amount; i++) {
			int temp=rand.nextInt(interval);
			if (discreteUniformDistribution.containsKey(temp)) {
			discreteUniformDistribution.put(temp,discreteUniformDistribution.get(temp)+1);
			} else discreteUniformDistribution.put(temp,1);
		}
		return discreteUniformDistribution;
	}
}
