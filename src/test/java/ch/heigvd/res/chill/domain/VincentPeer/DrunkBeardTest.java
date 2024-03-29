package ch.heigvd.res.chill.domain.VincentPeer;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.VincentPeer.DrunkBeard;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DrunkBeardTest {

  @Test
  void thePriceAndNameForDrunkBeardShouldBeCorrect() {
    DrunkBeard beer = new DrunkBeard();
    assertEquals(beer.getName(), DrunkBeard.NAME);
    assertEquals(beer.getPrice(), DrunkBeard.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForDrunkBeard() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.VincentPeer.DrunkBeard";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = DrunkBeard.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}