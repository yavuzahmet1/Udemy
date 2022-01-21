public class CustomerManager implements ICustomerService{
    private ICustomerDal customerDal;

    //bu constructor injection yöntemidir. en iyi yöntem budur sektörün %99'u bunu kullanır.
   public CustomerManager(ICustomerDal customerDal) {
        this.customerDal = customerDal;
    }
   /* //setter injection
    public void setCustomerDal(ICustomerDal customerDal){
        this.customerDal=customerDal;
    }*/
    @Override
    public void add() {
        customerDal.add();
    }
}
