package kr.bit.three.uicontroller;

import kr.bit.three.ui.AdminUi;
import kr.bit.three.ui.MainUi;
import kr.bit.three.ui.ProfessorUi;
import kr.bit.three.ui.StudentUi;

public class ProfessorController {
	String input;
	
	public String professorMethod() {
		input = "";

		Lib lib = new Lib();
		ProfessorUi professor_ui = new ProfessorUi();
		MainController main_c = new MainController();
		
		
		input = professor_ui.professorMethod();
		if(input.equals("1")) { //�л� ���� ����
			lib.cls();
			System.out.println("�� ���� ����� ��ȸ�Ͽ����ϴ�.");
			lib.cls();
			this.professorMethod();
		}else if(input.equals("2")) {//���� ���� ����
			lib.cls();
			System.out.println("������ ����Ͽ����ϴ�.");
			lib.cls();
			this.professorMethod();
		}else if(input.equals("3")) { //������ ���� ����
			lib.cls();
			System.out.println("������ �����Ͽ����ϴ�.");
			lib.cls();
			this.professorMethod();
		}else if(input.equals("0")) { //������ ���� ����
			lib.cls();
			main_c.mainMethod();
		}
		return input;
	}
}
