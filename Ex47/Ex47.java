package Ex47;

public class Ex47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // ��=��+@  -----> ��(sum)���ٰ� @�� ����
		// �׷��ٸ�  ��=��+1  ---> ���� ���ϴ� ���� �ڵ��(cnt)  cnt=cnt+1;,  cnt+=1;,  cnt++;
		//1���� 10���� ¦���� ����
		int cnt=0;
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				cnt++;
			}
		}
		System.out.println("1���� 10���� ¦���� ����: " + cnt);
	}

}
