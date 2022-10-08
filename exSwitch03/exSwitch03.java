package exSwitch03;

public class exSwitch03 {
	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
//		문자 하나를 읽어들여
//		'P' 또는 'p'이면 "pizza를 주문하셨습니다."
//		'S' 또는 's'이면 "Spaghetti를 주문하셨습니다."
//		'R' 또는 'r'이면 "Risotto를 주문하셨습니다."
//		'D' 또는 'd'이면 "Drink를 주문하셨습니다."
//		그 외에는 "메뉴에 없습니다."를 출력하는 프로그램 작성하시오.
		
		char ch;
		ch=(char)System.in.read();
		
		switch(ch) {
		case 'P':
		case 'p':
			System.out.println("Pizza를 주문하셨습니다.");break;
		case 'S':
		case 's':
			System.out.println("Spaghetti를 주문하셨습니다.");break;
		case 'R':
		case 'r':
			System.out.println("Rsiotto를 주문하셨습니다.");break;
			
		case 'D':
		case 'd':
			System.out.println("Drink를 주문하셨습니다.");break;
			default :
				System.out.println("메뉴에 없습니다.");
		}
		}
	}
