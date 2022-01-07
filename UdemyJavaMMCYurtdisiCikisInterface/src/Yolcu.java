import java.util.Scanner;

public class Yolcu implements ICikis {
    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Yolcu(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Yatırdığınız Harç bedeli : ");
        this.harc=scanner.nextInt();

        System.out.println("Herhangi bir siyasi yasağınız bulunuyır mu? Cevabınız evet veya hayır");
        String cevap=scanner.nextLine();
        if(cevap.equals("evet")){
            this.siyasiYasak=true;
        }else{
            this.siyasiYasak=false;
        }
        System.out.println("Vizeniz bulunuyor mu? evet yada hayır");
        String cevap2=scanner.nextLine();
        if(cevap2.equals("evet")){
            this.vizeDurumu=true;
        }else{
            this.vizeDurumu=false;
        }

    }

    @Override
    public boolean yurtdisiHarciKontrol() {
        if(this.harc<15){
            System.out.println("Lütfen çıkış harcını tam yatırın");
            return false;
        }else{
            System.out.println("Lütfen çıkış harcı tamam.");
            return true;
        }
    }

    @Override
    public boolean siyasiYasakKontrol() {
        if(this.siyasiYasak==true){
            System.out.println("Siyasi yasağınız bulunduğundan yur dışına çıkışınız yasaktır");
            return false;
        }else{
            System.out.println("Yurdışına çıkış yasağınız bulunmuyor.");
            return true;
        }
    }

    @Override
    public boolean vizeDurumuKontrol() {
        if(this.vizeDurumu==true){
            System.out.println("Vize işlemleri tamamdır");
            return true;
        }else{
            System.out.println("Vizeniz gideceğiniz ülkeye bulunmamaktadır.");
            return false;

        }
    }

}
