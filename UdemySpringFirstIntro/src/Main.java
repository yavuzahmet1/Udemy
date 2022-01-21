import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ICustomerService customerService=context.getBean("service",ICustomerService.class);
        customerService.add();//bu şekilde direk olmaz çünkü contructora class göndermemiz gerekiyor
        //bunun için applicationContext' gidilir ve <constructor-arg yazılarak gerekli tanımlamalar yazılır.


        /*CustomerManager customerManager =
                new CustomerManager(context.getBean("database", ICustomerDal.class));
        customerManager.add();

        CustomerManager customerManager = new CustomerManager(new OracleDatabase());//şuanda Dependency Injection yaptık.
        customerManager.add();*/
    }
    //IoC-Inversion of Control
    //Dependency Injection
}
