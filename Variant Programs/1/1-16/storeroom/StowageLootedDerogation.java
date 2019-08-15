package storeroom;

public class StowageLootedDerogation extends Exception {

  public StowageLootedDerogation(String email) {
    super(email);
  }

  public StowageLootedDerogation() {
    super();
  }
}
