public class PcMuhendisi implements IMuhendis {
    private boolean askerlik;
    private boolean adliSicil;

    public PcMuhendisi(boolean askerlik, boolean adliSicil) {
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
        if (adliSicil){
            System.out.println("Adli sicil kaydım vardır.");
        }else {
            System.out.println("Adli sicil kaydım yoktur.");
        }

    }

    @Override
    public void isTecrubesi(String[] array) {
        System.out.println("Bilgisayar Programcısı olarak şu şirketlerde çalıştım...");
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
