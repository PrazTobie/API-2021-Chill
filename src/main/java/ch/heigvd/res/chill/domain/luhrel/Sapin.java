package ch.heigvd.res.chill.domain.luhrel;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Sapin implements IProduct {
    public final static String NAME = "Sapin";
    public final static BigDecimal PRICE = new BigDecimal(4.5);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
