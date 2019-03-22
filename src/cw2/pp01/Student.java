package cw2.pp01;

public class Student implements Comparable<Student> {
	private String studentRegistrationNo;
	private String firstName;
	private String lastName;
	private int ICT01Marks;
	private int ICT02Marks;
	private int CW01Marks;
	private int CW02Marks;
	private int ovrallMarks;
	private int qualSet01;
	private Grade Grade;

	public Student(String stdID, String Fname, String Lname, int ICT01marks, int ICT02marks, int CW01marks,
				   int CW02marks) {
		this.studentRegistrationNo = stdID;
		this.firstName = Fname;
		this.lastName = Lname;
		this.ICT01Marks = ICT01marks;
		this.ICT02Marks = ICT02marks;
		this.CW01Marks = CW01marks;
		this.CW02Marks = CW02marks;
		this.ovrallMarks = this.getovrall_Marks();
		this.qualSet01 = this.getqualifing_Set_01();
		this.Grade = this.getfinal_Grade();

	}

	public String getstudentRegistrationNo() {
		return studentRegistrationNo;
	}

	public String getfull_Name() {
		return firstName;
	}

	public String getlast_Name() {
		return lastName;
	}

	public int getICT_01_marks() {
		return ICT01Marks;
	}

	public int getICT_02_marks() {
		return ICT02Marks;
	}

	public int getGCW_01_marks() {
		return CW01Marks;
	}

	public int getGCW_02_marks() {
		return CW02Marks;
	}

	public int getovrall_Marks() {

		this.ovrallMarks = (int) Math
				.round((this.ICT01Marks * 0.2 + this.ICT02Marks * 0.2 + this.CW01Marks * 0.3 + this.CW02Marks * 0.3));
		return ovrallMarks;
	}

	public int getqualifing_Set_01() {
		this.qualSet01 = (this.ICT01Marks + this.ICT02Marks) / 2;
		return qualSet01;
	}

	public Grade getfinal_Grade() {

		if (getqualifing_Set_01() >= 30 && this.CW01Marks >= 30 && this.CW02Marks >= 30 && this.ovrallMarks >= 40) {
			if (this.ovrallMarks >= 70) {
				this.Grade = Grade.First_Class;
			} else if (this.ovrallMarks >= 60) {
				this.Grade = Grade.Second_Upper_Class;
			} else if (this.ovrallMarks >= 50) {
				this.Grade = Grade.Second_Lower_Class;
			} else {
				this.Grade = Grade.General_Pass;
			}

		} else if (this.ovrallMarks >= 40) {
			this.Grade = Grade.Fail_Resit;
		} else {
			this.Grade = Grade.Fail_Retake;
		}
		return Grade;
	}

	@Override
	public int compareTo(Student o) {

		return this.ovrallMarks - o.ovrallMarks;
	}

}
