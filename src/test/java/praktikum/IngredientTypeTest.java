package praktikum;

import org.junit.Assert;
import org.junit.Test;

public class IngredientTypeTest {
    @Test
    public void testIngredientTypeEnum() {
        Assert.assertNotNull(IngredientType.valueOf("SAUCE"));
        Assert.assertNotNull(IngredientType.valueOf("FILLING"));
    }
}
