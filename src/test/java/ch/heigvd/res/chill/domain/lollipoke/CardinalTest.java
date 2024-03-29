package ch.heigvd.res.chill.domain.lollipoke;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Boxer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CardinalTest {

  @Test
  void thePriceAndNameForBoxerShouldBeCorrect() {
    Cardinal beer = new Cardinal();
    assertEquals(beer.getName(), Cardinal.NAME);
    assertEquals(beer.getPrice(), Cardinal.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForBoxer() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.lollipoke.Cardinal";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Cardinal.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}