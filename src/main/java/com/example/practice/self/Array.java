package com.example.practice.self;

import java.util.Arrays;

public class Array {
	
	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 1;
		arr[2] = 3;
		arr[4] = 5;
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		
	}

}
// 1. 여러개의 데이터를 한꺼번에 다룰 수 있습니다.
// 2. Array는 Object는 아니지만 Reference Value로 취급됩니다.
// 3. 메모리상에 연달아 공간을 확보합니다.
// 4. 미리 공간을 확보해 놓고 써야 합니다.
// 5. 한 번 만들어진 공간은 크기가 고정됩니다.
// 6. 첫 번째 위치만 알면 index로 상대적 위치를 빠르게 찾을 수 있습니다.
//////유연하지가 못하네!