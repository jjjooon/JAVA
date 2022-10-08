package exam07;

public class exam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1에서 10까지의 수 중 홀수의 합을 구하시오.
		int sum=0;
		for(int i=1;i<=10;i++) {
			if(i%2==1) {     //if(i%2 != 0)동일한 문장
				sum=sum+i;
			}
		}
		System.out.println(sum);

	}

}
