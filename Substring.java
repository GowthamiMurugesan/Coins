package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {

		String GetString;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String ");
		GetString = input.next();
		int x = GetString.length();
		int sub = (x * (x + 1)) / 2;
		String Strarr[] = new String[sub];
		int k = 0;
		for (int i = 0; i < GetString.length(); i++) {
			for (int j = i + 1; j <= GetString.length(); j++) {
				Strarr[k] = GetString.substring(i, j);
				k++;
			}
		}
		Arrays.sort(Strarr);
		System.out.println(" Greatest  Lexicographical String is  `" + Strarr[k - 1]+"`");
	}

	}


