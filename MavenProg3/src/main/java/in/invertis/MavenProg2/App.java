package in.invertis.MavenProg2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class App 
{
    public static void main( String[] args )
    {
    	
    	String configuration="/in.sp.resources/applicationContext.xml";
        ApplicationContext context=new ClassPathXmlApplicationContext(configuration);
        
        Student std=(Student) context.getBean(Student.class);
                std.display(); 
        
        
    }
}
