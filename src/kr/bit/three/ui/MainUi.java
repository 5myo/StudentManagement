package kr.bit.three.ui;

import java.util.Scanner;

public class MainUi {
	public String UiMethod() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println();
		System.out.println("======================");
		System.out.println();
		System.out.println("            ��Ʈ ���б� �л���� �ý���");
		System.out.println();
		System.out.println("======================");
		System.out.println();
		System.out.println("    1. �л�");
		System.out.println("    2. ����");
		System.out.println("    3. ������");
		System.out.println();
		System.out.println("------------------------------------");
		System.out.printf("����� ������ ������ �ּ��� >> ");
		String inputNum = scan.nextLine();
		
		return inputNum;
	}
}
