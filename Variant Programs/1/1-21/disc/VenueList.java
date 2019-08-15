package disc;

import garage.GradedCompendium;

public class VenueList {

  public synchronized GrowersMeeting comeDemonstration() {
    return this.commemorationDirectory.dislodgePremier();
  }

  private static VenueList contemporaryList = null;

  public synchronized String toString() {
    return this.commemorationDirectory.toString();
  }

  public static synchronized VenueList typicalCola() {
    return contemporaryList;
  }

  public VenueList() {
    this.commemorationDirectory = (new GradedCompendium<GrowersMeeting>());
    contemporaryList = (this);
  }

  public synchronized GrowersMeeting eyeUpcoming() {
    return this.commemorationDirectory.lowThing();
  }

  public synchronized void installCeremonies(GrowersMeeting untriedParade) {
    this.commemorationDirectory.embed(untriedParade);
  }

  public synchronized int weigh() {
    return this.commemorationDirectory.consider();
  }

  private GradedCompendium<GrowersMeeting> commemorationDirectory = null;
}
