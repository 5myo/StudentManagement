package kr.bit.three.uicontroller;

import kr.bit.three.ui.AdminUi;
import kr.bit.three.ui.ProfessorUi;
import kr.bit.three.ui.StudentUi;
import kr.bit.three.ui.MainUi;

public class MainController{
	String input;
	
	public String mainMethod() {
		input = "";

		Lib lib = new Lib();
		MainUi ui = new MainUi();
		StudentController student_c = new StudentController();
		ProfessorController professor_c= new ProfessorController();
		AdminController admin_c = new AdminController();
		
		input = ui.UiMethod();
		if(input.equals("1")) { //�л� ���� ����
			lib.cls();
			student_c.studentMethod(); //�л� ȭ�� ���
		}else if(input.equals("2")) {//���� ���� ����
			lib.cls();
			professor_c.professorMethod(); //���� ȭ�� ���
		}else if(input.equals("3")) { //������ ���� ����
			lib.cls();
			admin_c.adminMethod();//������ ���� ���
		}
		return input;
	}
}
