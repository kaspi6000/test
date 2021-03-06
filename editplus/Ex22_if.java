import java.io.*;

class Ex22_if {
	public static void main(String[] args) throws Exception {

		/*
			제어문
				- 프로그램 코드의 실행 순서를 제어하는 역할

			1. 조건문
				a. if
				b. switch

			2. 반복문
				a. for
				b. while
				c. do while
				d. for

			3. 분기문
				a. break
				b. continue
				[c. goto] x

			
			if 문
				- 조건을 제시한 후 결과에 따라서 실행할 코드를 선택
				- 조건은 반드시 boolean값을 가진다.
				- A ? B : C;

			기본 골격

			if(조건식) {
			
				실행 코드;
			}


			if(조건식) {
			
				실행 코드;
			}else {
				
				실행 코드;
			}


			다중 if문

			if(조건식) {
			
				실행 코드;
			}else if(조건식) {
				
				실행 코드;
			}else if(조건식) {
				
				실행 코드;
			}else {
				
				실행 코드;
			}
		*/

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		//요구사항] 숫자 1개 입력 받아 양수인지?
		System.out.print("숫자 입력 : ");

		int num = Integer.parseInt(reader.readLine());

		if(num > 0) {
			//true block, 참
			System.out.printf("입력한 숫자 %d는 양수입니다.\n", num);
		}

		//양수? 음수?
		if(num > 0) {
			
			System.out.printf("입력한 숫자 %d는 양수입니다.\n", num);
		}else {
			
			System.out.printf("입력한 숫자 %d는 음수입니다.\n", num);
		}

		//
		if(num > 0) {
			
			System.out.printf("입력한 숫자 %d는 양수입니다.\n", num);
		}else if(num < 0) {
			
			System.out.printf("입력한 숫자 %d는 음수입니다.\n", num);
		}else if(num ==0) {
			System.out.println("0입니다.");
		}

		System.out.println("프로그램 종료");
	}
}
