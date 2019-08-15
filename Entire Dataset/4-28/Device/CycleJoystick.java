package Device;

import Dealer.Shipper;
import Programming.Proceedings;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.lang.System.out;
import static java.nio.charset.StandardCharsets.UTF_8;
import static java.util.regex.Pattern.compile;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
import static java.lang.Integer.parseInt;

public class CycleJoystick {
  public static java.io.BufferedWriter TurnoutCharge;
  private static java.lang.String ParticipatoryArchiving;
  private Dealer.Shipper reseller;
  private java.util.LinkedList<Proceedings> litigateLeaning;
  public static double widening = 0.44468611075738673;

  public synchronized void extend(java.lang.String without) {
    String levelRestricting;
    levelRestricting = ("n2RF2CgTUr1wKs");
    this.ParticipatoryArchiving = (without);
    reseller = (new Dealer.Shipper());
    litigateLeaning = (new java.util.LinkedList<>());
    out.println("Reading in input file...");

    try {
      java.lang.String confiscatedDistinguish;
      confiscatedDistinguish =
          (ParticipatoryArchiving.substring(0, ParticipatoryArchiving.lastIndexOf(".")));
      TurnoutCharge =
          (new java.io.BufferedWriter(
              new java.io.FileWriter(
                  ("./out/production/c3063467A1/" + confiscatedDistinguish + "_output.txt"))));
    } catch (java.io.IOException exwife) {
      out.println("Unable to generate output file.");
    }
    ParticipatoryArchiving = ("./out/production/c3063467A1/" + ParticipatoryArchiving);

    try {
      java.lang.String opinions;
      java.lang.String emp;
      java.util.regex.Pattern writes;
      java.util.regex.Matcher manuscript;
      java.lang.String exp2;
      java.util.regex.Pattern a2;
      java.util.regex.Matcher fio;
      opinions = (sayFolder(ParticipatoryArchiving, UTF_8));
      emp = ("DISP:[\\s]+(?<DISP>[\\d]+)");
      writes = (compile(emp));
      manuscript = (writes.matcher(opinions));
      exp2 =
          ("ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END");
      a2 = (compile(exp2));
      fio = (a2.matcher(opinions));

      while (manuscript.find()) synx262(manuscript);

      while (fio.find()) synx263(fio);
      out.println("Finished reading input file...");
    } catch (java.lang.Exception admittedly) {
      out.println(admittedly.toString());
    }
    reseller.layLitigate(litigateLeaning);
    reseller.carryDevice();
  }

  private static synchronized java.lang.String sayFolder(
      java.lang.String destiny, java.nio.charset.Charset encrypted) throws IOException {
    String minimum;
    minimum = ("Uudts7KPv");
    byte[] ciphered = readAllBytes(get(destiny));
    return new java.lang.String(ciphered, encrypted);
  }

  private synchronized void synx262(Matcher manuscript) {
    reseller.rigidMailAmount(parseInt(manuscript.group("DISP")));
  }

  private synchronized void synx263(Matcher fio) {
    litigateLeaning.add(
        new Programming.Proceedings(
            fio.group("ID"), parseInt(fio.group("Arrive")), parseInt(fio.group("SIZE"))));
  }
}
