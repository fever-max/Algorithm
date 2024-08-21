import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {

    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = read(), c = read();

        arr = new int[n + 1];
        while (c-- > 0) {
            int p = read();
            arr[read()] = p;
            arr[read()] = p;
        }

        for (int i = 1; i <= n; i++) sb.append(dfs(i, 1)).append("\n");

        bw.write(sb.toString());
        bw.flush();
    }

    private static int dfs(int p, int cnt) {
        if (p == 1) return cnt;
        return dfs(arr[p], cnt + 1);
    }

    private static int read() throws IOException {
        int c, n = System.in.read() & 15;
        while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);

        return n;
    }

}