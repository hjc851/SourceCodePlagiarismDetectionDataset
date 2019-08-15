package depository;

public class ArchivalOverflowingExempt extends Exception {

  public ArchivalOverflowingExempt() {
    super();
  }

  public ArchivalOverflowingExempt(String impression) {
    super(impression);
  }
}
