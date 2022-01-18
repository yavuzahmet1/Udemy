package UdemySpringIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/*ICustomerService customerService=context.getBean("service",ICustomerService.class);
		customerService.add();//böyle yazarsak hata alýrýz aplicationcontext de constructor eklememiz gerekli*/
		
		ICustomerService customerService=context.getBean("service",ICustomerService.class);
		customerService.add();
		
		//CustomerManager manager=new CustomerManager(context.getBean("database",ICustomerDal.class));
		//manager.add();

	}
	//IoC - Inversion of Control
	//Dependency Injection
	

}
