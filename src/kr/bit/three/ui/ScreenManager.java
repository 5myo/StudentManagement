package kr.bit.three.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ScreenManager{
	private int inputNum; //�Է°�
	private ArrayList<HashMap<String, String>>personallnfoList;
	Scanner scan;
	
	public ScreenManager(int inputNum) { //Screen ���� �ʱⰪ �Ҵ� 
		this.inputNum = inputNum;
		personallnfoList = new ArrayList<HashMap<String, String>>();
		Scanner scan = new Scanner(System.in);
	}

	public void Run(Scanner scan) {
	while(true) { //��� �޴� ȭ��
		System.out.println("+------------------------+");
		System.out.println("                �޴� ����");
		System.out.println("+------------------------+");
		System.out.println("    1. �л�");
		System.out.println("    2. ����");
		System.out.println("    3. ������");
		System.out.println("    0. �����޴�");
		System.out.println("+------------------------+");
		System.out.println("    ����� ������ �Է��� �ּ���.");
		inputNum = scan.nextInt();
		
		if(inputNum==1) {//�л�
			HashMap<String, String> personallnfoHash = new HashMap<String, String>();
			System.out.println("+------------------------+");
			System.out.println("    �̸� : "); //����� �л��� �������� �Է�
			String name = scan.nextLine();
			scan.nextLine();
			System.out.println("    �й� : ");
			String regld = scan.nextLine();
			System.out.println("    �Ҽ��а� : ");
			String dept = scan.nextLine();
			System.out.println("    �ֹι�ȣ : ");
			String jumin = scan.nextLine();
			System.out.println("    ��ȭ��ȣ : ");
			String phNo = scan.nextLine();
			System.out.println("    �������� : ");
			String subject = scan.nextLine();
//					List<String>lectures = new ArrayList<String>();
//					for(int i=0; i<lectures.size(); i++) {
//						lectures.add(subject);
//						System.out.printf("�������� : %s",lectures);
//					}
			
			personallnfoHash.put("�̸�", name);
			personallnfoHash.put("�й�", regld);
			personallnfoHash.put("�Ҽ��а�", dept);
			personallnfoHash.put("�ֹι�ȣ", jumin);
			personallnfoHash.put("��ȭ��ȣ", phNo);
			personallnfoHash.put("��������", subject);
//					personallnfoList.add(personallnfoHash);
			System.out.println("�л� ������ ��ϵǾ����ϴ�.");
//					Lecture Ÿ���� �����迭�� ���� ���������� �־���ϴµ�
//					���� Lecture�� �޼ҵ� ������ �ȵǾ� ����
//					Lecture lec = new Lecture();

		}else if(inputNum==2) {//����
			HashMap<String, String> personallnfoHash = new HashMap<String, String>();
			
			scan.nextLine();
			System.out.println("+------------------------+");
			System.out.println("    �̸� : "); //����� ������ �������� �Է�
			String name = scan.nextLine();
			System.out.println("    ���� : ");
			String regld = scan.nextLine();
			System.out.println("    �Ҽ��а� : ");
			String dept = scan.nextLine();
			System.out.println("    �ֹι�ȣ : ");
			String jumin = scan.nextLine();
			System.out.println("    ��ȭ��ȣ : ");
			String phNo = scan.nextLine();
			System.out.println("    �������� : ");
			String subject = scan.nextLine();
//					List<String>lectures = new ArrayList<String>();
//					for(int i=0; i<lectures.size(); i++) {
//						lectures.add(subject);
//						System.out.printf("�������� : %s",lectures);
//					}
			
			personallnfoHash.put("�̸�", name);
			personallnfoHash.put("����", regld);
			personallnfoHash.put("�Ҽ��а�", dept);
			personallnfoHash.put("�ֹι�ȣ", jumin);
			personallnfoHash.put("��ȭ��ȣ", phNo);
			personallnfoHash.put("��������", subject);
//					personallnfoList.add(personallnfoHash);
			System.out.println("�л� ������ ��ϵǾ����ϴ�.");
//					Lecture Ÿ���� �����迭�� ���� ���������� �־���ϴµ�
//					���� Lecture�� �޼ҵ� ������ �ȵǾ� ����
//					Lecture lec = new Lecture();
		}else if(inputNum==3) {//������
			HashMap<String, String> personallnfoHash = new HashMap<String, String>();
			scan.nextLine();
			System.out.println("+------------------------+");
			System.out.println("    �̸� : "); //����� �������� �������� �Է�
			String name = scan.nextLine();
			System.out.println("    ���� : ");
			String regld = scan.nextLine();
			System.out.println("    �Ҽ��а� : ");
			String dept = scan.nextLine();
			System.out.println("    �ֹι�ȣ : ");
			String jumin = scan.nextLine();
			System.out.println("    ��ȭ��ȣ : ");
			String phNo = scan.nextLine();
			System.out.println("    �������� : ");
			String subject = scan.nextLine();
//					List<String>lectures = new ArrayList<String>();
//					for(int i=0; i<lectures.size(); i++) {
//						lectures.add(subject);
//						System.out.printf("�������� : %s",lectures);
//					}
			
			personallnfoHash.put("�̸�", name);
			personallnfoHash.put("����", regld);
			personallnfoHash.put("�Ҽ��а�", dept);
			personallnfoHash.put("�ֹι�ȣ", jumin);
			personallnfoHash.put("��ȭ��ȣ", phNo);
			personallnfoHash.put("��������", subject);
//					personallnfoList.add(personallnfoHash);
			System.out.println("������ ������ ��ϵǾ����ϴ�.");
//					Lecture Ÿ���� �����迭�� ���� ���������� �־���ϴµ�
//					���� Lecture�� �޼ҵ� ������ �ȵǾ� ����
//					Lecture lec = new Lecture();
		}else if(inputNum==4) {//�����޴�
			continue;
			}
		}
	}
	public static void Search(Scanner scan, ArrayList<HashMap<String, String>> personallnfoList) {
		System.out.println("+------------------------+"); //�˻� ȭ��
		System.out.println("    ã���� ������ �̸��� �Է��� �ּ���."); 
		System.out.println("    �̸� : ");
		String searchName = scan.nextLine();
		
		for(int i=0; i<personallnfoList.size(); i++) {
			HashMap<String, String> personallnfoHash = personallnfoList.get(i);
			String brand = personallnfoHash.get("brand");
			
			if(brand.equals("1")) { 
				String name = personallnfoHash.get("name"); //�̸��� �Է��Ͽ� �л��� ������ �˻�
				
				if(name.equals(searchName)) {
					System.out.println("+------------------------+");
					System.out.print("    �̸� : ");
					System.out.print(personallnfoHash.get("name") + ("\n"));
					System.out.print("    �й� : ");
					System.out.print(personallnfoHash.get("regld") + ("\n"));
					System.out.print("    �Ҽ��а� : ");
					System.out.print(personallnfoHash.get("dept") + ("\n"));
					System.out.print("    �ֹι�ȣ : ");
					System.out.print(personallnfoHash.get("jumin") + ("\n"));
					System.out.print("    ��ȭ��ȣ : ");
					System.out.print(personallnfoHash.get("phNo") + ("\n"));
					System.out.print("    �������� : ");
					System.out.print(personallnfoHash.get("subject") + ("\n"));
				}
			}else if(brand.equals("2")) {
				String name = personallnfoHash.get("name"); //�̸��� �Է��Ͽ� ������ ������ �˻�
				
				if(name.equals(searchName)) {
					System.out.println("+------------------------+");
					System.out.print("    �̸� : ");
					System.out.print(personallnfoHash.get("name") + ("\n"));
					System.out.print("    ���� : ");
					System.out.print(personallnfoHash.get("regld") + ("\n"));
					System.out.print("    �Ҽ��а� : ");
					System.out.print(personallnfoHash.get("dept") + ("\n"));
					System.out.print("    �ֹι�ȣ : ");
					System.out.print(personallnfoHash.get("jumin") + ("\n"));
					System.out.print("    ��ȭ��ȣ : ");
					System.out.print(personallnfoHash.get("phNo") + ("\n"));
					System.out.print("    �������� : ");
					System.out.print(personallnfoHash.get("subject") + ("\n"));
				}
			}else if(brand.equals("3")) {
				String name = personallnfoHash.get("name"); //�̸��� �Է��Ͽ� �������� ������ �˻�
				
				if(name.equals(searchName)) {
					System.out.println("+------------------------+");
					System.out.print("    �̸� : ");
					System.out.print(personallnfoHash.get("name") + ("\n"));
					System.out.print("    ���� : ");
					System.out.print(personallnfoHash.get("regld") + ("\n"));
					System.out.print("    �Ҽ��а� : ");
					System.out.print(personallnfoHash.get("dept") + ("\n"));
					System.out.print("    �ֹι�ȣ : ");
					System.out.print(personallnfoHash.get("jumin") + ("\n"));
					System.out.print("    ��ȭ��ȣ : ");
					System.out.print(personallnfoHash.get("phNo") + ("\n"));
					System.out.print("    �������� : ");
					System.out.print(personallnfoHash.get("subject") + ("\n"));
				}
			}
		}
	}
	
	public static void Delete(Scanner scan, ArrayList<HashMap<String, String>>personallnfoList) {
		System.out.println("+------------------------+"); //���� ȭ��
		System.out.println("    �����Ͻ� ������ �̸��� �Է��� �ּ���.");
		System.out.print("    �̸� : ");
		String deleteName = scan.nextLine();
		
		for(int i=0; i<personallnfoList.size(); i++) { 
			HashMap<String, String> personallnfoHash = personallnfoList.get(i);
			String brand = personallnfoHash.get("brand");
			
			if(brand.equals("1")) {
				String name = personallnfoHash.get("name"); //�л� ������ �̸��� �Է��Ͽ� ���� ����
				
				if(name.equals(deleteName)) {
					personallnfoList.remove(i);
					System.out.println(    deleteName + "���� ������ �����Ǿ����ϴ�.");
				}
			}else if(brand.equals("2")) {
				String name = personallnfoHash.get("name"); //������ ������ �̸��� �Է��Ͽ� ���� ����
				
				if(name.equals(deleteName)) {
					personallnfoList.remove(i);
					System.out.println(    deleteName + "���� ������ �����Ǿ����ϴ�.");
				}
			}else if(brand.equals("3")) {
				String name = personallnfoHash.get("name");//�������� ������ �̸��� �Է��Ͽ� ���� ����
				
				if(name.equals(deleteName)) {
					personallnfoList.remove(i);
					System.out.println(    deleteName + "���� ������ �����Ǿ����ϴ�.");
				}
			}
		}
	}
	
	public static void List(ArrayList<HashMap<String, String>> personallnfoList) { //��ü ��� ȭ��
		for(int i=0; i<personallnfoList.size(); i++) {
			HashMap<String, String> haksaHash = personallnfoList.get(i);
			String brand = haksaHash.get("brand");
			
			if(brand.equals("1")) {
				System.out.println("+------------------------+");
				System.out.print("    �̸� : ");
				System.out.print(haksaHash.get("name") + ("\n"));
				System.out.print("    ���� : ");
				System.out.print(haksaHash.get("regld") + ("\n"));
				System.out.print("    �Ҽ��а� : ");
				System.out.print(haksaHash.get("dept") + ("\n"));
				System.out.print("    �ֹι�ȣ : ");
				System.out.print(haksaHash.get("jumin") + ("\n"));
				System.out.print("    ��ȭ��ȣ : ");
				System.out.print(haksaHash.get("phNo") + ("\n"));
				System.out.print("    �������� : ");
				System.out.print(haksaHash.get("subject") + ("\n"));
				
			}else if(brand.equals("2")) {
				System.out.println("+------------------------+");
				System.out.print("    �̸� : ");
				System.out.print(haksaHash.get("name") + ("\n"));
				System.out.print("    ���� : ");
				System.out.print(haksaHash.get("regld") + ("\n"));
				System.out.print("    �Ҽ��а� : ");
				System.out.print(haksaHash.get("dept") + ("\n"));
				System.out.print("    �ֹι�ȣ : ");
				System.out.print(haksaHash.get("jumin") + ("\n"));
				System.out.print("    ��ȭ��ȣ : ");
				System.out.print(haksaHash.get("phNo") + ("\n"));
				System.out.print("    �������� : ");
				System.out.print(haksaHash.get("subject") + ("\n"));
				
			}else if(brand.equals("3")) {
				System.out.println("+------------------------+");
				System.out.print("    �̸� : ");
				System.out.print(haksaHash.get("name") + ("\n"));
				System.out.print("    ���� : ");
				System.out.print(haksaHash.get("regld") + ("\n"));
				System.out.print("    �Ҽ��а� : ");
				System.out.print(haksaHash.get("dept") + ("\n"));
				System.out.print("    �ֹι�ȣ : ");
				System.out.print(haksaHash.get("jumin") + ("\n"));
				System.out.print("    ��ȭ��ȣ : ");
				System.out.print(haksaHash.get("phNo") + ("\n"));
				System.out.print("    �������� : ");
				System.out.print(haksaHash.get("subject") + ("\n"));
			}
		}
	}
}
