package Ex24;

public class Ex24 {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int keycode;
		
		while(true) {
			keycode=System.in.read();
			System.out.println("keycode:"+keycode);
			if(keycode==113) {
				break;      //keycode�� 113(q)�� ������ ��� ����
			}//if
	      }//wile
		System.out.println("����");
     }//main
  }//class