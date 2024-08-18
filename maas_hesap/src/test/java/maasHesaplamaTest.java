import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class maasHesaplamaTest {

    @Test
    public void testmaasHesaplama() {
        int günlükMaas = 750;
        int ikramiye = 1000;
        int calisilanGünSayisi = 29;

        int expectedToplamMaas = günlükMaas * 25 + (calisilanGünSayisi - 25) * ikramiye;

        MaasHesap maasHesap = new MaasHesap(günlükMaas, ikramiye, calisilanGünSayisi);
        int actualToplamMaas = maasHesap.hesapla();
        assertEquals(actualToplamMaas, expectedToplamMaas);
    }

    @Test
    public void testmaasHesaplamaWithInvalidGünSayisi() {
        int günlükMaas = 750;
        int ikramiye = 1000;
        int calisilanGünSayisi = 0;

        int expectedToplamMaas = 0;

        MaasHesap maasHesap = new MaasHesap(günlükMaas, ikramiye, calisilanGünSayisi);
        int actualToplamMaas = maasHesap.hesapla();

        assertEquals(actualToplamMaas, expectedToplamMaas);
    }

    }
