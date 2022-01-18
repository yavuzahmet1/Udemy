package UdemySpringIntro;

public class CustomerManager implements ICustomerService{
	String bisey;
	private ICustomerDal customerDal;
	
	
	/*constructor injection
	//public CustomerManager(ICustomerDal customerDal) {
	//	this.customerDal = customerDal;
	}*/

	
	//setter injection kullan�m�d�r ama sekt�r�n %99'u constructor injectionu kullan�r.
	public void setCustomerDal(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	public void add() {
		//i� kurallar�
		
		customerDal.add();
		
	}

}
