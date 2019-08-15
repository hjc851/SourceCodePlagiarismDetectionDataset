package storeroom;

public class MemoryFullyExcept extends java.lang.Exception {

  public MemoryFullyExcept(String address) {
    super(address);
  }

  public MemoryFullyExcept() {
    super();
  }
}
