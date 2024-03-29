package javaPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sum6 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int total=Integer.parseInt(br.readLine());
		
		int num1;
		int num2;		
		for (int i=1;i<=total;i++) {
			st=new StringTokenizer(br.readLine()," "); 
			num1 = Integer.parseInt(st.nextToken());
			num2 = Integer.parseInt(st.nextToken());
			System.out.println("Case #"+i+": "+num1+" + "+num2+" = "+(num1+num2));
		}
		
		br.close();

	}

}