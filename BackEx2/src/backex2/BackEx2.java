package backex2;
import java.io.*;
import java.util.*;

//지금 하고 있는 백트레킹 예제는 https://st-lab.tistory.com/115?category=857114 에서 참고 했습니다. 
//실력이 아직 많이 미숙하여 소스코드를 보고 재수정은 못해봤지만 실력을 키운뒤에 재수정을 해 볼 예정입니다.

public class BackEx2 {
	
	public static int[] arr;
	public static int N, M;
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException 
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
 
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
 
		arr = new int[M];
        
		dfs(1, 0);
		System.out.println(sb);

	}
	
	public static void dfs(int at, int depth) 
	{
		 
		if (depth == M) // 깊이가 M이랑 같을경우 출력
		{
			for (int val : arr) 
			{
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}
        
		// i 는 at 부터 탐색하도록 한다.
		for (int i = at; i <= N; i++)  // // 현재 깊이를 index로 하여 해당 위치에 i 값을 담는다
		{
 
			arr[depth] = i;
			dfs(i + 1, depth + 1); // 재귀호출 : 현재 i 값보다 다음 재귀에서 더 커야하므로 i + 1 의 값을 넘겨주고, 깊이 또한 1 증가시켜 재귀호출해준다
 
		}
	}

}