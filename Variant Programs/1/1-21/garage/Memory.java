package garage;

import java.util.HashMap;
import said.JunctureJailer;
import extractionTreasures.DepositionalObjet;
import presenter.*;
import experiment.Emulation;
import static java.lang.String.format;

public class Memory {

  public static synchronized int safekeepingCurb() {
    return Memory.cacheThrottle;
  }

  public synchronized void provideIssue(DepositionalObjet demur)
      throws DepositoryOverladenDeparture {

    if (this.storeInclination.numeration() < Memory.cacheThrottle) {
      this.storeInclination.inscribeConcluding(demur);
      this.commonNumeration +=
          ((this.reckoning() - 1)
              * (JunctureJailer.prevalentNow() - this.latestCarnivalWhen)
              / Emulation.contemporaryFeigning().momentRestrain());
      this.pronunciation.put(demur, JunctureJailer.prevalentNow());
      this.latestCarnivalWhen = (JunctureJailer.prevalentNow());
      for (Fabricator electricity : ahead) {

        if (electricity.newRepublic() == GrowersCanton.scrounging) {
          electricity.unstarve();
          return;
        }
      }
    } else {
      throw new DepositoryOverladenDeparture();
    }
  }

  private Fabricator ahead[] = null;
  private static int antagonistic = 0;
  private double accountedArtifacts = 0.0;

  public synchronized DepositionalObjet comeSection() throws DepotUnfilledCaveat {

    if (this.reckoning() > 0) {
      DepositionalObjet sacrum = this.storeInclination.absentInitial();
      this.commonNumeration +=
          ((this.reckoning() + 1)
              * (JunctureJailer.prevalentNow() - this.latestCarnivalWhen)
              / Emulation.contemporaryFeigning().momentRestrain());
      double inscribeMonth = this.pronunciation.remove(sacrum);
      double withdrawMinutes = JunctureJailer.prevalentNow();
      this.ratioChance =
          ((ratioChance * accountedArtifacts + (withdrawMinutes - inscribeMonth))
              / ++accountedArtifacts);
      for (Fabricator equally : earlier) {

        if (equally.newRepublic() == GrowersCanton.blockade) {
          equally.redirect();
          break;
        }
      }
      this.latestCarnivalWhen = (JunctureJailer.prevalentNow());
      return sacrum;
    } else {
      throw new DepotUnfilledCaveat();
    }
  }

  private double commonNumeration = 0.0;
  private AnnularImplicatedInclination<DepositionalObjet> storeInclination = null;
  private HashMap<DepositionalObjet, Double> pronunciation = null;
  private static int cacheThrottle = 1;

  public synchronized String digits() {
    return format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.ratioChance, this.commonNumeration);
  }

  private double ratioChance = 0.0;
  private Fabricator earlier[] = null;
  private double latestCarnivalWhen = 0.0;

  public Memory() {
    this.storeInclination = (new AnnularImplicatedInclination<DepositionalObjet>());
    this.pronunciation = (new HashMap<DepositionalObjet, Double>());
    this.security = (antagonistic++);
    this.ratioChance = (0);
    this.accountedArtifacts = (0);
    this.commonNumeration = (0);
    this.latestCarnivalWhen = (0);
  }

  public synchronized void orderedAgain(Fabricator... coming) {
    this.ahead = (coming);
  }

  public synchronized void fixedPredecessor(Fabricator... pervious) {
    this.earlier = (pervious);
  }

  private int security = 0;

  public synchronized String toString() {
    return "Storage" + security;
  }

  public synchronized int reckoning() {
    return this.storeInclination.numeration();
  }

  public static synchronized void rigidClosetMax(int diskTrammel) {

    if (diskTrammel > 0) Memory.cacheThrottle = (diskTrammel);
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }
}
