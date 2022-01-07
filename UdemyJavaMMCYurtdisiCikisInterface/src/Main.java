public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("SABİHA GÖKÇEN HAVA LİMANINA HOŞ GELDİNİZ");
        String sartlar="Yurtdışı Çıkış Kuralları...\n"
                +"Herhangi bir siyasi yasağınızın olmaması gerekiyor...\n"
                +"15 TL harç bedelini tam olarak yatırmanız gerekiyor...\n"
                +"Gideceğiniz ülkeye vizenizin olması gerekiyor...";

        String mesaj="Yurt dışı şartlarını sağlamanız gerekiyor...";
        while (true) {
            System.out.println("**************************");
            System.out.println(mesaj);
            System.out.println("**************************");
            System.out.println(sartlar);
            Yolcu yolcu=new Yolcu();
            System.out.println("Harç bedeli kontrol ediliyor...");
            Thread.sleep(3000);
            if(yolcu.yurtdisiHarciKontrol()==false){
                System.out.println(mesaj);
                continue;
            }
            System.out.println("Siyasi yasak kontrol ediliyor...");
            Thread.sleep(3000);
            if(yolcu.siyasiYasakKontrol()==false){
                System.out.println(mesaj);
                continue;
            }
            System.out.println("Vize durumu kontrol ediliyor...");
            Thread.sleep(3000);
            if(yolcu.vizeDurumuKontrol()==false){
                System.out.println(mesaj);
                continue;
            }
            System.out.println("İşlemleriniz tamamlanmıştır. Yurt dışına çıkış işlmeleriniz tamamlanmıştır...");

        }
    }
}
