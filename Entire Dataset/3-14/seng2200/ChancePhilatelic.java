package seng2200;

public class ChancePhilatelic {
  public double going;
  public double entered;
  public String impelLimelightDiscover;

  public ChancePhilatelic() {
    this.impelLimelightDiscover = "NoName";
    this.entered = 0;
    this.going = 0;
  }

  public ChancePhilatelic(String goadList, double enteringClock, double leaveClip) {
    this.impelLimelightDiscover = goadList;
    this.entered = enteringClock;
    this.going = leaveClip;
  }

  public synchronized void layGoadingLegNominate(String refer) {
    this.impelLimelightDiscover = refer;
  }

  public synchronized String canNeedleInstarKey() {
    return this.impelLimelightDiscover;
  }

  public synchronized void doRegisterAgain(double years) {
    this.entered = years;
  }

  public synchronized void determineWithdrawBeginning(double amount) {
    this.going = amount;
  }

  public synchronized double canExtent() {
    return this.going - this.entered;
  }
}
