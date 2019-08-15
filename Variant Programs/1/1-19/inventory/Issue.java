package inventory;

public class Issue<T> {

  public synchronized inventory.Issue<T> goPreceding() {
    return this.earlier;
  }

  private inventory.Issue<T> earlier;

  public synchronized void determinedPremature(inventory.Issue<T> early) {
    this.earlier = (early);
  }

  public synchronized T fetchTabulations() {
    return this.numbers;
  }

  public synchronized void doIntelligence(T files) {
    this.numbers = (files);
  }

  public synchronized inventory.Issue<T> receiveIncoming() {
    return this.second;
  }

  public synchronized void laidFollowing(inventory.Issue<T> incoming) {
    this.second = (incoming);
  }

  private T numbers;
  private inventory.Issue<T> second;

  public Issue(T study, Issue<T> after, Issue<T> elapsed) {
    this.numbers = (study);
    this.second = (after);
    this.earlier = (elapsed);
  }
}
