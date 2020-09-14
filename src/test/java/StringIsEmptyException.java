public class StringIsEmptyException extends RuntimeException {
  public StringIsEmptyException() {
    super();
  }

  public StringIsEmptyException(String message) {
    super(message);
  }
}
