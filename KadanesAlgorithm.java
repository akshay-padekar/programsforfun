package com.travelex.funprograms;

import java.util.StringTokenizer;

/**
 * Hello world!
 *
 */
public class KadanesAlgorithm {
	public static void main(String[] args) {
//		int arr[] = new int[] { -2, -3, -8, -1, -2, 1, 5, -3, 6, -2, -3, 6, 11, 5, 9 };
        int arr[] = new int[]{-2, -3, 4, -1, -2, 1, 5, -3};

		int max_so_far = 0;
		int max_ending_here = 0;

		int counter = 0;

		StringBuffer sb = new StringBuffer();

		while (counter < arr.length) {

			max_ending_here = max_ending_here + arr[counter];

			if (max_ending_here < 0) {
				max_ending_here = 0;
			}

			if (max_so_far < max_ending_here) {
				max_so_far = max_ending_here;
				sb.append(counter + " ");
			}
			counter++;
		}

		System.out.println("Maximum Sum : " + max_so_far);

		String answer[] = sb.toString().split(" ");
		int[] answerInt = new int[answer.length];
		for (int i = 0; i < answer.length; i++) {
			answerInt[i] = Integer.parseInt(answer[i]);
		}
		System.out.println("Answer length: " + answer.length);
		System.out.println("AnswerInt length: " + answerInt.length);
		System.out.println("answerInt[0]: " + answerInt[0]);
		System.out.println("answerInt[answerInt.length]: " + answerInt[answerInt.length-1]);

		System.out.print("Contiguous sub-array with maximum sum : ");
		for (int j = answerInt[0]; j <= answerInt[answerInt.length-1]; j++) {
			System.out.print(arr[j]+" ");
		}

	}
}
