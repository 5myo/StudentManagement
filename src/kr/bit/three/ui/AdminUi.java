package kr.bit.three.ui;

import java.util.Scanner;

public class AdminUi {
	String input;
	
	public String adminUi() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("======================");
		System.out.println();
		System.out.println("        ��Ʈ ���б� �л���� �ý���(������)");
		System.out.println();
		System.out.println("======================");
		System.out.println();
		System.out.println("    1. �л� ����");
		System.out.println("    2. ���� ����");
		System.out.println("    3. ���� ����");
		System.out.println("    4. ���� ����");
		System.out.println("    0. �����޴�");
		System.out.println();
		System.out.println("------------------------------------");
		System.out.printf("����� ������ ������ �ּ��� >> ");
		String inputNum = scan.nextLine();
		
		return inputNum;
	}
	
	public String manageStudent(){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("======================");
		System.out.println();
		System.out.println("        �л� ����");
		System.out.println();
		System.out.println("======================");
		System.out.println();
		System.out.println("    1. �л� ���");
		System.out.println("    2. �л� ����");
		System.out.println("    3. ��ü �л� ��ȸ");
		System.out.println("    4. ���� ���� �л� ��ȸ");
		System.out.println("    0. �����޴�");
		System.out.println();
		System.out.println("------------------------------------");
		System.out.printf("����� ������ ������ �ּ��� >> ");
		String inputNum = scan.nextLine();
		return inputNum;
	}
	
	public String manageProfessor(){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("======================");
		System.out.println();
		System.out.println("        ���� ����");
		System.out.println();
		System.out.println("======================");
		System.out.println();
		System.out.println("    1. ���� ���");
		System.out.println("    2. ���� ����");
		System.out.println("    3. ���� ��ȸ");
		System.out.println("    0. �����޴�");
		System.out.println();
		System.out.println("------------------------------------");
		System.out.printf("����� ������ ������ �ּ��� >> ");
		String inputNum = scan.nextLine();
		return inputNum;
	}
	
	public String manageSubject(){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("======================");
		System.out.println();
		System.out.println("        ���� ����");
		System.out.println();
		System.out.println("======================");
		System.out.println();
		System.out.println("    1. ���� ����");
		System.out.println("    2. ���� ����");
		System.out.println("    3. ���� ����");
		System.out.println("    4. ���� ��ȸ");
		System.out.println("    0. �����޴�");
		System.out.println();
		System.out.println("------------------------------------");
		System.out.printf("����� ������ ������ �ּ��� >> ");
		String inputNum = scan.nextLine();
		return inputNum;
	}		
}
