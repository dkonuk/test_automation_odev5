import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


public class maasHesaplamaTestWithData {

    @Test(dataProvider = "maasdetay")
    public void testmaasHesaplama(int günlükMaas, int ikramiye, int calisilanGünSayisi, int expectedToplamMaas) {
        MaasHesap maasHesap = new MaasHesap(günlükMaas, ikramiye, calisilanGünSayisi);
        int actualToplamMaas = maasHesap.hesapla();
        assertEquals(actualToplamMaas, expectedToplamMaas);
    }

    @Test(dataProvider = "invaliddays")
    public void testmaasHesaplamaWithInvalidGünSayisi(int günlükMaas, int ikramiye, int calisilanGünSayisi, int expectedToplamMaas) {
        MaasHesap maasHesap = new MaasHesap(günlükMaas, ikramiye, calisilanGünSayisi);
        int actualToplamMaas = maasHesap.hesapla();

        assertEquals(actualToplamMaas, expectedToplamMaas);
    }

    @DataProvider(name = "maasdetay")
    public Object[][] dataprovider() {
        return new Object[][]{
                {750, 1000, 29, 22750},
                {750, 1000, 0, 0},
                {750, 1000, 31, 24750}
        };
    }
    @DataProvider(name = "invaliddays")
        public Object[][] invaliddataprovider () {
            return new Object[][]{
                    {750, 1000, 43, 0},
                    {750, 1000, -33, 0}
            };
        }
    }
