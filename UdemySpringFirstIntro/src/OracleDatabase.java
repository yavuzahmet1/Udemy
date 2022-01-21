public class OracleDatabase implements ICustomerDal {//müşterinin veritabanı operasyonlarının yazılacağı yer.
    String connectionString;

    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }


    public void add() {
        System.out.println("Connection String\t: " + connectionString);
        System.out.println("Oracle veritabanına eklendi\t: ");
    }
}
