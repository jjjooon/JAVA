package sec01.exam04;

public class VariableScopeExample {
	public static void main(String[] args) {
		int v1=15;
		if(true) {
			int v2=10;
		}
		int v3= v1+v2;//에러
                            //v2 변수를 사용할 수 없기 때문에 컴파일 에러가 생김
	}
}
