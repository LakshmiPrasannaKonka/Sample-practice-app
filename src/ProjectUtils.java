import java.text.ParseException;
import java.util.Comparator;
import java.util.Date;
//import java.util.HashMap;
//import java.util.Iterator;
import java.util.Map;
//import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class ProjectUtils {

	
public static Map<Project,Employee>loadProjects() throws ParseException{
	
		  Employee e1 = new Employee(1, "rani", 23000.00,"rani@gmail.com");
		     Employee e2 = new Employee(2, "anu", 21000.00,"anu@gmail.com");
		     Employee e3 = new Employee(3, "raj", 22000.00,"raj@gmail.com");
		     Employee e4 = new Employee(4, "teja", 24000.00,"teja@gmail.com");
		     Employee e5 = new Employee(5, "ramu", 28000.00,"ramu@gmail.com");
		     Employee e6 = new Employee(6, "tejaswini", 20000.00,"tejaswini@gmail.com");
		     
		     Project p1=new Project(100,"java",new Date(20-04-2019),new Date(25-04-2019));
		     Project p2=new Project(101,"angularjs",new Date(26-04-2019),new Date(30-04-2019));
		     Project p3=new Project(102,"sap",new Date(15-04-2019),new Date(20-04-2019));
		     Project p4=new Project(103,"aws",new Date(22-04-2019),new Date(25-04-2019));
		     Project p5=new Project(104,"iot",new Date(21-04-2019),new Date(26-04-2019));
		     Project p6=new Project(105,"reactjs",new Date(23-04-2019),new Date(27-04-2019));
		     Project p7=new Project(106,"AI",new Date(24-04-2019),new Date(28-04-2019));
		     Project p8=new Project(107,"MACHINE LEARNING",new Date(27-04-2019),new Date(30-04-2019));
		     Project p9=new Project(108,"ANDROID",new Date(28-04-2019),new Date(30-04-2019));
		     Project p10=new Project(109,"datawarehouse",new Date(10-04-2019),new Date(15-04-2019));
		     
		     Map<Project,Employee> map=new TreeMap<Project,Employee>();
		    	map.put(p1, e1);
		    		map.put(p2, e2);
		    		map.put(p3, e3);
		    		map.put(p4, e4);
		    		map.put(p5, e5);
		    		map.put(p6, e6);
		    		map.put(p7, e3);
		    		map.put(p8, e4); 
		    		map.put(p9, e6);
		    		map.put(p10, e1);
		    		return map;
	}
public static void dispalyByProjectId(Map<Project,Employee>map)
{
	SortedMap<Project,Employee> sortedMap=new TreeMap<Project,Employee>(map);
	sortedMap.entrySet().parallelStream().forEach(t->System.out.println(t));
	
}
public static void displayByDomain(Map<Project,Employee>map)
{
	Comparator<Project> projectDomainComparator=new Comparator<Project>()
			{
	@Override
	public int compare(Project o1,Project o2)
	{
		return o1.getDomain().compareTo(o2.getDomain());
		
	}
			};
			map.entrySet().parallelStream().sorted(Map.Entry.comparingByKey(projectDomainComparator)).forEach(t->System.out.println(t));
};
public static void main(String[] args)throws ParseException
{
	Map<Project,Employee> map=loadProjects();
	dispalyByProjectId(map);
	System.out.println("**********");
	displayByDomain(map);
		    		
		    			}
}
