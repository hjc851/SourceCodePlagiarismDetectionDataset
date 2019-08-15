package memory;

public class CachingVoidExemptions extends Exception {

  public CachingVoidExemptions() {
    super();
  }

  public CachingVoidExemptions(String thing) {
    super(thing);
  }
}
