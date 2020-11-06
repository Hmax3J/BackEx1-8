package backex4;
import java.io.*;
import java.util.*;

//���� �ϰ� �ִ� ��Ʈ��ŷ ������ https://st-lab.tistory.com/117?category=857114 ���� ���� �߽��ϴ�. 
//�Ƿ��� ���� ���� �̼��Ͽ� �ҽ��ڵ带 ���� ������� ���غ����� �Ƿ��� Ű��ڿ� ������� �� �� �����Դϴ�.

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