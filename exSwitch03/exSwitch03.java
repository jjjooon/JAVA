package exSwitch03;

public class exSwitch03 {
	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
//		���� �ϳ��� �о�鿩
//		'P' �Ǵ� 'p'�̸� "pizza�� �ֹ��ϼ̽��ϴ�."
//		'S' �Ǵ� 's'�̸� "Spaghetti�� �ֹ��ϼ̽��ϴ�."
//		'R' �Ǵ� 'r'�̸� "Risotto�� �ֹ��ϼ̽��ϴ�."
//		'D' �Ǵ� 'd'�̸� "Drink�� �ֹ��ϼ̽��ϴ�."
//		�� �ܿ��� "�޴��� �����ϴ�."�� ����ϴ� ���α׷� �ۼ��Ͻÿ�.
		
		char ch;
		ch=(char)System.in.read();
		
		switch(ch) {
		case 'P':
		case 'p':
			System.out.println("Pizza�� �ֹ��ϼ̽��ϴ�.");break;
		case 'S':
		case 's':
			System.out.println("Spaghetti�� �ֹ��ϼ̽��ϴ�.");break;
		case 'R':
		case 'r':
			System.out.println("Rsiotto�� �ֹ��ϼ̽��ϴ�.");break;
			
		case 'D':
		case 'd':
			System.out.println("Drink�� �ֹ��ϼ̽��ϴ�.");break;
			default :
				System.out.println("�޴��� �����ϴ�.");
		}
		}
	}
