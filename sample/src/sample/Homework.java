package sample;

import java.util.Vector;

class Name {
	String str;
	public Name(String str) {
		this.str = str;
	}
	public String toString() {
		return "Name:"+str;
	}
}

public class Homework {
	public static void main(String[] args) {
		Name b = new Name("Enjoy JAVA!");
		System.out.println(b);


		String java = new String("JAVA");
		String java1 = new String("JAVA");
		String str = new String("a,b,c");
		String str1[]= str.split(",");
		if(java == java1) System.out.println("str==str1");
		if(java.equals(java1)) System.out.println("str equals str1");
		for(String s: str1)
			System.out.println("str " + s);
		Integer n = 108;
		System.out.println(n+2);
		
		Vector<String> v = new Vector<String>(7);
		v.add("Good");
		v.add("Bad");
		int m = v.size();
		System.out.println("m= "+m);
		String s = v.get(0);
		System.out.println("String " + s);
		v.remove(1);
		
	}

}
