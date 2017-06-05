package testDomeChallenges;

import java.util.HashMap;

public class TwoSum {

	public static int[] findTwoSum(int[] list, int sum) {
		int[] twoSum = null;
		HashMap<Integer, Integer> uniqueElements = new HashMap<>();
		if (list != null && list.length >= 2) {
			for (int i = 0; i < list.length; i++) {
				uniqueElements.put(list[i], i);
			}
			for (Integer integer: uniqueElements.keySet()) {
				int difference = sum - integer;
				if (difference != integer && uniqueElements.containsKey(difference)) {
					twoSum = new int[2];
					twoSum[0] = uniqueElements.get(integer);
					twoSum[1] = uniqueElements.get(difference);
					return twoSum;
				}
			}
		}
		return twoSum;
	}

	public static void main(String[] args) {
		int[] indices = findTwoSum(new int[] { 4, 4, 4, 24, 14, -12 }, 12);
		if (indices != null && indices.length >= 2) {
			System.out.println(indices[0] + " " + indices[1]);
		}
		else{
			System.out.println("None");
		}

	}

}
