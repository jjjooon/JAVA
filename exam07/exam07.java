package exam07;

public class exam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1���� 10������ �� �� Ȧ���� ���� ���Ͻÿ�.
		int sum=0;
		for(int i=1;i<=10;i++) {
			if(i%2==1) {     //if(i%2 != 0)������ ����
				sum=sum+i;
			}
		}
		System.out.println(sum);

	}

}
