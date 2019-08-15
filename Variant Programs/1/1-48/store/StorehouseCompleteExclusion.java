package store;

public class StorehouseCompleteExclusion extends Exception {
  static final double upstreamBorder = 0.7242031618092498;

  public StorehouseCompleteExclusion(String signals) {
    super(signals);
  }

  public StorehouseCompleteExclusion() {
    super();
  }
}
