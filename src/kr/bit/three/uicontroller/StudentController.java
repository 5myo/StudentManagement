package kr.bit.three.uicontroller;

import kr.bit.three.ui.AdminUi;
import kr.bit.three.ui.MainUi;
import kr.bit.three.ui.ProfessorUi;
import kr.bit.three.ui.StudentUi;

public class StudentController {
	String input;
	
	public String studentMethod() {
		input = "";

		Lib lib = new Lib();
		StudentUi student_ui = new StudentUi();
		MainController main_c = new MainController();
		
		
		input = student_ui.studentMethod();
		if(input.equals("1")) { //�л� ���� ����
			lib.cls();
			System.out.println("���� ��û�� �Ϸ�Ǿ����ϴ�.");
			lib.cls();
			this.studentMethod();
		}else if(input.equals("2")) {//���� ���� ����
			lib.cls();
			System.out.println("���� ��Ұ� �Ϸ�Ǿ����ϴ�.");
			lib.cls();
			this.studentMethod();
		}else if(input.equals("3")) { //������ ���� ����
			lib.cls();
			System.out.println("���� ����� ��ȸ�Ǿ����ϴ�.");
			lib.cls();
			this.studentMethod();
		}else if(input.equals("4")) { //������ ���� ����
			lib.cls();
			System.out.println("������ ��ȸ�Ǿ����ϴ�.");
			lib.cls();
			this.studentMethod();
		}else if(input.equals("0")) { //������ ���� ����
			lib.cls();
			main_c.mainMethod();
		}
		return input;
	}
}
