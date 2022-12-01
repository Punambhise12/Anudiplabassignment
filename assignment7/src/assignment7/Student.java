package assignment7;

import java.util.ArrayList;
import java.util.List;

public class Student {

	int id;
	String Name;
	int age;
	int marks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Student(int id, String name, int age, int marks) {
		super();
		this.id = id;
		Name = name;
		this.age = age;
		this.marks = marks;
	}
	public static Iterable<Student> stream() {
		
		return null;
	}
	
	public static void main(String[] args) {
		List<Student> obj=new ArrayList<>();
		obj.add(new Student(1,"Shweta Jadhav",23,95));//to add new student data
		obj.add(new Student(2,"Ruchita Sudge",21,86));//to add new student data
		obj.add(new Student(3,"Manisha Raut",20,70));//to add new student data
		obj.add(new Student(4,"Prakash Kadam",22,92));//to add new student data
		obj.add(new Student(5,"Sakshi Jagtap",21,75));//to add new student data
		
		obj.stream().forEach(j->System.out.println("Student Id-"+j.getId()+" "+"Name-"+j.getName()+" "+"Age"+j.getAge()+" "+"Marks"+j.getMarks()));
		//for each loop to get all student info
		
		System.out.println("Sutdents which are having marks between 60 to 80 are ");
		//it will print Sutdents which are having marks between 60 to 80 are
		
		obj.stream().filter(p->p.getMarks()<80).filter(p->p.getMarks()>60).forEach(s->System.out.println(s.getName()+" "+s.getMarks()));
		//stream method to get student marks  

	}

}


