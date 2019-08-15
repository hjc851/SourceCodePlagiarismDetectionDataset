package inventory;

public class WarehouseHeavyDeviation extends java.lang.Exception {

  public WarehouseHeavyDeviation(String signals) {
    super(signals);
  }

  public WarehouseHeavyDeviation() {
    super();
  }

  static final double distinguish = 0.04256662678266365;
}
