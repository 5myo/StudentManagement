package kr.bit.three.ui;

import java.util.Scanner;

public class StudentUi {
	public String studentMethod(){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("======================");
		System.out.println();
		System.out.println("        ��Ʈ ���б� �л���� �ý���(�л�)");   
		System.out.println();
		System.out.println("======================");
		System.out.println();
		System.out.println("    1. ���� ��û");
		System.out.println("    2. ���� ���");
		System.out.println("    3. ���� ��� ��ȸ");
		System.out.println("    4. ���� ��ȸ");
		System.out.println("    0. �����޴�");
		System.out.println();
		System.out.println("------------------------------------");
		System.out.printf("����� ������ ������ �ּ��� >> ");
		String inputNum = scan.nextLine();
		
		return inputNum;
	}
}
