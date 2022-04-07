package Day03;

import java.io.*;
import java.util.*;

public class Day03_4_Q15552 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n, a, b;
		n = Integer.parseInt(bf.readLine());
		int[] arr = new int[n];
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			arr[i] = a+b;
		}
		for (int i=0;i<n; i++) {
			bw.write(arr[i]+"\n");
		}
		bw.close();
	}

}
