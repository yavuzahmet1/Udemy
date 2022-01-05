public class Main {

    public static void main(String[] args) {
        IMuhendis muhendis = new PcMuhendisi(true, false);
        muhendis.askerlikDurumuSorgula();
        muhendis.adliSicilSorgula();
        System.out.println(muhendis.mezuniyetOrtalaması(2.99));
        String[] tecrube = {"Arçelik", "Modern", "Kaya", "Yılmazlar", "Hava Reklam"};
        muhendis.isTecrubesi(tecrube);

        System.out.println("**********************");
        MakineMuhendisi makineMuhendisi = new MakineMuhendisi(true, false);
        String[] tecrübe1 = {};
        String[] referans = {"Ahmet YAVUZ", "Hale KAYA", "Mehmet BAY"};
        makineMuhendisi.adliSicilSorgula();
        makineMuhendisi.askerlikDurumuSorgula();
        makineMuhendisi.isTecrubesi(tecrübe1);
        System.out.println(makineMuhendisi.mezuniyetOrtalaması(2.34));
        makineMuhendisi.referans(referans);
        makineMuhendisi.calis();
    }
}
