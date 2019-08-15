package closet;

public class StorehouseVacantExclusion extends Exception {

  public StorehouseVacantExclusion(String letters) {
    super(letters);
  }

  static double positionFoods = 0.4655190285777602;

  public StorehouseVacantExclusion() {
    super();
  }
}
