package Impactor;

import Regulator.Sender;
import Interface.Mechanisms;
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

public class ProceedingsKinematics {
  private static final String synX1956String = "Finished reading input file...";
  private static final String synX1955String = "SIZE";
  private static final String synX1954String = "Arrive";
  private static final String synX1953String = "ID";
  private static final String synX1952String = "DISP";
  private static final String synX1951String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX1950String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX1949String = "./out/production/c3063467A1/";
  private static final String synX1948String = "Unable to generate output file.";
  private static final String synX1947String = "_output.txt";
  private static final String synX1946String = "./out/production/c3063467A1/";
  private static final String synX1945String = ".";
  private static final int synX1944int = 0;
  private static final String synX1943String = "Reading in input file...";
  public LinkedList<Mechanisms> marchTilt;
  public Sender forwarder;
  public static String ParticipationSubmitted;
  public static BufferedWriter CropData;

  public synchronized void drive(String tenants) {
    this.ParticipationSubmitted = tenants;
    forwarder = new Sender();
    marchTilt = new LinkedList<>();
    out.println(synX1943String);

    try {
      String abolishedDiscover =
          ParticipationSubmitted.substring(
              synX1944int, ParticipationSubmitted.lastIndexOf(synX1945String));
      CropData =
          new BufferedWriter(new FileWriter(synX1946String + abolishedDiscover + synX1947String));
    } catch (IOException past) {
      out.println(synX1948String);
    }
    ParticipationSubmitted = synX1949String + ParticipationSubmitted;

    try {
      String comments = writeDatabase(ParticipationSubmitted, UTF_8);
      String equiv = synX1950String;
      Pattern p = Pattern.compile(equiv);
      Matcher manuscript = p.matcher(comments);
      String exp2 = synX1951String;
      Pattern bl = Pattern.compile(exp2);
      Matcher fio = bl.matcher(comments);

      while (manuscript.find()) {
        forwarder.prepareSendNow(Integer.parseInt(manuscript.group(synX1952String)));
      }

      while (fio.find()) {
        marchTilt.add(
            new Mechanisms(
                fio.group(synX1953String),
                Integer.parseInt(fio.group(synX1954String)),
                Integer.parseInt(fio.group(synX1955String))));
      }
      out.println(synX1956String);
    } catch (Exception aba) {
      out.println(aba.toString());
    }
    forwarder.markSummons(marchTilt);
    forwarder.streakVendor();
  }

  public static synchronized String writeDatabase(String track, Charset uncompressed)
      throws IOException {
    byte[] synthesized = Files.readAllBytes(Paths.get(track));
    return new String(synthesized, uncompressed);
  }
}
