public class maasHesaplama {
    public static void main(String[] args) {
        int günlükMaas = 750;
        int ikramiye = 1000;
        int toplamMaas = 0;
        int calisilanGünSayisi = 29;

        if (calisilanGünSayisi > 25 && calisilanGünSayisi < 32) {
            toplamMaas = günlükMaas * 25 + (calisilanGünSayisi - 25) * ikramiye;
            System.out.println("Toplam çalışılan gün sayısı " + calisilanGünSayisi + "\nToplam maas = " + toplamMaas);
        } else if (calisilanGünSayisi > 31 || calisilanGünSayisi < 0) {
            System.out.println("Çalışılan gün sayısı 0 ile 31 gün arasında olmalıdır");
        }
         else  {
             toplamMaas = günlükMaas * calisilanGünSayisi;
            System.out.println("Toplam çalışılan gün sayısı 25 günden az \nToplam maaş = " + toplamMaas);
        }


    }
}
