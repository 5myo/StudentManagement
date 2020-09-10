package kr.bit.three.uicontroller;

import kr.bit.three.ui.AdminUi;
import kr.bit.three.ui.MainUi;
import kr.bit.three.ui.ProfessorUi;
import kr.bit.three.ui.StudentUi;

public class AdminController {
	String input;
	
	public String adminMethod() {
		input = "";

		Lib lib = new Lib();
		AdminUi admin_ui = new AdminUi();
		MainController main_c = new MainController();
		
		
		input = admin_ui.adminUi();
		if(input.equals("1")) { //�л� ���� ����
			lib.cls();
			System.out.println("�л� ���� �������Դϴ�.");
			lib.cls();
			this.adminStudentMethod();
		}else if(input.equals("2")) {//���� ���� ����
			lib.cls();
			System.out.println("����  ���� �������Դϴ�.");
			lib.cls();
			this.adminProfessorMethod();
		}else if(input.equals("3")) { //������ ���� ����
			lib.cls();
			System.out.println("���� ���� �������Դϴ�.");
			lib.cls();
			this.adminSubjectMethod();
		}else if(input.equals("0")) { //������ ���� ����
			lib.cls();
			main_c.mainMethod();
		}
		return input;
	}
	
	public String adminStudentMethod() {
		input = "";

		Lib lib = new Lib();
		AdminUi admin_ui = new AdminUi();
		
		input = admin_ui.manageStudent();
		if(input.equals("1")) { //�л� ���� ����
			lib.cls();
			System.out.println("�л� ������ ��ϵǾ����ϴ�.");
			lib.cls();
			this.adminStudentMethod();
		}else if(input.equals("2")) {//���� ���� ����
			lib.cls();
			System.out.println("�л� ������ �����Ǿ����ϴ�.");
			lib.cls();
			this.adminStudentMethod();
		}else if(input.equals("3")) { //������ ���� ����
			lib.cls();
			System.out.println("��ü �л� ������ ��ȸ�Ͽ����ϴ�.");
			lib.cls();
			this.adminStudentMethod();
		}else if(input.equals("4")) { //������ ���� ����
			lib.cls();
			System.out.println("���� ���� �л� ������ ��ȸ�Ͽ����ϴ�.");
			lib.cls();
			this.adminStudentMethod();
		}else if(input.equals("0")) { //������ ���� ����
			lib.cls();
			this.adminMethod();
		}
		return input;
	}	

	public String adminProfessorMethod() {
		input = "";

		Lib lib = new Lib();
		AdminUi admin_ui = new AdminUi();
		
		input = admin_ui.manageProfessor();
		if(input.equals("1")) { //�л� ���� ����
			lib.cls();
			System.out.println("���� ������ ��ϵǾ����ϴ�.");
			lib.cls();
			this.adminProfessorMethod();
		}else if(input.equals("2")) {//���� ���� ����
			lib.cls();
			System.out.println("���� ������ �����Ǿ����ϴ�.");
			lib.cls();
			this.adminProfessorMethod();
		}else if(input.equals("3")) { //������ ���� ����
			lib.cls();
			System.out.println("���� ������ ��ȸ�Ͽ����ϴ�.");
			lib.cls();
			this.adminProfessorMethod();
		}else if(input.equals("4")) { //������ ���� ����
			lib.cls();
			System.out.println("���� ���� �������Դϴ�.");
			lib.cls();
			this.adminProfessorMethod();
		}else if(input.equals("0")) { //������ ���� ����
			lib.cls();
			this.adminMethod();
		}
		return input;
	}	

	public String adminSubjectMethod() {
		input = "";

		Lib lib = new Lib();
		AdminUi admin_ui = new AdminUi();
		
		input = admin_ui.manageSubject();
		if(input.equals("1")) { //�л� ���� ����
			lib.cls();
			System.out.println("���Ǹ� �����Ͽ����ϴ�.");
			lib.cls();
			this.adminSubjectMethod();
		}else if(input.equals("2")) {//���� ���� ����
			lib.cls();
			System.out.println("���� ������ �����Ͽ����ϴ�.");
			lib.cls();
			this.adminSubjectMethod();
		}else if(input.equals("3")) { //������ ���� ����
			lib.cls();
			System.out.println("���� ������ �����Ͽ����ϴ�.");
			lib.cls();
			this.adminSubjectMethod();
		}else if(input.equals("4")) { //������ ���� ����
			lib.cls();
			System.out.println("���� ������ ��ȸ�Ͽ����ϴ�.");
			lib.cls();
			this.adminSubjectMethod();
		}else if(input.equals("0")) { //������ ���� ����
			lib.cls();
			this.adminMethod();
		}
		return input;
	}	
}
