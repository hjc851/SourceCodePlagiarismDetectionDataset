package storeroom;

public class ArchivalOverflowingExempt extends Exception {

  public ArchivalOverflowingExempt(String letters) {
    super(letters);
  }

  public ArchivalOverflowingExempt() {
    super();
  }
}
