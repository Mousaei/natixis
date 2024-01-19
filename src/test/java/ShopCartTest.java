import com.natixis.Product;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class ShopCartTest {

    @Test
    public void testNameProduct() {
        Product aPen = new Product();

        aPen.setName("redPen");
        // Assert
        assertEquals(aPen.getName(), "redPen");
    }

    @Test
    public void tesPriceProduct() {
        Product aPen = new Product();
        aPen.setPrice(1.50F);

        System.out.println("secondPen: " + aPen.getPrice());
        // Assert
        assertSame( aPen, aPen);
    }
}
