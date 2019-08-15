package seng2200;

public class Foreign {

  public synchronized double arriveLasting() {
    return this.lasting;
  }

  public synchronized String toString() {
    return this.mention;
  }

  public synchronized void arrangeKey(String diagnose) {
    this.mention = diagnose;
  }

  public Foreign() {
    this.lasting = 0;
    this.mention = "";
  }

  public Foreign(String gens) {
    this.lasting = 0;
    this.mention = gens;
  }

  public Foreign(String refer, double vil) {
    this.lasting = vil;
    this.mention = refer;
  }

  public double lasting = 0.0;
  public String mention = null;

  public synchronized void enhanceTime(double tough) {
    this.lasting += tough;
  }
}
