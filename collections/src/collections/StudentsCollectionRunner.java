package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student st1, Student st2) {
		// TODO Auto-generated method stub
		return Integer.compare(st2.getId(), st1.getId());
	}

}

public class StudentsCollectionRunner{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = List.of(new Student(1, "Clay"),
				new Student (10, "Lovelace"),
				new Student (100, "Brett"));
		List<Student> studentsAl = new ArrayList<>(students);
		System.out.println(students);
		System.out.println(studentsAl);
		Collections.sort(studentsAl);
		System.out.println("Ascending: " + studentsAl);
		Collections.sort(studentsAl, new DescendingStudentComparator());
		System.out.println("Descending: " + studentsAl);
	}

}
