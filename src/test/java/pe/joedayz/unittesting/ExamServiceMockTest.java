package pe.joedayz.unittesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

/**
 * @author josediaz
 **/
public class ExamServiceMockTest {


//  @Test
//  void testFindTotal(){
//    ExamService examService = new ExamService(new ExamRepositoryStub());
//    int total = examService.findTotal();
//    assertEquals(40, total);
//  }

  @Test
  void testFindTotal(){
    ExamRepository examRepoMock = mock(ExamRepository.class);
    when(examRepoMock.getMarks()).thenReturn(new int[]{15, 20, 5});

    ExamService examService = new ExamService(examRepoMock);
    int total = examService.findTotal();
    assertEquals(40, total);

  }

  @Test
  void testfindTotal_EmptyArray() {
    ExamRepository examRepoMock = mock(ExamRepository.class);
    when(examRepoMock.getMarks()).thenReturn(new int[] {});

    ExamService examService = new ExamService(examRepoMock);
    int total = examService.findTotal();
    assertEquals(0, total);
  }

}
