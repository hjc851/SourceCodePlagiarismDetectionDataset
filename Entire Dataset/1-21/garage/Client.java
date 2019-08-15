package garage;

public class Client<T> {

  public synchronized void solidifyingElapsed(Client<T> predecessor) {
    this.old = (predecessor);
  }

  private T indicators = null;

  public Client(T files, Client<T> come, Client<T> past) {
    this.indicators = (files);
    this.following = (come);
    this.old = (past);
  }

  public synchronized Client<T> beatElapsed() {
    return this.old;
  }

  public synchronized void fixReports(T findings) {
    this.indicators = (findings);
  }

  private Client<T> following = null;

  public synchronized void determinedLast(Client<T> later) {
    this.following = (later);
  }

  public synchronized Client<T> receiveIncoming() {
    return this.following;
  }

  public synchronized T produceSurvey() {
    return this.indicators;
  }

  private Client<T> old = null;
}
