package exam06;

public class exam06 {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//문자 하나를 읽어들여 대문자 A~Z 이면 '대문자입니다.
		//아니면 '대문자가 아닙니다.' 를 출력하는 프로그램을 작성하시오
		char ch;
		ch = (char)System.in.read();
		System.out.println(ch);
		
		if(ch>='A' && ch<='Z') {
			System.out.println("대문자입니다.");
		}else {
			System.out.println("소문자입니다.");
		}
	}

}
