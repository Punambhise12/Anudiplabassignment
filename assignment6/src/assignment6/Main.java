package assignment6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main{

	public static void main(String[] args) 
	{
		List<Agent> data = new ArrayList<>();
		data.add(new Agent(101,"Punam","Chinchwad"));
		data.add(new Agent(102,"Ashwini","Mumbai"));
		data.add(new Agent(103,"Kajal","Pune"));
		data.add(new Agent(104,"Shital","Nashik"));
		Collections.sort(data);
		for (Agent i:data)
		{
			System.out.println(i.getId()+" "+i.getName()+" "+i.getArea());
		}

	}

}

class Agent implements Comparable<Agent>
{
	private int id;
	private String name;
	private String area;
	public Agent(int id, String name, String area) {
		super();
		this.id = id;
		this.name = name;
		this.area = area;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	public int compareTo(Agent o) {
		
			return this.area.compareTo(o.area);
		
	}
}
