package exam09;

public class exam09 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1에서 50까지의 수 중 3의 배수의 갯수를 구하시오.
		int cnt=0;
		for(int i=1;i<=50;i++) {
			if(i%3==0) {
				cnt++;
			}
		}
		System.out.println("1에서 50까지의 수 중 3의 배수의 갯수 : " + cnt);

	}

}
