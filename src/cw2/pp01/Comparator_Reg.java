package cw2.pp01;

import java.util.Comparator;

public class Comparator_Reg implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {

		return o1.getlast_Name().compareTo(o2.getlast_Name());
	}

}
