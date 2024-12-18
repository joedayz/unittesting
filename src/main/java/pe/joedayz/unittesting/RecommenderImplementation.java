package pe.joedayz.unittesting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author josediaz
 **/
@Component
public class RecommenderImplementation {

  @Autowired
  private Filter filter;

  public RecommenderImplementation(Filter filter) {
    this.filter = filter;
  }



  public String[] getRecommendations(String movie) {
    System.out.println("\nName of the filter in use: " + filter + "\n");

    String[] results = filter.getRecommendations("Finding Dory");

    return results;
  }
}
