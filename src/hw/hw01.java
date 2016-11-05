package hw;

import java.util.*;
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		float v1 = scn.nextFloat(); 
		int n = scn.nextInt();
		System.out.print(fun0(v1,n));
	}
	public static float fun0(float v1,int n){
		float x = 0;
		switch(n){
			case 1:
				x =(float) (v1-32)*(5f/9f);
				break;
			case 2:
				x =(float) ((v1*9f)/5f)+32;
				break;
		}
		return x;
		
	}

}