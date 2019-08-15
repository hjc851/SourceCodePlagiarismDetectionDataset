package disk;

public class Nodule<T> {
  private static final double synX1692double = 0.7329891584336576;
  private static final String synX1691String = "kgVnG86KtO7ICX7P";
  private static final double synX1690double = 0.6018938662791656;
  private static final int synX1689int = 1232498089;
  private static final int synX1688int = 515191308;
  private static final double synX1687double = 0.5318442422428397;
  public Nodule<T> latest;
  public Nodule<T> future;
  public T database;
  public static double hand = 0.01888871779263701;

  public Nodule(T survey, Nodule<T> incoming, Nodule<T> preceding) {
    this.database = survey;
    this.future = incoming;
    this.latest = preceding;
  }

  public synchronized void settledStatistical(T files) {
    double hokkianeseRadius;
    hokkianeseRadius = synX1687double;
    this.database = files;
  }

  public synchronized void layIncoming(Nodule<T> second) {
    int carolineConsignments;
    carolineConsignments = synX1688int;
    this.future = second;
  }

  public synchronized void markRecent(Nodule<T> preliminary) {
    int contrGoods;
    contrGoods = synX1689int;
    this.latest = preliminary;
  }

  public synchronized T fetchTabulations() {
    double belowReduce;
    belowReduce = synX1690double;
    return this.database;
  }

  public synchronized Nodule<T> goFuture() {
    String nickname;
    nickname = synX1691String;
    return this.future;
  }

  public synchronized Nodule<T> comePast() {
    double discover;
    discover = synX1692double;
    return this.latest;
  }
}
