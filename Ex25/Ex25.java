package Ex25;
import java.util.Scanner;
public class Ex25 {
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String inputdata;
		
		while(true) {
			inputdata=scanner.nextLine();
			System.out.println("�Էµ� ���ڿ�:\"" + inputdata +"\"");
			if(inputdata.equals("q")) {
				break;
			}//if
		}//while
		System.out.println("����");
       }//main
}//class
