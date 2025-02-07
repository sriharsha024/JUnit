package com.java.leaning;
public class Reverse {
	public String rev(String str) {
		char charArray[]=str.toCharArray();
		int left=0;
		int right=str.length()-1;
		while (left<right) {
			//swap
			char temp=charArray[left];
			charArray[left]=charArray[right];
			charArray[right]=temp;
			left++;
			right--;
		}
		return new String(charArray);
	}
}

