package ternaryoperator;
import java.util.HashMap;
		import java.util.Scanner;

		public class CourseDetails {

		    public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        HashMap<String, String> courses = new HashMap<>();

		        System.out.println("Enter AFID:");
		        String afid = sc.nextLine();

		        System.out.println("Enter course (java/python/AI):");
		        String course = sc.nextLine();

		        courses.put(afid, course);

		        System.out.println("AFID: " + afid);
		        System.out.println("Course: " + course);

		        sc.close();
		    }
		}
	