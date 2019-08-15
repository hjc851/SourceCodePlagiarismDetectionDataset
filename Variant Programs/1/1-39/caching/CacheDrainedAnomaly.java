package caching;

public class CacheDrainedAnomaly extends Exception {

  public CacheDrainedAnomaly() {
    super();
  }

  public CacheDrainedAnomaly(String comment) {
    super(comment);
  }
}
