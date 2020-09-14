import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MommifierTest {
  @Test
  void should_insert_mommy_for_repeat_vowels_when_string_contains_repeat_vowels_and_vowels_more_than_30_percent() {
    InsertMommy insertMommy = new InsertMommy();
    String inputString = "kkeeeep";
    String outputStr = insertMommy.insert(inputString);
    assertEquals("kkemommyemommyemommyep", outputStr);
  }

  @Test
  void should_return_itself_when_string_contains_repeat_vowels_and_vowels_less_than_30_percent() {
    InsertMommy insertMommy = new InsertMommy();
    String inputString = "kkkkeep";
    String outputStr = insertMommy.insert(inputString);
    assertEquals(inputString, outputStr);
  }

  @Test
  void should_return_itself_when_string_does_not_contain_repeat_vowels() {
    InsertMommy insertMommy = new InsertMommy();
    String inputString = "keap";
    String outputStr = insertMommy.insert(inputString);
    assertEquals(inputString, outputStr);
  }

  @Test
  void should_throw_exception_when_string_is_empty() {
    InsertMommy insertMommy = new InsertMommy();
    String inputString = "";
    assertThrows(StringIsEmptyException.class, () -> {
      insertMommy.insert(inputString);
    }) ;
  }
}
