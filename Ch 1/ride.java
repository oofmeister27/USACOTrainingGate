/*
ID:arav.na1
LANG: JAVA
TASK: ride
*/

import java.io.*;
import java.util.*;

public class ride {
	public static void main (String [] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("ride.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));

		String str1 = f.readLine();
		String str2 = f.readLine();
		int product1 = 1;
		int product2 = 1;
		

		String alphabet = "0ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		for(int i = 0; i < str1.length(); i++) {
			product1 *= alphabet.indexOf(str1.charAt(i));
		}
		for(int j = 0; j < str2.length(); j++) {
			product2 *= alphabet.indexOf(str2.charAt(j));
		}
		if (product1 % 47 == product2 % 47) {
			out.println("GO");
		}
		else {
			out.println("STAY");
		}
		out.close();
	}
}