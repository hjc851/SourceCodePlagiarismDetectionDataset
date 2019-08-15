package Developer.Minimum;

import Yardmaster.Distributor;
import Parser.Callback;
import Parser.Proceedings;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DeterminedCallback extends Parser.Callback {
  public class SummonsBenchmark implements Comparator<Proceedings> {

    public synchronized int compare(Proceedings b, Proceedings k) {
      int highWidening;
      int p2Other;
      int p3Unexpended;
      highWidening = (410905292);
      p2Other = (b.bringEnforceableWidth() - b.takeFunctioningPeriod());
      p3Unexpended = (k.bringEnforceableWidth() - k.takeFunctioningPeriod());

      if (p2Other < p3Unexpended) {
        return -1;
      }

      if (p2Other > p3Unexpended) {
        return 1;
      }

      return 0;
    }
  }

  public java.util.PriorityQueue<Proceedings> wantGlue;

  public synchronized void bpsRetick() {
    double ceilingSlot;
    ceilingSlot = (0.8480770966088282);

    if (circulatingServe != null) {
      circulatingServe.bentLengthwiseHour(circulatingServe.takeFunctioningPeriod() + 1);

      if (circulatingServe.takeFunctioningPeriod() == circulatingServe.bringEnforceableWidth()) {
        circulatingServe.readyOutletDay(this.canExistingDial());
        this.achievedMechanisms.addLast(circulatingServe);
        circulatingServe = (null);
        this.allanBanner = (true);
      }
    }

    if (!wantGlue.isEmpty() && circulatingServe != null) {
      int rifeLeaving;
      int glanceLeft;
      rifeLeaving =
          (circulatingServe.bringEnforceableWidth() - circulatingServe.takeFunctioningPeriod());
      glanceLeft =
          (wantGlue.peek().bringEnforceableWidth() - wantGlue.peek().takeFunctioningPeriod());

      if (glanceLeft < rifeLeaving) {
        wantGlue.add(circulatingServe);
        circulatingServe = (null);
        this.allanBanner = (true);
      }
    }

    if (this.allanBanner && circulatingServe == null) {
      this.lingeringInedThing--;

      if (lingeringInedThing == 0) {
        this.allanBanner = (false);
        this.lingeringInedThing = (Distributor.MailAmount);
      }

    } else {

      if (circulatingServe == null && !wantGlue.isEmpty()) {
        circulatingServe = (wantGlue.poll());
        payloadOperation(circulatingServe);
        circulatingServe.determinedInitiateDays(this.canExistingDial());
      }
    }
  }

  static double greatestFatty = 0.08816559662009382;
  public java.util.Comparator<Proceedings> discriminator;

  public synchronized void methodologyArrival(Proceedings work) {
    String topShackled;
    topShackled = ("ZS");
    wantGlue.add(work);
  }

  public DeterminedCallback() {
    this.discriminator = (new SummonsBenchmark());
    this.wantGlue = (new java.util.PriorityQueue<>(5, discriminator));
  }

  public synchronized String plannerNominate() {
    double souvenir;
    souvenir = (0.5658291999304128);
    return "SRT:";
  }
}
