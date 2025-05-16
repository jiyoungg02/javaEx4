package ch17.unit01;

/*
  - Lambda Expression
    : 메소드를 하나의 식으로 표현
    : 메소드를 람다식으로 표현하면 메소드의 이름이 없어지므로 익명함수라 한다.
    : 하나의 추상메소드를 가진 인터페이스는 람다식 표현이 가능하다.
    : 함수형 인터페이스에서만 가능
    : 기본 형식
      (매개변수) -> { 실행문; };
      
*/
public class Ex03_Lambda {
	public static void main(String[] args) {
		// 매개변수가 없고, 리턴 타입이 void 인 표현식
		// User3 obj = () -> { System.out.println("Lambda 표현식..."); };
		User3 obj = () -> System.out.println("Lambda 표현식...");
			// 실행문이 한줄인 경우 {} 생략 가능
		obj.disp();
	}
}

interface User3 {
	public void disp();
}
