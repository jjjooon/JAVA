package exam08;

public class exam08 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1���� 50������ �� �� 3�� ����� �հ踦 ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int sum=0;
		for(int i=1;i<=50;i++) {
			if(i%3==0) {
				sum += i;
			}
		}
		System.out.println("1���� 50������ �� �� 3�� ����� �� : " + sum);
	}

}
