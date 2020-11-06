package backex3;
import java.io.*;
import java.util.*;

//지금 하고 있는 백트레킹 예제는 https://st-lab.tistory.com/116?category=857114 에서 참고 했습니다. 
//실력이 아직 많이 미숙하여 소스코드를 보고 재수정은 못해봤지만 실력을 키운뒤에 재수정을 해 볼 예정입니다.

public class BackEx3 {
	
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
		dfs(0);
		System.out.println(sb);

	}
	
	public static void dfs(int depth) 
	{
		 
		if (depth == M)  // 깊이가 최대 깊이일경우 더이상 탐색할 자식노드는 없으므로 return해준다.
		{
			for (int i = 0; i < M; i++) 
			{
				sb.append(arr[i]).append(' ');
			}
			sb.append('\n');
			return;
		}
 
		for (int i = 1; i <= N; i++) // 깊이를 1씩 증가시키면서 DFS를 재귀호출한다.
		{
			arr[depth] = i; // 만약 추가 조건이 있다면 반복문 안에 추가하면 된다
			dfs(depth + 1);
		}
	}

}