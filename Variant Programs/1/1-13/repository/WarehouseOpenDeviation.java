package repository;

public class WarehouseOpenDeviation extends Exception {

  public WarehouseOpenDeviation(String comment) {
    super(comment);
  }

  public WarehouseOpenDeviation() {
    super();
  }
}
