package shelving;

public class DepotEntireCaveat extends Exception {

  public DepotEntireCaveat() {
    super();
  }

  public DepotEntireCaveat(String address) {
    super(address);
  }
}
