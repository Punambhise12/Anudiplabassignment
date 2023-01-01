package Com.Example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext ap = new ClassPathXmlApplicationContext("config.xml");
         AgentsDoa Dao=(AgentsDoa)ap.getBean("e");
         
        System.out.println(Dao.saveAgents(new Agents(201,"Neha",10000))); 
         
        System.out.println(Dao.saveAgents(new Agents(202,"Arti",75000))); 
        
        System.out.println(Dao.saveAgents(new Agents(203,"Aditya",440000))); 
         
        // Update Method
        System.out.println(Dao.updateAgents(new Agents(1,"Rutika",65000)));
     }
}