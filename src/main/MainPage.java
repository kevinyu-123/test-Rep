package main;

import java.util.ArrayList;
import java.util.Scanner;

import test.Hj;

public class MainPage {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<STU> al = new ArrayList<STU>();
		STU stu;
		Hj hj = new Hj(al);
		String name, stNum,na;
		int num, phoneNo, index;
		System.out.println("--학생 관리 프로그램 시작--");
		while (true) {
			System.out.println("1.생성 2.전체보기 3.하나만 보기 4.수정 5.삭제");
			num = scan.nextInt();
			switch (num) {
			case 1:
				System.out.println("학생 정보를 입력합니다.");
				System.out.print("이름 입력: ");
				name = scan.next();
				System.out.print("학번 입력: ");
				stNum = scan.next();
				System.out.print("핸드폰 번호 입력: ");
				phoneNo = scan.nextInt();
				stu = new STU();
				stu.setName(name);
				stu.setPhoneNo(phoneNo);
				stu.setStuNo(stNum);
				al.add(stu);
				break;
			case 2:
				System.out.println("----학생 전체 보기----");
				for (int i = 0; i < al.size(); i++) {
					hj.show(i);
					System.out.println("---------------");
				}
				break;
			case 3:
				System.out.println("원하는 학생 이름 입력: ");
				index = hj.search();
				if (index > -1) {
					hj.show(index);
				} else {
					System.out.println("해당학생은 존재하지 않습니다.");

				}
				break;
			case 4:
				System.out.println("수정하고 싶은 학생 이름 입력: ");
				na = scan.next();
				for (int i = 0; i < al.size(); i++) {
					if (na.equals(al.get(i).getName())) {
						System.out.println("바꿀 학생 학번: ");
						stNum = scan.next();
						al.get(i).setStuNo(stNum);
						System.out.println("바꿀 학생 번호: ");
						phoneNo = scan.nextInt();
						al.get(i).setPhoneNo(phoneNo);
					}
				}
				break;
			case 5:
				System.out.println("삭제 싶은 학생 이름 입력: ");
				index = hj.search();
				if (index > -1) {
					al.remove(index);
					System.out.println("삭제 완료");
				} else
					System.out.println("삭제 취소");
			}
			break;
		}
	}
}
