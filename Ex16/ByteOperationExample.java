package sec03.exam03;

public class ByteOperationExample {
	public static void main(String[] args) {
		byte result1 = 10 + 20;
                            // 피연산자가 변수가 아닐때는 자동형변환이 일어나지 않는다
		System.out.println(result1);
		
		byte x = 10;
		byte y = 20;
		int result2 = x + y;
		System.out.println(result2);
	}
}

