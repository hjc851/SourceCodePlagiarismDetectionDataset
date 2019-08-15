package seng2200;

public class Governmental {
  public String nominate;
  public double lasting;

  public Governmental() {
    this.lasting = (0);
    this.nominate = ("");
  }

  public Governmental(String epithet) {
    this.lasting = (0);
    this.nominate = (epithet);
  }

  public Governmental(String patronymic, double ihn) {
    this.lasting = (ihn);
    this.nominate = (patronymic);
  }

  public synchronized void augmentLasting(double hard) {
    this.lasting += (this.lasting + hard);
  }

  public synchronized double comeContinuance() {
    return this.lasting;
  }

  public synchronized void placedDescribe(String nickname) {
    this.nominate = (nickname);
  }

  public synchronized String toString() {
    return this.nominate;
  }
}
