package telusko;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stud implements Comparable<Stud>
{
	int rollno,marks;
	String name;
	
	public Stud(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Stud [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}
	
	public int compareTo(Stud s)
	{
		return name.length()>s.name.length()?1:-1;
	}
	
}


public class ComparatorIntDemo {

	public static void main(String[] args) {

		List<Stud> studs = new ArrayList<>();
		studs.add(new Stud(23,"mahesh",55));
		studs.add(new Stud(24,"lokesh",73));
		studs.add(new Stud(25,"suresh",62));
		studs.add(new Stud(26,"ramesh",87));

		Collections.sort(studs);
		for(Stud k : studs)
		{
			System.out.println(k);
		}
		
	}

}
