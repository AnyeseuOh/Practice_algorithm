package Day03;

import java.io.*;
import java.util.*;

public class Day03_6_Q2742 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n;
		n = Integer.parseInt(br.readLine());
		for (int i=n; i>0; i--) {
			bw.write(i+"\n");
		}
		bw.close();
	}
}
