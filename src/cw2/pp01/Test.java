
package cw2.pp01;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Test {
	List<Student> list = new ArrayList<Student>();
	Scanner sc = new Scanner(System.in);

	public void add() {
		System.out.print("Enter the Registration Number :");
		String regno = sc.next();
		System.out.print("Enter the First Name :");
		String f_Name = sc.next();
		System.out.print("Enter the Last Name :");
		String l_Name = sc.next();
		int ict1 = validation(sc, "Enter ICT01 Marks : ");
		int ict2 = validation(sc, "Enter ICT02 Marks : ");
		int cw1 = validation(sc, "Enter CourseWork 01 Marks : ");
		int cw2 = validation(sc, "Enter CourseWork 02 Marks : ");

		Student stu = new Student(regno, f_Name, l_Name, ict1, ict2, cw1, cw2);
		list.add(stu);
		System.out.println("Details have been stored sucessfully...");
	}

	public void display() {
		for (int i = 0; i < list.size(); i++) {
			Student x = list.get(i);
			System.out.println("Student Registration Number :" + x.getstudentRegistrationNo());
			System.out.println("Student First Name :" + x.getfull_Name());
			System.out.println("Student Last Name :" + x.getlast_Name());
			System.out.println("Marks ICT01 :" + x.getICT_01_marks());
			System.out.println("Marks ICT02 :" + x.getICT_02_marks());
			System.out.println("Marks CourseWork 01 :" + x.getGCW_01_marks());
			System.out.println("Marks CourseWork 02 :" + x.getGCW_01_marks());
			System.out.println("Grade student :" + x.getfinal_Grade());
			System.out.println("\n");
		}
	}

	private static int validation(Scanner input, String message) {
		int student_Marks;
		do {
			System.out.println(message);

			while (!input.hasNextInt()) {

				System.out.println("The marks you entred is invalid. Please re-enter the marks in the range of 0-100");
				input.next();
			}

			student_Marks = input.nextInt();
			if (!(student_Marks >= 0 && student_Marks <= 100)) {

				System.out.println("The marks you entered is invalid!!! Please enter a valid marks from 1-100!!! ");
			}

		} while (student_Marks < 0 || student_Marks > 100);
		return student_Marks;
	}


	public int OverallModuleClassAverage() {
		int classAverage;
		int total = 0;
		for (Student x : list) {
			total = total + x.getovrall_Marks();
		}
		classAverage = (int) (Math.round(total / (double) list.size()));
		return classAverage;

	}


	public int ICT01() {
		int ictTotal = 0;
		int ictAverage;
		for (Student x : list) {
			ictTotal = ictTotal + x.getICT_01_marks();

		}
		ictAverage = (int) (Math.round(ictTotal / (double) list.size()));
		return ictAverage;
	}


	public int ICT02() {
		int ictTotal = 0;
		int ictAverage;
		for (Student x : list) {
			ictTotal = ictTotal + x.getICT_02_marks();

		}
		ictAverage = (int) (Math.round(ictTotal / (double) list.size()));
		return ictAverage;
	}


	public int CW01() {
		int CWTotal = 0;
		int CWAverage;
		for (Student x : list) {
			CWTotal = CWTotal + x.getGCW_01_marks();

		}
		CWAverage = (int) (Math.round(CWTotal / (double) list.size()));
		return CWAverage;
	}


	public int CW02() {
		int CWTotal = 0;
		int CWAverage;
		for (Student x : list) {
			CWTotal = CWTotal + x.getGCW_01_marks();

		}
		CWAverage = (int) (Math.round(CWTotal / (double) list.size()));
		return CWAverage;
	}


	public void Below30ICT01() {

		System.out.println("Students who who scored below 30 for ICT01");
		boolean y = false;
		for (Student x : list) {
			if (x.getICT_01_marks() <= 30) {
				y = true;
				System.out.println("Student Registration Number is\t:" + x.getstudentRegistrationNo());
				System.out.println("First Name is\t:" + x.getfull_Name());
				System.out.println("Last Name is\t:" + x.getlast_Name());
				System.out.println("\n");
			}
		}
		if (!y) {

			System.out.println("None");
		}


		System.out.println("Students who scored below 30 for ICT02 ");

		for (Student x : list) {
			if (x.getICT_02_marks() <= 30) {
				System.out.println("Student's Registration Number is\t:" + x.getstudentRegistrationNo());
				System.out.println("First Name is\t:" + x.getfull_Name());
				System.out.println("Last Name is\t:" + x.getlast_Name());
				System.out.println("\n");
			}
		}
		if (!y) {

			System.out.println("None");
		}


		System.out.println("Students who scored below 30 for Group CourseWork 01");
		for (Student x : list) {
			if (x.getGCW_01_marks() <= 30) {
				System.out.println("Student's Registration Number is\t:" + x.getstudentRegistrationNo());
				System.out.println("First Name is\t:" + x.getfull_Name());
				System.out.println("Last Name is\t:" + x.getlast_Name());
				System.out.println("\n");
			}
		}
		if (!y) {

			System.out.println("None");
		}

		System.out.println("Students scored below 30 for Group CourseWork 02 ");
		for (Student x : list) {
			if (x.getGCW_01_marks() <= 30) {
				System.out.println("Student's Registration Number is\t:" + x.getstudentRegistrationNo());
				System.out.println("First Name is\t:" + x.getfull_Name());
				System.out.println("Last Name is\t:" + x.getlast_Name());
				System.out.println("\n");
			}
		}
		if (!y) {

			System.out.println("None");
		}

	}


	public void Total_Module_Marks_Below_Average() {
		for (Student x : list) {
			if (x.getovrall_Marks() < this.OverallModuleClassAverage()) {
				System.out.println("Student's Registration Number is\t:" + x.getstudentRegistrationNo());
				System.out.println("First Name is\t:" + x.getfull_Name());
				System.out.println("Last Name is\t:" + x.getlast_Name());
				System.out.println("\n");
			}
		}
	}


	public List<Student> sortedList() {
		List<Student> array = list;
		for (int i = 0; i < list.size(); i++) {

			for (int j = 0; j < list.size() - 1; j++) {
				Student temp;
				if (array.get(j).compareTo(array.get(j + 1)) < 0) {
					temp = array.get(j);
					array.set(j, array.get(j + 1));
					array.set(j + 1, temp);
				}
			}
		}
		return array;
	}


	public void Above_Average() {
		for (Student x : sortedList()) {
			if (x.getovrall_Marks() > OverallModuleClassAverage()) {
				System.out.println("Student's Registration Number is\t:" + x.getstudentRegistrationNo());
				System.out.println("First Name\t: " + x.getfull_Name());
				System.out.println("Last Name\t:" + x.getlast_Name());
				System.out.println("\n");
			}
		}
	}


	public int highest_Marks_Ict_01() {
		int Highest_For_Ict01 = 0;
		for (Student x : list) {
			if (x.getICT_01_marks() >= Highest_For_Ict01) {
				Highest_For_Ict01 = x.getICT_01_marks();
			}
		}
		return Highest_For_Ict01;
	}


	public int highest_Marks_Ict02() {
		int Highest_For_Ict02 = 0;
		for (Student x : list) {
			if (x.getICT_02_marks() >= Highest_For_Ict02) {
				Highest_For_Ict02 = x.getICT_02_marks();
			}
		}
		return Highest_For_Ict02;
	}


	public int highest_Marks_GCW01() {
		int Highest_For_GCW01 = 0;
		for (Student x : list) {
			if (x.getGCW_01_marks() >= Highest_For_GCW01) {
				Highest_For_GCW01 = x.getGCW_01_marks();
			}
		}
		return Highest_For_GCW01;
	}


	public int highest_Marks_GCW02() {
		int Highest_For_GCW02 = 0;
		for (Student x : list) {
			if (x.getGCW_01_marks() >= Highest_For_GCW02) {
				Highest_For_GCW02 = x.getGCW_02_marks();
			}
		}
		return Highest_For_GCW02;
	}


	public int Highest_Marks_Overall_Module() {
		int Highest_For_Overall_Module = 0;
		for (Student x : list) {
			if (x.getovrall_Marks() >= Highest_For_Overall_Module) {
				Highest_For_Overall_Module = x.getovrall_Marks();
			}
		}
		return Highest_For_Overall_Module;
	}


	public void display_Highest_Marks() {
		for (Student x : list) {
			if (x.getICT_01_marks() == highest_Marks_Ict_01()) {
				System.out.println("\t\tThe student who scored the highest marks for ICT01");
				System.out.println("Student's Registration Number is\t:" + x.getstudentRegistrationNo());
				System.out.println("First Name is :" + x.getfull_Name());
				System.out.println("Last Name is :" + x.getlast_Name());
				System.out.println("Highest Mark is :" + x.getICT_01_marks());
				System.out.println("\n");
			}
		}
		for (Student x : list) {
			if (x.getICT_02_marks() == highest_Marks_Ict02()) {
				System.out.println("\t\tHighest Scorer for ICT02");
				System.out.println("Student's Registration Number is\t:" + x.getstudentRegistrationNo());
				System.out.println("First Name is :" + x.getfull_Name());
				System.out.println("Last Name is :" + x.getlast_Name());
				System.out.println("Highest Mark is :" + x.getICT_02_marks());
				System.out.println("\n");
			}
		}
		for (Student x : list) {
			if (x.getGCW_01_marks() == highest_Marks_GCW01()) {
				System.out.println("\t\tThe student who scored the highest marks for Group CourseWork 01");
				System.out.println("Student's Registration Number is\t :" + x.getstudentRegistrationNo());
				System.out.println("First Name is :" + x.getfull_Name());
				System.out.println("Last Name is :" + x.getlast_Name());
				System.out.println("Highest Mark is :" + x.getGCW_01_marks());
				System.out.println("\n");
			}
		}
		for (Student x : list) {
			if (x.getGCW_01_marks() == highest_Marks_GCW02()) {
				System.out.println("\t\tThe student who scored the highest marks for Group CourseWork 02");
				System.out.println("" + x.getstudentRegistrationNo());
				System.out.println("First Name is :" + x.getfull_Name());
				System.out.println("Last Name is :" + x.getlast_Name());
				System.out.println("Highest Mark is :" + x.getGCW_02_marks());
				System.out.println("\n");
			}
		}
		for (Student x : list) {
			if (x.getovrall_Marks() == Highest_Marks_Overall_Module()) {
				System.out.println("\t\tThe student who scored the highest marks for the overall module");
				System.out.println("Student's Registration Number is\t :" + x.getstudentRegistrationNo());
				System.out.println("First Name is :" + x.getfull_Name());
				System.out.println("Last Name is :" + x.getlast_Name());
				System.out.println("Overall Mark is :" + x.getovrall_Marks());
				System.out.println("\n");
			}
		}
	}

	private int highest_Marks_Overall_Module1() {
		return 0;
	}


	public int Lowest_marks_ICT01() {
		int Lowest_For_ICT01= 100;
		for (Student x : list) {
			if (x.getICT_01_marks() <= Lowest_For_ICT01) {
				Lowest_For_ICT01 = x.getICT_01_marks();
			}
		}
		return Lowest_For_ICT01;
	}


	public int Lowest_marks_ICT02() {
		int Lowest_For_ICT02 = 100;
		for (Student x : list) {
			if (x.getICT_02_marks() <= Lowest_For_ICT02) {
				Lowest_For_ICT02 = x.getICT_02_marks();
			}
		}
		return Lowest_For_ICT02;
	}


	public int lowest_marks_GCW01() {
		int Lowest_For_GCW01 = 100;
		for (Student x : list) {
			if (x.getGCW_01_marks() <= Lowest_For_GCW01) {
				Lowest_For_GCW01 = x.getGCW_01_marks();
			}
		}
		return Lowest_For_GCW01;
	}


	public int lowest_marks_GCW02() {
		int Lowest_For_GCW02 = 100;
		for (Student x : list) {
			if (x.getGCW_01_marks() <= Lowest_For_GCW02) {
				Lowest_For_GCW02 = x.getGCW_02_marks();
			}
		}
		return Lowest_For_GCW02;
	}


	public int lowest_Marks_Overall_Module1() {
		int Lowovrlmark = 100;
		for (Student x : list) {
			if (x.getovrall_Marks() <= Lowovrlmark) {
				Lowovrlmark = x.getovrall_Marks();
			}
		}
		return Lowovrlmark;

	}


	public void Display_Lowest_Marks() {
		for (Student x : list) {
			if (x.getICT_01_marks() == Lowest_marks_ICT01()) {
				System.out.println("\t\tThe student who scored the lowest marks for ICT 01");
				System.out.println("Student's Registration Number is\t" + x.getstudentRegistrationNo());
				System.out.println("First Name is :" + x.getfull_Name());
				System.out.println("Last Name is :" + x.getlast_Name());
				System.out.println("Lowest Mark is :" + x.getICT_01_marks());
				System.out.println("\n");

			}
		}
		for (Student x : list) {
			if (x.getICT_02_marks() == Lowest_marks_ICT02()) {
				System.out.println("\t\tThe student who scored the lowest marks for ICT 02");
				System.out.println("Student's Registration Number is\t" + x.getstudentRegistrationNo());
				System.out.println("First Name is :" + x.getfull_Name());
				System.out.println("Last Name is :" + x.getlast_Name());
				System.out.println("Highest Mark is :" + x.getICT_02_marks());
				System.out.println("\n");
			}
		}
		for (Student x : list) {
			if (x.getGCW_01_marks() == lowest_marks_GCW01()) {
				System.out.println("\t\tThe student who scored the lowest marks Group CourseWork 01");
				System.out.println("Student's Registration Number is\t" + x.getstudentRegistrationNo());
				System.out.println("First Name is :" + x.getfull_Name());
				System.out.println("Last Name is :" + x.getlast_Name());
				System.out.println("Lowest Mark is :" + x.getGCW_01_marks());
				System.out.println("\n");
			}
		}
		for (Student x : list) {
			if (x.getGCW_01_marks() == lowest_marks_GCW02()) {
				System.out.println("\t\tThe student who scored the lowest marks for the Group CourseWork 02");
				System.out.println("Student's Registration Number is\t" + x.getstudentRegistrationNo());
				System.out.println("First Name is :" + x.getfull_Name());
				System.out.println("Last Name is :" + x.getlast_Name());
				System.out.println("Lowest Mark is :" + x.getGCW_01_marks());
				System.out.println("\n");
			}
		}
		for (Student x : list) {
			if (x.getovrall_Marks() == lowest_Marks_Overall_Module1()) {
				System.out.println("The student who scored the lowest marks for the overall module");
				System.out.println("Student's Registration Number is\t" + x.getstudentRegistrationNo());
				System.out.println("First Name is :" + x.getfull_Name());
				System.out.println("Last Name is :" + x.getlast_Name());
				System.out.println("Overall Mark is :" + x.getovrall_Marks());
				System.out.println("\n");
			}
		}
	}

	public void Re_Take() {
		for (Student x : list) {
			if (x.getfinal_Grade() == Grade.Fail_Retake) {
				System.out.println("\t\t Students' Details who should Re-take");
				System.out.println("Student's Registration Number is\t" + x.getstudentRegistrationNo());
				System.out.println("First Name is :" + x.getfull_Name());
				System.out.println("Last Name is :" + x.getlast_Name());
				System.out.println("\n");
			}
		}
	}

	public void Re_Sit() {
		for (Student x : SortX()) {
			if (x.getfinal_Grade() == Grade.Fail_Resit) {
				System.out.println("\t\t Students' Details who should Re-sit");
				System.out.println("Student's Registration Number is\t" + x.getstudentRegistrationNo());
				System.out.println("First Name is :" + x.getfull_Name());
				System.out.println("Last Name is :" + x.getlast_Name());
				System.out.println("\n");
			}
		}
	}

	public List<Student> SortX() {
		Comparator_Reg obj = new Comparator_Reg();
		List<Student> Sortlist = list;
		for (int i = 0; i < Sortlist.size(); i++) {
			for (int j = 0; j < Sortlist.size() - 1; j++) {
				Student temp;
				if (obj.compare(Sortlist.get(j), Sortlist.get(j + 1)) < 0) {
					temp = Sortlist.get(j);
					Sortlist.set(j, Sortlist.get(j + 1));
					Sortlist.set(j + 1, temp);
				}
			}
		}
		return Sortlist;
	}

	public List<Student> Sort() {
		List<Student> Sortlist = list;
		for (int i = 0; i < Sortlist.size(); i++) {
			for (int j = 0; j < Sortlist.size() - 1; j++) {
				Student temp;
				if (Sortlist.get(j).compareTo(Sortlist.get(j + 1)) < 0) {
					temp = Sortlist.get(j);
					Sortlist.set(j, Sortlist.get(j + 1));
					Sortlist.set(j + 1, temp);
				}
			}
		}
		return Sortlist;
	}
	
	public void horHis() {
		JFrame frm = new JFrame("Horizontal Historgram");
		
		frm.setSize(600, 600);

		JPanel pan1 = new JPanel();
		JPanel pan2 = new JPanel();
		JPanel pan3 = new JPanel();
		JPanel pan4 = new JPanel();

		pan1.setLayout(new FlowLayout(FlowLayout.LEADING, 20, 20));
		pan2.setLayout(new FlowLayout(FlowLayout.LEADING, 20, 20));
		pan3.setLayout(new FlowLayout(FlowLayout.LEADING, 20, 20));
		pan4.setLayout(new FlowLayout(FlowLayout.LEADING, 20, 20));
		

		JLabel lbl1 = new JLabel("0-29");
		JLabel lbl2 = new JLabel("30-39");
		JLabel lbl3 = new JLabel("40-69");
		JLabel lbl4 = new JLabel("70-100");

		
		JLabel lbl_70_100 = new JLabel();
		JLabel lbl_40_69 = new JLabel(); 
		JLabel lbl_30_39 = new JLabel();
		JLabel lbl_0_29 = new JLabel(); 
		lbl1.setFont(new Font("Serif", Font.BOLD, 20));
		lbl2.setFont(new Font("Serif", Font.BOLD, 20));
		lbl3.setFont(new Font("Serif", Font.BOLD, 20));
		lbl4.setFont(new Font("Serif", Font.BOLD, 20));
		lbl_70_100.setFont(new Font("Serif", Font.BOLD, 20));
		lbl_40_69.setFont(new Font("Serif", Font.BOLD, 20));
		lbl_30_39.setFont(new Font("Serif", Font.BOLD, 20));
		lbl_0_29.setFont(new Font("Serif", Font.BOLD, 20));
		
		frm.setLayout(new GridLayout(4, 1, 5, 5));
		frm.add(pan1);
		frm.add(pan2);
		frm.add(pan3);
		frm.add(pan4);
		

		pan1.add(lbl1);
		pan1.add(lbl_0_29);

		pan2.add(lbl2);
		pan2.add(lbl_30_39);

		pan3.add(lbl3);
		pan3.add(lbl_40_69);

		pan4.add(lbl4);
		pan4.add(lbl_70_100);


		
		  for (int i=0;i<list.size();i++)
		  {
			  Student stu=list.get(i);
		  
		  { if (stu.getovrall_Marks()>=70)
		  {
		  lbl_70_100.setText(lbl_70_100.getText()+"*"); } 
		  else if (stu.getovrall_Marks()>=40) 
		  {
		  lbl_40_69.setText(lbl_40_69.getText()+"*"); }
		  else if (stu.getovrall_Marks()>=30) 
		  {
		  lbl_30_39.setText(lbl_30_39.getText()+"*"); } 
		  else { 
			  lbl_0_29.setText(lbl_0_29.getText()+"*"); }
		  
		  }
		  }

		frm.setVisible(true);

	}

	public void verHis() {
		JFrame frm = new JFrame("Verticle Historgram");
		
		frm.setSize(600, 600);

		JPanel panTitle = new JPanel(); 
		JPanel panStars = new JPanel();
		JPanel pan_1 = new JPanel();
		JPanel pan_2 = new JPanel();
		JPanel pan_3 = new JPanel();
		JPanel pan_4 = new JPanel();
		


		JLabel lbl_1 = new JLabel("0-29");
		JLabel lbl_2 = new JLabel("30-39");
		JLabel lbl_3 = new JLabel("40-69");
		JLabel lbl_4 = new JLabel("70-100");
		
		lbl_1.setFont(new Font("Serif", Font.BOLD, 22));
		lbl_2.setFont(new Font("Serif", Font.BOLD, 22));
		lbl_3.setFont(new Font("Serif", Font.BOLD, 22));
		lbl_4.setFont(new Font("Serif", Font.BOLD, 22));


		lbl_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_4.setHorizontalAlignment(SwingConstants.CENTER);

		panTitle.setLayout(new GridLayout(1, 4));
		panTitle.add(lbl_1);
		panTitle.add(lbl_2);
		panTitle.add(lbl_3);
		panTitle.add(lbl_4);

		panStars.setLayout(new GridLayout(1, 4));

		pan_1.setLayout(new GridLayout(list.size(), 1));
		pan_2.setLayout(new GridLayout(list.size(), 1));
		pan_3.setLayout(new GridLayout(list.size(), 1));
		pan_4.setLayout(new GridLayout(list.size(), 1));
		for (int i = 0; i < list.size(); i++) {
			Student stu=list.get(i);
			if (stu.getovrall_Marks()>=70)
			{
			JLabel star = new JLabel("*");
			star.setFont(new Font("Serif", Font.BOLD, 20));
			star.setHorizontalAlignment(SwingConstants.CENTER);
			pan_4.add(star);
			}
			else if (stu.getovrall_Marks()>=60)
			{
			JLabel star = new JLabel("*");
			star.setFont(new Font("Serif", Font.BOLD, 20));
			star.setHorizontalAlignment(SwingConstants.CENTER);
			pan_3.add(star);
			}
			else if (stu.getovrall_Marks()>=30)
			{
			JLabel star = new JLabel("*");
			star.setFont(new Font("Serif", Font.BOLD, 20));
			star.setHorizontalAlignment(SwingConstants.CENTER);
			pan_2.add(star);
			}
			else
			{
			JLabel star = new JLabel("*");
			star.setFont(new Font("Serif", Font.BOLD, 20));
			star.setHorizontalAlignment(SwingConstants.CENTER);
			pan_1.add(star);
			}
		}
		
		panStars.add(pan_1);
		panStars.add(pan_2);
		panStars.add(pan_3);
		panStars.add(pan_4);
		frm.add(BorderLayout.NORTH, panTitle);
		frm.add(BorderLayout.CENTER, panStars);
	
		frm.setVisible(true);

	}


}
