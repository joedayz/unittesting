package pe.joedayz.unittesting;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author josediaz
 **/
@Component
@Primary
public class CollaborativeFilter implements Filter{

  @Override
  public String[] getRecommendations(String movie) {
    return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
  }
}
