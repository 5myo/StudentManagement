package kr.bit.three.ui;

import java.util.Scanner;

public class ProfessorUi {
	public String professorMethod() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("======================");
		System.out.println();
		System.out.println("        ��Ʈ ���б� �л���� �ý���(����)");
		System.out.println();
		System.out.println("======================");
		System.out.println();
		System.out.println("    1. �� ���� ��� ��ȸ");
		System.out.println("    2. ���� ���");
		System.out.println("    3. ���� ����");
		System.out.println("    0. �����޴�");
		System.out.println();
		System.out.println("------------------------------------");
		System.out.printf("����� ������ ������ �ּ��� >> ");
		String inputNum = scan.nextLine();
		return inputNum;
	}
}
