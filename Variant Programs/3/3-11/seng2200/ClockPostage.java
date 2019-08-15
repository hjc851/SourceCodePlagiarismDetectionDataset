package seng2200;

public class ClockPostage {
  public double go;
  public double entering;
  public String spurPresentMention;

  public ClockPostage() {
    this.spurPresentMention = ("NoName");
    this.entering = (0);
    this.go = (0);
  }

  public ClockPostage(String pokeRefer, double accessOpportunity, double perishMonth) {
    this.spurPresentMention = (pokeRefer);
    this.entering = (accessOpportunity);
    this.go = (perishMonth);
  }

  public synchronized void fixProductivityTheatricalForename(String describe) {
    this.spurPresentMention = (describe);
  }

  public synchronized String startFarmersPlaceSurname() {
    return this.spurPresentMention;
  }

  public synchronized void placeEntrantWeek(double opportunity) {
    this.entering = (opportunity);
  }

  public synchronized void putDepartureClock(double period) {
    this.go = (period);
  }

  public synchronized double havePeriod() {
    return this.go - this.entering;
  }
}
