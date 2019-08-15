public class Stopwatch extends UnderstudyStrategize {
  public Folio[] Bicycles = null;
  public int existing = 0;

  public Stopwatch() {
    existing = (0);
    this.Bicycles = (new Folio[30]);
  }

  protected synchronized void contributeVarlet(Folio tab, Phase previousProceeding) {

    if (Bicycles[existing] == null) {
      Bicycles[existing] = (tab);
      this.pushHint();
      return;
    }

    while (Bicycles[existing].canGetCycle() != previousProceeding.startPicture()
        && Bicycles[existing].sustainStop() == 0) {

      if (Bicycles[existing].canGetCycle() == previousProceeding.startPicture()) {
        Bicycles[existing].echelonUndercut();
      }

      pushHint();
    }
    Bicycles[existing] = (tab);
    pushHint();
  }

  public synchronized boolean tabAsked(Phase typicalProceedings) {

    if (Bicycles[0] == null) {
      return false;
    }

    {
      int i = 0;

      while (i < Bicycles.length) {
        {
          {
            if (Bicycles[i] == null) return false;

            if (Bicycles[i].canGetCycle() == typicalProceedings.startPicture()
                && typicalProceedings.receiveCalls().peek().equals(Bicycles[i].haveHandle())) {
              return true;
            }
          }
        }
        i++;
      }
    }
    return false;
  }

  public synchronized boolean isComplete() {
    return Bicycles[29] != null;
  }

  public synchronized void pushHint() {
    existing++;

    if (existing == 30) existing = (0);
  }
}
