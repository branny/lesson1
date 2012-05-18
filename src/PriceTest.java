import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PriceTest {
    private Price price;
    @Before public void init(){
         this.price=new Price();
    }
    @Test public void return_0_if_list_is_nothing(){
        assertEquals(0,price.price(""));
    }

    @Test public void return_50_if_list_is_A(){
        assertEquals(50,price.price("A"));
    }

    @Test public void return_80_if_list_is_AB(){
        assertEquals(80,price.price("AB"));
    }

    @Test public void return_115_if_list_is_CDBA(){
        assertEquals(115,price.price("CDBA"));
    }

    @Test public void return_100_if_list_is_AA(){
        assertEquals(100,price.price("AA"));
    }

    @Test public void return_130_if_list_is_AAA(){
        assertEquals(130,price.price("AAA"));
    }

    @Test public void return_180_if_list_is_AAAA(){
        assertEquals(180,price.price("AAAA"));
    }

    @Test public void return_230_if_list_is_AAAAA(){
        assertEquals(230,price.price("AAAAA"));
    }

    @Test public void return_260_if_list_is_AAAAAA(){
        assertEquals(260,price.price("AAAAAA"));
    }

    @Test public void return_160_if_list_is_AAAB(){
        assertEquals(160,price.price("AAAB"));
    }

    @Test public void return_175_if_list_is_AAABB(){
        assertEquals(175,price.price("AAABB"));
    }

    @Test public void return_190_if_list_is_AAABBD(){
        assertEquals(190,price.price("AAABBD"));
    }

    @Test public void return_190_if_list_is_DABABA(){
        assertEquals(190,price.price("DABABA"));
    }
}
