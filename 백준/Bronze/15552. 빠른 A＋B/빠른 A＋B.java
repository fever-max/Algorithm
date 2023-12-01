import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());

		for (int i = 0; i < count; i++) {
			String[] input = br.readLine().split(" ");
			int num1 = Integer.parseInt(input[0]);
			int num2 = Integer.parseInt(input[1]);
			int sum = num1 + num2;

			bw.write(Integer.toString(sum));
			bw.newLine();
		}

		bw.flush();
		br.close();
		bw.close();
	}
}