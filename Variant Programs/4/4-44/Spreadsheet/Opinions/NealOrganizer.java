package Spreadsheet.Opinions;

import Device.Plenum;
import Developer.Database;
import Developer.Method;
import java.util.ArrayDeque;

public class NealOrganizer extends Database {
  private static final int synX2029int = 0;
  private static final int synX2028int = 0;
  private static final int synX2027int = 6;
  private static final String synX2026String = "FB:";
  private static final boolean synX2025boolean = true;
  private static final boolean synX2024boolean = false;
  private static final int synX2023int = 0;
  private static final boolean synX2022boolean = false;
  private static final int synX2021int = 0;
  private static final boolean synX2020boolean = true;
  private static final int synX2019int = 1;
  private static final int synX2018int = 0;
  private static final boolean synX2017boolean = true;
  private static final int synX2016int = 1;
  private static final int synX2015int = 0;
  private static final int synX2014int = 0;

  public synchronized void phaseEntry(Method summons) {
    intelligentFronts[synX2014int].addLast(summons);
  }

  public synchronized Method obtainLastOutgrowth() {
    {
      int i = synX2015int;

      while (i < intelligentFronts.length) {
        {
          {
            if (!intelligentFronts[i].isEmpty()) {
              theEmphasis = (i);
              return intelligentFronts[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  public ArrayDeque<Method>[] intelligentFronts = null;
  public int nowUnanswered = 0;
  public int theEmphasis = 0;

  public synchronized void addTock() {

    if (presentlyMechanism != null) {
      presentlyMechanism.fitSquirtingYear(presentlyMechanism.fixFunctionalChance() + synX2016int);
      nowUnanswered--;

      if (presentlyMechanism.fixFunctionalChance() == presentlyMechanism.arrivePrezWingspan()) {
        presentlyMechanism.doExodusAgain(this.haveCirculatingShudder());
        this.conductedServe.addLast(presentlyMechanism);
        presentlyMechanism = (null);
        this.malcolmIris = (synX2017boolean);
      }

      if (nowUnanswered == synX2018int && presentlyMechanism != null) {

        if (primedIsVacant()) {
          nowUnanswered = (SentenceTeleportation);
        } else {
          intelligentFronts[theEmphasis + synX2019int].addLast(presentlyMechanism);
          presentlyMechanism = (null);
          this.malcolmIris = (synX2020boolean);
        }
      }
    }

    if (this.malcolmIris && presentlyMechanism == null) {
      this.oddBenzDay--;

      if (oddBenzDay == synX2021int) {
        this.malcolmIris = (synX2022boolean);
        this.oddBenzDay = (Plenum.RoutingWeek);
      }

    } else {

      if (presentlyMechanism == null && !primedIsVacant()) {
        presentlyMechanism = (obtainLastOutgrowth());
        ladenWork(presentlyMechanism);
        presentlyMechanism.rigidOpeningAmount(this.haveCirculatingShudder());
        nowUnanswered = (SentenceTeleportation);
      }
    }
  }

  public synchronized boolean primedIsVacant() {
    {
      int i = synX2023int;

      while (i < intelligentFronts.length) {
        {
          {
            if (!intelligentFronts[i].isEmpty()) {
              return synX2024boolean;
            }
          }
        }
        i++;
      }
    }
    return synX2025boolean;
  }

  public synchronized String synchronizerDescribe() {
    return synX2026String;
  }

  public NealOrganizer() {
    this.intelligentFronts = (new ArrayDeque[synX2027int]);
    {
      int i = synX2028int;

      while (i < intelligentFronts.length) {
        {
          {
            intelligentFronts[i] = (new ArrayDeque<>());
          }
        }
        i++;
      }
    }
    nowUnanswered = (SentenceTeleportation);
    theEmphasis = (synX2029int);
  }
}
