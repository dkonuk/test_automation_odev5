public class maasHesaplama {
    public static void main(String[] args) {
        MaasHesap maasHesap = new MaasHesap(750, 1000, 29);
        int toplamMaas = maasHesap.hesapla();
        System.out.println("Toplam maas: " + toplamMaas);
    }
}

class MaasHesap {
    private int gunlukMaas;
    private int ikramiye;
    private int calisilanGunSayisi;

    public MaasHesap(int gunlukMaas, int ikramiye, int calisilanGunSayisi) {
        this.gunlukMaas = gunlukMaas;
        this.ikramiye = ikramiye;
        this.calisilanGunSayisi = calisilanGunSayisi;
    }

    public int hesapla() {
        if (calisilanGunSayisi > 25 && calisilanGunSayisi < 32) {
            return gunlukMaas * 25 + (calisilanGunSayisi - 25) * ikramiye;
        } else if (calisilanGunSayisi > 31 || calisilanGunSayisi < 0) {
            System.out.println("Calisilan gun sayisi 0 ile 31 gun arasında olmalıdır");
            return 0;

        } else {
            return gunlukMaas * calisilanGunSayisi;

        }
    }

}
