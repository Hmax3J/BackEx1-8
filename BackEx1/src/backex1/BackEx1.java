package backex1;
import java.io.*;
import java.util.*;

//���� �ϰ� �ִ� ��Ʈ��ŷ ������ https://st-lab.tistory.com/114?category=857114 ���� ���� �߽��ϴ�. 
//�Ƿ��� ���� ���� �̼��Ͽ� �ҽ��ڵ带 ���� ������� ���غ����� �Ƿ��� Ű��ڿ� ������� �� �� �����Դϴ�.

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
		// ��� ���̰� M�� �������� Ž���������� ��Ҵ� �迭�� ���
		if (depth == M) 
		{
			for (int val : arr) 
			{
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}
		
		// ���� �ش� ���(��)�� �湮���� �ʾҴٸ�?
		for (int i = 0; i < N; i++)
		{
			if (!visit[i]) 
			{
				visit[i] = true;		// �ش� ��带 �湮���·� ����
				arr[depth] = i + 1;		// �ش� ���̸� index�� �Ͽ� i + 1 �� ����
				dfs(N, M, depth + 1);	// ���� �ڽ� ��� �湮�� ���� depth 1 ������Ű�鼭 ���ȣ��
								
				// �ڽĳ�� �湮�� ������ ���ƿ��� �湮��带 �湮���� ���� ���·� ����
				visit[i] = false;
			}
		}
	}

}