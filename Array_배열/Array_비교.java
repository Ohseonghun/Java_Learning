package Array_배열;

import java.util.Arrays;

//https://dahye-jeong.gitbook.io/java/java/undefined/java-api

//equals()는 1차 항목의 값만 비교하고, deepEquals()는 
//1차 항목이 서로 다른 배열을 참조할 경우 중첩된 배열의 항목까지 비교한다.

public class Array_비교 {
	public static void main(String[] args) {
		int[][] origin = { { 1, 2 }, { 3, 4 } };

		// 얕은 복제
		int[][] clone1 = Arrays.copyOf(origin, origin.length);
		System.out.println("배열 번지 비교" + origin.equals(clone1));
		// =>false
		System.out.println("1차 배열 항목값 비교" + Arrays.deepEquals(clone1));
		// =>true
		System.out.println("중첩 배열 항목값 비교" + Arrays.deepEquals(clone1));
		// =>true

		// 깊은 복제
		int[][] clone2 = Arrays.copyOf(origin, origin.length);
		clone2[0] = Arrays.copyOf(origin[0], origin[0].length);
		clone2[1] = Arrays.copyOf(origin[1], origin[1].length);
		System.out.println("배열 번지 비교" + origin.equals(clone2));
		// =>false
		System.out.println("1차 배열 항목값 비교" + Arrays.deepEquals(clone2));
		// =>false
		System.out.println("중첩 배열 항목값 비교" + Arrays.deepEquals(clone2));
		// =>true
	}
}