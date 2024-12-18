package pe.joedayz.unittesting;

import org.springframework.stereotype.Component;

/**
 * @author josediaz
 **/
@Component
public class ContentBasedFilter implements Filter{

  @Override
  public String[] getRecommendations(String movie) {
    return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
  }
}
