package ex02;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("당신의 이름을 입력하세요 : ");
		String name = input.nextLine();
		System.out.print("연락처를 입력하세요 : ");
		int phone = input.nextInt();
		System.out.println("**************************************************");
		System.out.println("\t Welcome to Shopping Mall");
		System.out.println("\t Welcome to Book Market!");
		System.out.println("**************************************************");		
		System.out.println("1. 고객 정보 확인하기 \t 4. 바구니에 항목 추가하기");
		System.out.println("2. 장바구니 상품 목록 보기 \t 5. 장바구니의 항목 수량 줄이기");
		System.out.println("3. 장바구니 비우기 \t 6. 장바구니의 항목 삭제하기");
		System.out.println("7. 영수증 표시하기 \t 8. 종료");
		System.out.println("**************************************************");
		System.out.print("메뉴 번호를 선택해 주세요 ");
		int num = input.nextInt();
		System.out.println(num + "번을 선택하셨습니다.");

	}

}
