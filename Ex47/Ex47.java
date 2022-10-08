package Ex47;

public class Ex47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // ★=★+@  -----> ★(sum)에다가 @을 누적
		// 그렇다면  ★=★+1  ---> 갯수 구하는 공식 코드★(cnt)  cnt=cnt+1;,  cnt+=1;,  cnt++;
		//1부터 10까지 짝수의 갯수
		int cnt=0;
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				cnt++;
			}
		}
		System.out.println("1부터 10까지 짝수의 갯수: " + cnt);
	}

}
