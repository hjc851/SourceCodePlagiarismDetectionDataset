package garage;

public class DepotUnfilledCaveat extends Exception {

  public DepotUnfilledCaveat(String text) {
    super(text);
  }

  public DepotUnfilledCaveat() {
    super();
  }
}
