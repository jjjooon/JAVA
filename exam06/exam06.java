package exam06;

public class exam06 {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//���� �ϳ��� �о�鿩 �빮�� A~Z �̸� '�빮���Դϴ�.
		//�ƴϸ� '�빮�ڰ� �ƴմϴ�.' �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		char ch;
		ch = (char)System.in.read();
		System.out.println(ch);
		
		if(ch>='A' && ch<='Z') {
			System.out.println("�빮���Դϴ�.");
		}else {
			System.out.println("�ҹ����Դϴ�.");
		}
	}

}
