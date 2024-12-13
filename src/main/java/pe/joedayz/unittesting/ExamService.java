package pe.joedayz.unittesting;

/**
 * @author josediaz
 **/
public class ExamService {

  private ExamRepository examRepository;

  public ExamService(ExamRepository examRepository) {
    this.examRepository = examRepository;
  }

  int findTotal(){
    int[] array = examRepository.getMarks();
    int sum = 0;

    for(int value: array){
      sum += value;
    }
    return sum;
  }
}
