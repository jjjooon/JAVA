package Ex25;
import java.util.Scanner;
public class Ex25 {
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String inputdata;
		
		while(true) {
			inputdata=scanner.nextLine();
			System.out.println("입력된 문자열:\"" + inputdata +"\"");
			if(inputdata.equals("q")) {
				break;
			}//if
		}//while
		System.out.println("종료");
       }//main
}//class
