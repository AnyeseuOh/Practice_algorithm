package Day03;

import java.io.*;
import java.util.*;

public class Day03_5_Q2741 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n;
		n = Integer.parseInt(br.readLine());
		for (int i=0;i<n;i++) {
			bw.write((i+1)+"\n");
		}
		bw.close();
	}

}
