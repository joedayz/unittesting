package pe.joedayz.unittesting;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

/**
 * @author josediaz
 **/
public class RecommenderImplementationUnitTest {


  @Test
  void testRecommendMovies_withCollaborativeFilter() {

    RecommenderImplementation recommenderImplementation= new RecommenderImplementation(
        new CollaborativeFilter());;
    String[] actualResult = recommenderImplementation.getRecommendations("Finding Dory");
    assertArrayEquals(new String[] {"Finding Nemo", "Ice Age", "Toy Story"}, actualResult);
  }

  @Test
  void testRecommendMovies_withContentBasedFilter() {

    RecommenderImplementation recommenderImplementation= new RecommenderImplementation(
        new ContentBasedFilter());;
    String[] actualResult = recommenderImplementation.getRecommendations("Finding Dory");
    assertArrayEquals(new String[] {"Happy Feet", "Ice Age", "Shark Tale"}, actualResult);
  }
}
