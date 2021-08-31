package test;

import java.util.ArrayList;
import java.util.Scanner;

import main.STU;

public class Hj implements Stu {
	ArrayList<STU> st = new ArrayList<STU>();
	Scanner scan = new Scanner(System.in);

	public Hj() {}
	
	public Hj(ArrayList<STU> st) {
		super();
		this.st = st;
	}

	@Override
	public int search() {
		String name = scan.next();
		for (int i = 0; i < st.size(); i++) {
			if (name.equals(st.get(i).getName()))
				return i;
		}
		return -1;
	}

	@Override
	public void show(int index) {
		System.out.println("학생 이름: " + st.get(index).getName());
		System.out.println("학생 학번: " + st.get(index).getStuNo());
		System.out.println("학생 번호: " + st.get(index).getPhoneNo());
	}

}
