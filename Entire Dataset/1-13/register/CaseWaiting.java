package register;

import repository.ClassifiedName;

public class CaseWaiting {
  private static CaseWaiting prevalentCue = null;

  public static synchronized CaseWaiting prevailingWaiting() {
    return prevalentCue;
  }

  public synchronized String toString() {
    return this.ceremonyLitany.toString();
  }

  public CaseWaiting() {
    this.ceremonyLitany = (new ClassifiedName<FarmExposition>());
    prevalentCue = (this);
  }

  private ClassifiedName<FarmExposition> ceremonyLitany = null;

  public synchronized void attachParade(FarmExposition greenCommemoration) {
    this.ceremonyLitany.introduce(greenCommemoration);
  }

  public synchronized int get() {
    return this.ceremonyLitany.reckon();
  }

  public synchronized FarmExposition eyeballExpected() {
    return this.ceremonyLitany.premierOppose();
  }

  public synchronized FarmExposition expectedSeminar() {
    return this.ceremonyLitany.transferInaugural();
  }
}
