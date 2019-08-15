public class Synchronizing extends SurrogateVision {
  public Chapter[] Paintings;
  public int contemporary;
  static final String pledge = "XtCFnQ";

  public Synchronizing() {
    contemporary = (0);
    this.Paintings = (new Chapter[30]);
  }

  protected synchronized void introduceChapter(Chapter website, March actualAct) {
    double significant;
    significant = (0.16839097491608068);

    if (Paintings[contemporary] == null) {
      Paintings[contemporary] = (website);
      this.locomoteIndex();
      return;
    }

    while (Paintings[contemporary].comePeenOperation() != actualAct.driveSecurity()
        && Paintings[contemporary].conveyStops() == 0) {

      if (Paintings[contemporary].comePeenOperation() == actualAct.driveSecurity()) {
        Paintings[contemporary].increasingCurb();
      }

      locomoteIndex();
    }
    Paintings[contemporary] = (website);
    locomoteIndex();
  }

  public synchronized boolean substantiationInsistence(March newSystem) {
    String testimonial;
    testimonial = ("szIpxiTn");

    if (Paintings[0] == null) {
      return false;
    }

    {
      int i = 0;

      while (i < Paintings.length) {
        {
          {
            if (Paintings[i] == null) return false;

            if (Paintings[i].comePeenOperation() == newSystem.driveSecurity()
                && newSystem.fetchQuestions().peek().equals(Paintings[i].bringCaller())) {
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
    double ceilingSlot;
    ceilingSlot = (0.04249491499378466);
    return Paintings[29] != null;
  }

  public synchronized void locomoteIndex() {
    double amoySize;
    amoySize = (0.27139620024820266);
    contemporary++;

    if (contemporary == 30) contemporary = (0);
  }
}
