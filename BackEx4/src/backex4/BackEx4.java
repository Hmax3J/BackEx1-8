package backex4;
import java.io.*;
import java.util.*;

//지금 하고 있는 백트레킹 예제는 https://st-lab.tistory.com/117?category=857114 에서 참고 했습니다. 
//실력이 아직 많이 미숙하여 소스코드를 보고 재수정은 못해봤지만 실력을 키운뒤에 재수정을 해 볼 예정입니다.

public class BackEx4 {
	
	public static int N, M;
	public static int[] arr;
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[M];
 
		dfs(1, 0);
		System.out.println(sb);

	}
	
	public static void dfs(int at, int depth) 
	{
		 
		if (depth == M) 
		{
			for (int val : arr) 
			{
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}
 
		for (int i = at; i <= N; i++) 
		{
			arr[depth] = i;
			dfs(i, depth + 1);
		}
 
	}

}