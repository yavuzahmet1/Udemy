public class MakineMuhendisi implements IMuhendis ,ICalisma{
    private boolean askerlik;
    private boolean adliSicil;

    public MakineMuhendisi(boolean askerlik, boolean adliSicil) {
        this.askerlik = askerlik;
        this.adliSicil = adliSicil;
    }

    @Override
    public void askerlikDurumuSorgula() {
        if (askerlik) {
            System.out.println("Askerliğimi yaptım.");
        } else {
            System.out.println("Askerliğimi henüz yapmadım.");
        }
    }

    @Override
    public String mezuniyetOrtalaması(double derece) {
        return "Ortalamam: " + derece;
    }

    @Override
    public void adliSicilSorgula() {
        if (adliSicil) {
            System.out.println("Adli sicil kaydım vardır.");
        } else {
            System.out.println("Adli sicil kaydım yoktur.");
        }
    }

    @Override
    public void isTecrubesi(String[] array) {
        if (array.length == 0) {
            System.out.println("Herhangi bir iş tecrübem yoktur.");
        }else {
            System.out.println("Makine mühendisi olarak şu şirketlerde çalıştım.");
            for (int i=0;i<array.length;i++){
                System.out.println(array[i]);
            }
        }
    }
    public void referans(String[] array){
        if (array.length==0){
            System.out.println("Herhangi bir referansım bulunmuyor.");
        }else {
            System.out.println("Referanslarım...");
            for (int i=0;i<array.length;i++){
                System.out.println(array[i]);
            }
        }
    }

    @Override
    public void calis() {
        System.out.println("Makine mühendisi çalışıyor..");
    }
}
