package guvi;

import java.util.Scanner;

public class StringRepeat {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String");
		String get=input.nextLine();
		char []dumy=get.toCharArray();
		for(int i=0;i<dumy.length-1;i++){
			if(dumy[i]==dumy[i+1]){
				for(int j=i+1;j<=i-dumy.length;j++){
					dumy[j]=dumy[j+1];
				}
			}
			dumy[i+1]='*';
		}
		for(char h:dumy)
		{
			System.out.println(h);
		}

	}

}
