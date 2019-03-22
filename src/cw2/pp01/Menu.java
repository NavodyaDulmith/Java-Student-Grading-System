package cw2.pp01;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Test my = new Test();
		char run1 = '\0';

		Scanner input = new Scanner(System.in);


		System.out.println("*********************************************************************************");
		System.out.println("- MENU -");
		System.out.println("*********************************************************************************");
		System.out.println("ENTER THE APPROPRIATE CHARACTER TO PROCESS");
		System.out.println("_________________________________________________________________________________");
		System.out.println("Enter A to Add Student Details");
		System.out.println("Enter B to Display Student Details");
		System.out.println("Enter C to Calculate Overall Class Average ");
		System.out.println("Enter D to Find the Class Average for each Component ");
		System.out.println("Enter E to list students with total module marks below class average");
		System.out.println("Enter F to list students obtained marks below 30 for each component");
		System.out.println("Enter G to list students with total module marks above class average ");
		System.out.println("Enter H to find the Highest scorer for the overall module");
		System.out.println("Enter I to find the Lowest Scorer for the overall module");
		System.out.println("Enter J to list out the Re-take students");
		System.out.println("Enter K to list out the Re-sit students");
		System.out.println("Enter L to view Vertical Histogram");
		System.out.println("Enter M to view Horizontal Histogram");
		System.out.println("Enter T to exit the programme");
		System.out.println("Enter R to Display the Menu AGAIN");
		System.out.println("*********************************************************************************");

		char run2 = 0;

		do {
			run1 = input.next().charAt(0);
			switch (run1) {
			case 'A':
			case 'a':
				do {
					my.add();
					System.out.println("Enter 1 to select another option Or any number to Add more Student Details");
					run2 = input.next().charAt(0);

				} while (run2 != '1');
				System.out.println("\n Enter a Letter from Menu or Enter R to Display Menu");
				break;

			case 'B':
			case 'b':
				my.display();
				System.out.println("\n Enter a Letter from Menu or Enter R to Display Menu");
				break;

			case 'C':
			case 'c':
				System.out.println("The Overall Class Average: ");
				System.out.println(my.OverallModuleClassAverage());
				System.out.println("\n Enter a Letter from Menu or Enter R to Display Menu");
				break;

			case 'D':
			case 'd':
				System.out.println("\t\tClass Averages for each component");
				System.out.println("\t Class Average for ICT 01" + my.ICT01());

				System.out.println("\t Class Average for ICT 02" + my.ICT02());

				System.out.println("\t Class Average for Group CourseWork 01" + my.CW01());

				System.out.println("\t Class Average for Group CourseWork 02" + my.CW01());
				System.out.println("\n Enter a Letter from Menu or Enter R to Display Menu");
				break;

			case 'E':
			case 'e':
				System.out.println("\t\tStudents with total module marks belowe class average");
				my.Total_Module_Marks_Below_Average();
				System.out.println("\n Enter a Letter from Menu or Enter R to Display Menu");
				break;

			case 'F':
			case 'f':
				System.out.println("\t\tstudents obtained marks below 30 for each component");
				my.Below30ICT01();
				System.out.println("\n Enter a Letter from Menu or Enter R to Display Menu");
				break;

			case 'G':
			case 'g':
				System.out.println("\t\tstudents with total module marks above class average");
				my.Above_Average();
				System.out.println("\n Enter a Letter from Menu or Enter R to Display Menu");
				break;

			case 'H':
			case 'h':
				my.display_Highest_Marks();
				System.out.println("\n Enter a Letter from Menu or Enter R to Display Menu");
				break;

			case 'I':
			case 'i':
				my.Display_Lowest_Marks();
				System.out.println("\n Enter a Letter from Menu or Enter R to Display Menu");
				break;

			case 'J':
			case 'j':
				System.out.println("\t\tThe Re-Take Students are :");
				my.Re_Take();
				System.out.println("\n Enter a Letter from Menu or Enter R to Display Menu");
				break;

			case 'K':
			case 'k':
				System.out.println("\t\tThe Re-Sit Students are :");
				my.Re_Sit();
				System.out.println("\n Enter a Letter from Menu or Enter R to Display Menu");
				break;

			case 'L':
			case 'l':
				System.out.println("\t\t Horizontal histogram :");
				my.horHis();
				System.out.println("\n Enter a Letter from Menu or Enter R to Display Menu");
				break;
				
			case 'M':
			case 'm':
				System.out.println("\t\t Vertical histogram :");
				my.verHis();
				System.out.println("\n Enter a Letter from Menu or Enter R to Display Menu");
				break;
			case 'R':
			case 'r':
				System.out.println("*********************************************************************************");
				System.out.println("\t\t\t- MENU -");
				System.out.println("*********************************************************************************");
				System.out.println("ENTER THE APPROPRIATE CHARACTER TO PROCEED");
				System.out.println("_________________________________________________________________________________");
				System.out.println("Enter A to Add Student Details");
				System.out.println("Enter B to Display Student Details");
				System.out.println("Enter C to Calculate Overall Class Average ");
				System.out.println("Enter D to Find the Class Average for each Component ");
				System.out.println("Enter E to list students with total module marks below class average");
				System.out.println("Enter F to list students obtained marks below 30 for each component");
				System.out.println("Enter G to list students with total module marks above class average ");
				System.out.println("Enter H to find the Highest scorer for the overall module");
				System.out.println("Enter I to find the Lowest Scorer for the overall module");
				System.out.println("Enter J to list out the Re-take students");
				System.out.println("Enter K to list out the Re-sit students");
				System.out.println("Enter L to view Vertical Histogram");
				System.out.println("Enter M to view Horizontal Histogram");
				System.out.println("Enter T to exit the programme");
				System.out.println("Enter R to Display the Menu AGAIN");
				System.out.println("*********************************************************************************");
				break;
			case 'T':
			case 't':
				System.out.println("---------------------------------PROGRAM ENDED------------------------------------");
				System.exit(0);

			default:
				System.out.println("Invalid Input.");
				System.out.println("Enter Correct Letter or Press R To Display the menu.");
			}
		} while (run1 != 'T' || run1 != 't');

		input.close();

	}

}
