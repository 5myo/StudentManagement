package kr.bit.three.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Screen {
	private int inputNum; //입력값
	private ArrayList<HashMap<String, String>>personallnfoList;
	
	public Screen(int inputNum) { //Screen 변수 초기값 할당 
		this.inputNum = inputNum;
		personallnfoList = new ArrayList<HashMap<String, String>>();
	}

//	public void Run() 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) { //초기 화면
			System.out.println("+------------------------+");
			System.out.println("    비트 대학교 학사관리 시스템");
			System.out.println("+------------------------+");
			System.out.println("    1. 등록");
			System.out.println("    2. 검색");
			System.out.println("    3. 삭제");
			System.out.println("    4. 전체 출력");
			System.out.println("    0. 종료");
			System.out.println("+------------------------+");
			System.out.println("    번호를 입력해 주세요.");
			int inputNum = scan.nextInt();
			
			if(inputNum==0) { //등록 메뉴 화면
				System.out.println("시스템을 종료합니다.");
				break;
			}

			if(inputNum==1) { //등록 메뉴 화면
				System.out.println("+------------------------+");
				System.out.println("                메뉴 선택");
				System.out.println("+------------------------+");
				System.out.println("    1. 학생");
				System.out.println("    2. 교수");
				System.out.println("    3. 관리자");
				System.out.println("    0. 이전메뉴");
				System.out.println("+------------------------+");
				System.out.println("    사용자 계정을 입력해 주세요.");
				inputNum = scan.nextInt();
				
				if(inputNum==1) {//학생
					HashMap<String, String> personallnfoHash = new HashMap<String, String>();
					System.out.println("+------------------------+");
					System.out.println("    이름 : "); //학생의 개인정보 입력
					String name = scan.nextLine();
					scan.nextLine();
					System.out.println("    학번 : ");
					String regld = scan.nextLine();
					System.out.println("    소속학과 : ");
					String dept = scan.nextLine();
					System.out.println("    주민번호 : ");
					String jumin = scan.nextLine();
					System.out.println("    전화번호 : ");
					String phNo = scan.nextLine();
					System.out.println("    수강과목 : ");
					String subject = scan.nextLine();
//					List<String>lectures = new ArrayList<String>();
//					for(int i=0; i<lectures.size(); i++) {
//						lectures.add(subject);
//						System.out.printf("수강과목 : %s",lectures);
//					}
					
					personallnfoHash.put("이름", name);
					personallnfoHash.put("학번", regld);
					personallnfoHash.put("소속학과", dept);
					personallnfoHash.put("주민번호", jumin);
					personallnfoHash.put("전화번호", phNo);
					personallnfoHash.put("수강과목", subject);
//					personallnfoList.add(personallnfoHash);
					System.out.println("학생 계정이 등록되었습니다.");
//					Lecture 타입의 동적배열을 만들어서 수강과목을 넣어야하는데
//					아직 Lecture의 메소드 구현이 안되어 있음
//					Lecture lec = new Lecture();

				}else if(inputNum==2) {//교수
					HashMap<String, String> personallnfoHash = new HashMap<String, String>();
					
					scan.nextLine();
					System.out.println("+------------------------+");
					System.out.println("    이름 : "); //교수의 개인정보 입력
					String name = scan.nextLine();
					System.out.println("    교번 : ");
					String regld = scan.nextLine();
					System.out.println("    소속학과 : ");
					String dept = scan.nextLine();
					System.out.println("    주민번호 : ");
					String jumin = scan.nextLine();
					System.out.println("    전화번호 : ");
					String phNo = scan.nextLine();
					System.out.println("    개설과목 : ");
					String subject = scan.nextLine();
//					List<String>lectures = new ArrayList<String>();
//					for(int i=0; i<lectures.size(); i++) {
//						lectures.add(subject);
//						System.out.printf("개설과목 : %s",lectures);
//					}
					
					personallnfoHash.put("이름", name);
					personallnfoHash.put("교번", regld);
					personallnfoHash.put("소속학과", dept);
					personallnfoHash.put("주민번호", jumin);
					personallnfoHash.put("전화번호", phNo);
					personallnfoHash.put("개설과목", subject);
//					personallnfoList.add(personallnfoHash);
					System.out.println("학생 계정이 등록되었습니다.");
//					Lecture 타입의 동적배열을 만들어서 개설과목을 넣어야하는데
//					아직 Lecture의 메소드 구현이 안되어 있음
//					Lecture lec = new Lecture();
				}else if(inputNum==3) {//관리자
					HashMap<String, String> personallnfoHash = new HashMap<String, String>();
					scan.nextLine();
					System.out.println("+------------------------+");
					System.out.println("    이름 : "); //관리자의 개인정보 입력
					String name = scan.nextLine();
					System.out.println("    교번 : ");
					String regld = scan.nextLine();
					System.out.println("    소속학과 : ");
					String dept = scan.nextLine();
					System.out.println("    주민번호 : ");
					String jumin = scan.nextLine();
					System.out.println("    전화번호 : ");
					String phNo = scan.nextLine();
					System.out.println("    개설과목 : ");
					String subject = scan.nextLine();
//					List<String>lectures = new ArrayList<String>();
//					for(int i=0; i<lectures.size(); i++) {
//						lectures.add(subject);
//						System.out.printf("개설과목 : %s",lectures);
//					}
					
					personallnfoHash.put("이름", name);
					personallnfoHash.put("교번", regld);
					personallnfoHash.put("소속학과", dept);
					personallnfoHash.put("주민번호", jumin);
					personallnfoHash.put("전화번호", phNo);
					personallnfoHash.put("개설과목", subject);
//					personallnfoList.add(personallnfoHash);
					System.out.println("관리자 계정이 등록되었습니다.");
//					Lecture 타입의 동적배열을 만들어서 개설과목을 넣어야하는데
//					아직 Lecture의 메소드 구현이 안되어 있음
//					Lecture lec = new Lecture();
				}else if(inputNum==4) {//이전메뉴
					continue;
				}
			}
		}
	}
}
