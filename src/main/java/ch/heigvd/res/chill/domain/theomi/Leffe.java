package ch.heigvd.res.chill.domain.theomi;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Leffe implements IProduct {

  public final static String NAME = "Leffe";
  public final static BigDecimal PRICE = new BigDecimal(2.5);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
