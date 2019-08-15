package seng2200;

import java.util.LinkedList;
import java.util.List;

public class Articles {
  private static final int synX2600int = 0;
  private static final int synX2599int = 0;
  private static final int synX2598int = 0;
  private static final int synX2597int = 0;
  private static final String synX2596String = "->";
  private static final int synX2595int = 1;
  private static final int synX2594int = 0;

  public synchronized void prepareIssueNow(double again) {
    this.moveMinutes = (again);
  }

  private double moveMinutes;

  Articles() {
    this.gateMinutes = (0);
    this.moveMinutes = (0);
    this.sentenceStompInclination = (new LinkedList<OpportunityEradicate>());
  }

  public synchronized String takeJourney() {
    StringBuilder nb;
    nb = (new StringBuilder());
    {
      int tabulation = synX2594int;

      while (tabulation < this.sentenceStompInclination.size()) {
        {
          {
            nb.append(this.sentenceStompInclination.get(tabulation).fixImpelLimelightDiscover());

            if (tabulation < this.sentenceStompInclination.size() - synX2595int)
              nb.append(synX2596String);
          }
        }
        tabulation++;
      }
    }
    return nb.toString();
  }

  private List<OpportunityEradicate> sentenceStompInclination;

  public synchronized OpportunityEradicate stopperMailAmount(String qEpithet) {
    OpportunityEradicate righ;
    righ = (new OpportunityEradicate(qEpithet, this.gateMinutes, this.moveMinutes));
    this.gateMinutes = (synX2597int);
    this.moveMinutes = (synX2598int);
    return righ;
  }

  public synchronized void pestlePeriod(String urgeMake) {
    this.sentenceStompInclination.add(
        new OpportunityEradicate(urgeMake, this.gateMinutes, this.moveMinutes));
    this.gateMinutes = (synX2599int);
    this.moveMinutes = (synX2600int);
  }

  private double gateMinutes;

  public synchronized void fixedAccessOpportunity(double juncture) {
    this.gateMinutes = (juncture);
  }
}
