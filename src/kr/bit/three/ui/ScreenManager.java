package kr.bit.three.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ScreenManager{
	private int inputNum; //입력값
	private ArrayList<HashMap<String, String>>personallnfoList;
	Scanner scan;
	
	public ScreenManager(int inputNum) { //Screen 변수 초기값 할당 
		this.inputNum = inputNum;
		personallnfoList = new ArrayList<HashMap<String, String>>();
		Scanner scan = new Scanner(System.in);
	}

	public void Run(Scanner scan) {
	while(true) { //등록 메뉴 화면
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
			System.out.println("    이름 : "); //등록할 학생의 개인정보 입력
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
			System.out.println("    이름 : "); //등록할 교수의 개인정보 입력
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
			System.out.println("    이름 : "); //등록할 관리자의 개인정보 입력
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
	public static void Search(Scanner scan, ArrayList<HashMap<String, String>> personallnfoList) {
		System.out.println("+------------------------+"); //검색 화면
		System.out.println("    찾으실 계정의 이름을 입력해 주세요."); 
		System.out.println("    이름 : ");
		String searchName = scan.nextLine();
		
		for(int i=0; i<personallnfoList.size(); i++) {
			HashMap<String, String> personallnfoHash = personallnfoList.get(i);
			String brand = personallnfoHash.get("brand");
			
			if(brand.equals("1")) { 
				String name = personallnfoHash.get("name"); //이름을 입력하여 학생의 정보를 검색
				
				if(name.equals(searchName)) {
					System.out.println("+------------------------+");
					System.out.print("    이름 : ");
					System.out.print(personallnfoHash.get("name") + ("\n"));
					System.out.print("    학번 : ");
					System.out.print(personallnfoHash.get("regld") + ("\n"));
					System.out.print("    소속학과 : ");
					System.out.print(personallnfoHash.get("dept") + ("\n"));
					System.out.print("    주민번호 : ");
					System.out.print(personallnfoHash.get("jumin") + ("\n"));
					System.out.print("    전화번호 : ");
					System.out.print(personallnfoHash.get("phNo") + ("\n"));
					System.out.print("    수강과목 : ");
					System.out.print(personallnfoHash.get("subject") + ("\n"));
				}
			}else if(brand.equals("2")) {
				String name = personallnfoHash.get("name"); //이름을 입력하여 교수의 정보를 검색
				
				if(name.equals(searchName)) {
					System.out.println("+------------------------+");
					System.out.print("    이름 : ");
					System.out.print(personallnfoHash.get("name") + ("\n"));
					System.out.print("    교번 : ");
					System.out.print(personallnfoHash.get("regld") + ("\n"));
					System.out.print("    소속학과 : ");
					System.out.print(personallnfoHash.get("dept") + ("\n"));
					System.out.print("    주민번호 : ");
					System.out.print(personallnfoHash.get("jumin") + ("\n"));
					System.out.print("    전화번호 : ");
					System.out.print(personallnfoHash.get("phNo") + ("\n"));
					System.out.print("    개설과목 : ");
					System.out.print(personallnfoHash.get("subject") + ("\n"));
				}
			}else if(brand.equals("3")) {
				String name = personallnfoHash.get("name"); //이름을 입력하여 관리자의 정보를 검색
				
				if(name.equals(searchName)) {
					System.out.println("+------------------------+");
					System.out.print("    이름 : ");
					System.out.print(personallnfoHash.get("name") + ("\n"));
					System.out.print("    교번 : ");
					System.out.print(personallnfoHash.get("regld") + ("\n"));
					System.out.print("    소속학과 : ");
					System.out.print(personallnfoHash.get("dept") + ("\n"));
					System.out.print("    주민번호 : ");
					System.out.print(personallnfoHash.get("jumin") + ("\n"));
					System.out.print("    전화번호 : ");
					System.out.print(personallnfoHash.get("phNo") + ("\n"));
					System.out.print("    개설과목 : ");
					System.out.print(personallnfoHash.get("subject") + ("\n"));
				}
			}
		}
	}
	
	public static void Delete(Scanner scan, ArrayList<HashMap<String, String>>personallnfoList) {
		System.out.println("+------------------------+"); //삭제 화면
		System.out.println("    삭제하실 계정의 이름을 입력해 주세요.");
		System.out.print("    이름 : ");
		String deleteName = scan.nextLine();
		
		for(int i=0; i<personallnfoList.size(); i++) { 
			HashMap<String, String> personallnfoHash = personallnfoList.get(i);
			String brand = personallnfoHash.get("brand");
			
			if(brand.equals("1")) {
				String name = personallnfoHash.get("name"); //학생 계정의 이름을 입력하여 계정 삭제
				
				if(name.equals(deleteName)) {
					personallnfoList.remove(i);
					System.out.println(    deleteName + "님의 계정이 삭제되었습니다.");
				}
			}else if(brand.equals("2")) {
				String name = personallnfoHash.get("name"); //교수의 계정의 이름을 입력하여 계정 삭제
				
				if(name.equals(deleteName)) {
					personallnfoList.remove(i);
					System.out.println(    deleteName + "님의 계정이 삭제되었습니다.");
				}
			}else if(brand.equals("3")) {
				String name = personallnfoHash.get("name");//관리자의 계정의 이름을 입력하여 계정 삭제
				
				if(name.equals(deleteName)) {
					personallnfoList.remove(i);
					System.out.println(    deleteName + "님의 계정이 삭제되었습니다.");
				}
			}
		}
	}
	
	public static void List(ArrayList<HashMap<String, String>> personallnfoList) { //전체 출력 화면
		for(int i=0; i<personallnfoList.size(); i++) {
			HashMap<String, String> haksaHash = personallnfoList.get(i);
			String brand = haksaHash.get("brand");
			
			if(brand.equals("1")) {
				System.out.println("+------------------------+");
				System.out.print("    이름 : ");
				System.out.print(haksaHash.get("name") + ("\n"));
				System.out.print("    교번 : ");
				System.out.print(haksaHash.get("regld") + ("\n"));
				System.out.print("    소속학과 : ");
				System.out.print(haksaHash.get("dept") + ("\n"));
				System.out.print("    주민번호 : ");
				System.out.print(haksaHash.get("jumin") + ("\n"));
				System.out.print("    전화번호 : ");
				System.out.print(haksaHash.get("phNo") + ("\n"));
				System.out.print("    수강강의 : ");
				System.out.print(haksaHash.get("subject") + ("\n"));
				
			}else if(brand.equals("2")) {
				System.out.println("+------------------------+");
				System.out.print("    이름 : ");
				System.out.print(haksaHash.get("name") + ("\n"));
				System.out.print("    교번 : ");
				System.out.print(haksaHash.get("regld") + ("\n"));
				System.out.print("    소속학과 : ");
				System.out.print(haksaHash.get("dept") + ("\n"));
				System.out.print("    주민번호 : ");
				System.out.print(haksaHash.get("jumin") + ("\n"));
				System.out.print("    전화번호 : ");
				System.out.print(haksaHash.get("phNo") + ("\n"));
				System.out.print("    개설강의 : ");
				System.out.print(haksaHash.get("subject") + ("\n"));
				
			}else if(brand.equals("3")) {
				System.out.println("+------------------------+");
				System.out.print("    이름 : ");
				System.out.print(haksaHash.get("name") + ("\n"));
				System.out.print("    교번 : ");
				System.out.print(haksaHash.get("regld") + ("\n"));
				System.out.print("    소속학과 : ");
				System.out.print(haksaHash.get("dept") + ("\n"));
				System.out.print("    주민번호 : ");
				System.out.print(haksaHash.get("jumin") + ("\n"));
				System.out.print("    전화번호 : ");
				System.out.print(haksaHash.get("phNo") + ("\n"));
				System.out.print("    개설강의 : ");
				System.out.print(haksaHash.get("subject") + ("\n"));
			}
		}
	}
}
