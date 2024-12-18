package pe.joedayz.unittesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * @author josediaz
 **/
@ExtendWith(MockitoExtension.class)
public class ExamServiceMockitoAnnotationsTest {

  @Mock
  ExamRepository examRepoMock;

  @InjectMocks
  ExamService examService;


  @Test
  void testFindTotal(){

    when(examRepoMock.getMarks()).thenReturn(new int[]{15, 20, 5});
    int total = examService.findTotal();
    assertEquals(40, total);

  }
}
