package javapack2;

import java.util.Scanner;

public class ConuntVCW {

	public static void main(String[] args) {
		//System.out.println("Enter the text");
		Scanner sc= new Scanner(System.in);
		String s1=sc.nextLine();
		s1=s1.toLowerCase();
		char ch[]=s1.toCharArray();
		int vow=0, cons=0, spaces=0,digits=0;
		for(int i=0;i<ch.length;++i)
		{
			
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u') {
				++vow;
			}
			else if(ch[i]>='a' && ch[i]<='z' ) {
				++cons;
			}
			else if(ch[i]>= '0' && ch[i]<='9') {
				++digits;
			}
			else if(ch[i]==' ') {
				++spaces;
			}
		}
		System.out.println("number of vowels count:"+vow);
		System.out.println("number of consonants count:"+cons);
		System.out.println("number of spaces count:"+spaces);
		System.out.println("number of digits count:"+digits);
		
		

	}

}
