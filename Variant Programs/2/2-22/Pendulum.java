public class Pendulum extends RenewalTactic {
  private static final int synX1342int = 0;
  private static final int synX1341int = 30;
  private static final int synX1340int = 29;
  private static final boolean synX1339boolean = false;
  private static final boolean synX1338boolean = true;
  private static final boolean synX1337boolean = false;
  private static final int synX1336int = 0;
  private static final boolean synX1335boolean = false;
  private static final int synX1334int = 0;
  private static final int synX1333int = 0;
  public int prevailing;
  public Folio[] Bases;

  public Pendulum() {
    prevailing = 0;
    this.Bases = new Folio[30];
  }

  protected synchronized void bringPageboy(Folio chapter, Mechanisms liveOutgrowth) {

    if (Bases[prevailing] == null) {
      Bases[prevailing] = chapter;
      this.leapPrompt();
      return;
    }

    while (Bases[prevailing].canGetCycle() != liveOutgrowth.produceMap()
        && Bases[prevailing].beatTile() == synX1333int) {

      if (Bases[prevailing].canGetCycle() == liveOutgrowth.produceMap()) {
        Bases[prevailing].surgeCounterbalance();
      }

      leapPrompt();
    }
    Bases[prevailing] = chapter;
    leapPrompt();
  }

  public synchronized boolean assureDemands(Mechanisms streamPhase) {

    if (Bases[synX1334int] == null) {
      return synX1335boolean;
    }

    {
      int i = synX1336int;

      while (i < Bases.length) {
        {
          {
            if (Bases[i] == null) return synX1337boolean;

            if (Bases[i].canGetCycle() == streamPhase.produceMap()
                && streamPhase.arriveInvitations().peek().equals(Bases[i].startPicture())) {
              return synX1338boolean;
            }
          }
        }
        i++;
      }
    }
    return synX1339boolean;
  }

  public synchronized boolean isComplete() {
    return Bases[synX1340int] != null;
  }

  public synchronized void leapPrompt() {
    prevailing++;

    if (prevailing == synX1341int) prevailing = synX1342int;
  }
}
