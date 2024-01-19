import com.natixis.Product;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
        aPen.setName("Book");

        assertEquals(aPen.getName(), "Book");
    }
}
