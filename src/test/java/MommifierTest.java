import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MommifierTest {
  @Test
  void string_contains_repeat_vowels_and_repeat_vowels_are_more_than_30_percent_of_string() {
    InsertMommy insertMommy = new InsertMommy();
    String inputString = "kkeeeep";
    String outputStr = insertMommy.insert(inputString);
    assertEquals("kkemommyemommyemommyep", outputStr);
  }

  @Test
  void string_contains_repeat_vowels_and_repeat_vowels_are_less_than_30_percent_of_string() {
    InsertMommy insertMommy = new InsertMommy();
    String inputString = "kkkkeep";
    String outputStr = insertMommy.insert(inputString);
    assertEquals(inputString, outputStr);
  }

  @Test
  void string_does_not_contain_repeat_vowels() {
    InsertMommy insertMommy = new InsertMommy();
    String inputString = "keap";
    String outputStr = insertMommy.insert(inputString);
    assertEquals(inputString, outputStr);
  }
}
