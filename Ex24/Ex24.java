package Ex24;

public class Ex24 {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int keycode;
		
		while(true) {
			keycode=System.in.read();
			System.out.println("keycode:"+keycode);
			if(keycode==113) {
				break;      //keycode가 113(q)와 동일할 경우 실행
			}//if
	      }//wile
		System.out.println("종료");
     }//main
  }//class