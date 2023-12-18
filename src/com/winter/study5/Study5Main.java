package com.winter.study5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

//		엄청 자주쓰니 꼭알아두기
public class Study5Main {
	public static void main(String[] args) {

//		String str =null;
//		System.out.println(str.toString());
//		System.out.println("종료 합니다.");//위에 오류났기 때문에 출력x
		
//		Error
//		int a;
//		System.out.println(a);
		
		
//		Exception
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력");//first 입력
		try {
			int num = sc.nextInt();//콘솔에 라이브러리명은 건너띄고 내가 만든건만 보래
			//throw new InputMismatchException();//만들어진거 던짐
//		}catch(InputMismatchException e) { //던진타입 매개변수
//			//모든예외 부모 object 참고.https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/InputMismatchException.html
//			System.out.println("Exception 발생");
//		}
		System.out.println("정상진행");
		
		
		int[] arr = new int[2];
		arr[3] =10;
		//new ArrayIndexOutOfBoundsException(); 해당 객체 자동 만들어짐
		//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/ArrayIndexOutOfBoundsException.html
}catch (InputMismatchException e) {
			
			// TODO: handle exception
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			
		}catch (RuntimeException e) {
			// TODO: handle exception
		}catch (Exception e) {
			// TODO: handle exception
		}catch (Throwable e) {
			// TODO: handle exception
		}finally {//예외 발생하든말든 무조건 실행
			
			
		}
		
		
		
		
		
		int a = 10;
		a= a/0;
		//new ArithmeticException
		 
		 
		Test t = new Test();
		ArrayList<Integer> ar = null;
		t.t1(ar);
		System.out.println("종료 합니다.");
		
		//예외처리 예외 일어나도 프로그램 계속 실행되도록 처리
		
	}
}
