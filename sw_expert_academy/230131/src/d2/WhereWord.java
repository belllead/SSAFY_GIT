package d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WhereWord {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(in.readLine());
		
		StringBuilder ans = new StringBuilder();
		
		for (int tc=1; tc<=T; tc++) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			int[][] puzzle = new int[N][N];
			
			for (int r=0; r<N; r++) {
				st = new StringTokenizer(in.readLine());
				for (int c=0; c<N; c++) {
					puzzle[r][c] = Integer.parseInt(st.nextToken());
				}
			}
			
			int spaceCnt = 0;
			int wordCnt = 0;
			
			for (int r=0; r<N; r++) {
				for (int c=0; c<N; c++) {
					
					if (r == 0 || c == 0) {
						if (puzzle[r][c] == 1) {
							for (int i=c; i<N; i++) {
								if (puzzle[r][i] == 1) spaceCnt++;
								else break;							
							}
							if (spaceCnt == K) wordCnt++;
							spaceCnt = 0;
							
							for (int i=c; i<N; i++) {
								if (puzzle[i][c] == 1) spaceCnt++;
								else break;							
							}
							if (spaceCnt == K) wordCnt++;
							spaceCnt = 0;
						}
					}
					
					if (r > 1 && c > 1) {
						if (puzzle[r][c] == 1 && puzzle[r][c-1] == 0 && puzzle[r-1][c] == 0) {
							for (int i=c; i<N; i++) {
								if (puzzle[r][i] == 1) spaceCnt++;
								else break;							
							}
							if (spaceCnt == K) wordCnt++;
							spaceCnt = 0;
							
							for (int i=c; i<N; i++) {
								if (puzzle[i][c] == 1) spaceCnt++;
								else break;							
							}
							if (spaceCnt == K) wordCnt++;
							spaceCnt = 0;
						}
					}
				}
			}
			
			ans.append("#" + tc + " ").append(wordCnt).append("\n");			
		}
		
		System.out.println(ans.toString());
				
	}
	
}
