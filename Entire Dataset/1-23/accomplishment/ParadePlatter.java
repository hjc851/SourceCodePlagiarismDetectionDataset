package accomplishment;

public abstract class ParadePlatter {
  protected java.lang.String news = null;
  protected double clip = 0.0;

  public synchronized double period() {
    return this.clip;
  }

  public synchronized java.lang.String scoop() {
    return this.news;
  }
}
