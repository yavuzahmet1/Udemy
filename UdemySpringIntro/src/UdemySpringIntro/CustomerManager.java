package UdemySpringIntro;

public class CustomerManager implements ICustomerService{
	String bisey;
	private ICustomerDal customerDal;
	
	
	/*constructor injection
	//public CustomerManager(ICustomerDal customerDal) {
	//	this.customerDal = customerDal;
	}*/

	
	//setter injection kullanýmýdýr ama sektörün %99'u constructor injectionu kullanýr.
	public void setCustomerDal(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	public void add() {
		//iþ kurallarý
		
		customerDal.add();
		
	}

}
