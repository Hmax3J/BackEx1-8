package backex5;
import java.io.*;

//지금 하고 있는 백트레킹 예제는 https://st-lab.tistory.com/118?category=857114 에서 참고 했습니다. 
//실력이 아직 많이 미숙하여 소스코드를 보고 재수정은 못해봤지만 실력을 키운뒤에 재수정을 해 볼 예정입니다.

public class BackEx5 {
	
	public static int[] arr;
	public static int N; // 체스판의 크기
	public static int count = 0;

	public static void main(String[] args) throws IOException 
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
 
		nQueen(0);
		System.out.println(count);

	}
	
	public static void nQueen(int depth) 
	{
		// 모든 원소를 다 채운 상태면 count 증가 및 return 
		if (depth == N) 
		{
			count++;
			return;
		}
 
		for (int i = 0; i < N; i++) 
		{
			arr[depth] = i;
			// 놓을 수 있는 위치일 경우 재귀호출 // Possibility() 해당 열에서 i 번째 행에 놓을 수 있는지를 검사하는 함수
			if (Possibility(depth)) 
			{
				nQueen(depth + 1);
			}
		}
 
	}
	
	public static boolean Possibility(int col) 
	{
		 
		for (int i = 0; i < col; i++) 
		{
			// 해당 열의 행과 i열의 행이 일치할경우 (같은 행에 존재할 경우) 
			if (arr[col] == arr[i]) 
			{
				return false;
			} 
			
			/*
			 * 대각선상에 놓여있는 경우
			 * (열의 차와 행의 차가 같을 경우가 대각선에 놓여있는 경우다)
			 */
			else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) 
			{
				return false;
			}
		}
		
		return true;
	}

}