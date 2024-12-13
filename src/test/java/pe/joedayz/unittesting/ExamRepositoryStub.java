package pe.joedayz.unittesting;

/**
 * @author josediaz
 **/
public class ExamRepositoryStub extends ExamRepository {

  @Override
  int[] getMarks() {
    return new int[] {15, 20, 5};
  }
}
