package backex1;
import java.io.*;
import java.util.*;

//지금 하고 있는 백트레킹 예제는 https://st-lab.tistory.com/114?category=857114 에서 참고 했습니다. 
//실력이 아직 많이 미숙하여 소스코드를 보고 재수정은 못해봤지만 실력을 키운뒤에 재수정을 해 볼 예정입니다.

public class BackEx1 {
	
	public static int[] arr;
	public static boolean[] visit;
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException 
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
 
		arr = new int[M];
		visit = new boolean[N];
		dfs(N, M, 0);
		System.out.println(sb);

	}
	
	public static void dfs(int N, int M, int depth) 
	{
		// 재귀 깊이가 M과 같아지면 탐색과정에서 담았던 배열을 출력
		if (depth == M) 
		{
			for (int val : arr) 
			{
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}
		
		// 만약 해당 노드(값)을 방문하지 않았다면?
		for (int i = 0; i < N; i++)
		{
			if (!visit[i]) 
			{
				visit[i] = true;		// 해당 노드를 방문상태로 변경
				arr[depth] = i + 1;		// 해당 깊이를 index로 하여 i + 1 값 저장
				dfs(N, M, depth + 1);	// 다음 자식 노드 방문을 위해 depth 1 증가시키면서 재귀호출
								
				// 자식노드 방문이 끝나고 돌아오면 방문노드를 방문하지 않은 상태로 변경
				visit[i] = false;
			}
		}
	}

}