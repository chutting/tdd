import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InsertMommy {
  public String insert(String originalString) {
    int originalStringLength = originalString.length();
    StringBuffer stringBuffer = new StringBuffer(originalString);
    int insertMommyCount = 0;
    if (isVowelsMoreThan30Percent(originalString)) {
      for (int i = 1; i < originalStringLength; i++) {
        if (originalString.charAt(i) == originalString.charAt(i - 1) && isCharacterVowel(originalString.charAt(i))) {
          stringBuffer.insert(i + insertMommyCount * 5, "mommy");
          insertMommyCount += 1;
        }
      }
    }
    return "" + stringBuffer;
  }

  private boolean isCharacterVowel(Character character) {
    return String.valueOf(character).matches("[aeiouAEIOU]");
  }

  private boolean isVowelsMoreThan30Percent(String str) {
    int originalStringLength = str.length();
    long vowelsCount = Arrays.stream(str.split("")).filter(ele -> ele.matches("[aeiouAEIOU]")).count();
    return vowelsCount > originalStringLength * 0.3;
  }
}
