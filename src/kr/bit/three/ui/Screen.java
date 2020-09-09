package kr.bit.three.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Screen {
	private int inputNum; //�Է°�
	private ArrayList<HashMap<String, String>>personallnfoList;
	
	public Screen(int inputNum) { //Screen ���� �ʱⰪ �Ҵ� 
		this.inputNum = inputNum;
		personallnfoList = new ArrayList<HashMap<String, String>>();
	}

//	public void Run() 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) { //�ʱ� ȭ��
			System.out.println("+------------------------+");
			System.out.println("    ��Ʈ ���б� �л���� �ý���");
			System.out.println("+------------------------+");
			System.out.println("    1. ���");
			System.out.println("    2. �˻�");
			System.out.println("    3. ����");
			System.out.println("    4. ��ü ���");
			System.out.println("    0. ����");
			System.out.println("+------------------------+");
			System.out.println("    ��ȣ�� �Է��� �ּ���.");
			int inputNum = scan.nextInt();
			
			if(inputNum==0) { //��� �޴� ȭ��
				System.out.println("�ý����� �����մϴ�.");
				break;
			}

			if(inputNum==1) { //��� �޴� ȭ��
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
					System.out.println("    �̸� : "); //�л��� �������� �Է�
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
					System.out.println("    �̸� : "); //������ �������� �Է�
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
					System.out.println("    �̸� : "); //�������� �������� �Է�
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
	}
}
