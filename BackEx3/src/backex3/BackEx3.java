package backex3;
import java.io.*;
import java.util.*;

//���� �ϰ� �ִ� ��Ʈ��ŷ ������ https://st-lab.tistory.com/116?category=857114 ���� ���� �߽��ϴ�. 
//�Ƿ��� ���� ���� �̼��Ͽ� �ҽ��ڵ带 ���� ������� ���غ����� �Ƿ��� Ű��ڿ� ������� �� �� �����Դϴ�.

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
		 
		if (depth == M)  // ���̰� �ִ� �����ϰ�� ���̻� Ž���� �ڽĳ��� �����Ƿ� return���ش�.
		{
			for (int i = 0; i < M; i++) 
			{
				sb.append(arr[i]).append(' ');
			}
			sb.append('\n');
			return;
		}
 
		for (int i = 1; i <= N; i++) // ���̸� 1�� ������Ű�鼭 DFS�� ���ȣ���Ѵ�.
		{
			arr[depth] = i; // ���� �߰� ������ �ִٸ� �ݺ��� �ȿ� �߰��ϸ� �ȴ�
			dfs(depth + 1);
		}
	}

}