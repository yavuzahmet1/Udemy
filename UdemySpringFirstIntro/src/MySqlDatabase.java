public class MySqlDatabase implements ICustomerDal{
    String connectionString;

    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }
    @Override
    public void add() {
        System.out.println("Connection String\t: " + connectionString);
        System.out.println("MySql Veritabanına eklendi\t: ");
    }
}
