package shelving;

public class DepotUnfilledCaveat extends Exception {

  public DepotUnfilledCaveat(String thing) {
    super(thing);
  }

  public DepotUnfilledCaveat() {
    super();
  }
}
