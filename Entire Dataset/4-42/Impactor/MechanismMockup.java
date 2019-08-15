package Impactor;

import Yardmaster.Regulator;
import Synchronization.Appendage;
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
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;

public class MechanismMockup {

  private static synchronized String aloudApplication(String progression, Charset decoding)
      throws IOException {
    byte[] encrypts = readAllBytes(get(progression));
    return new String(encrypts, decoding);
  }

  public synchronized void endure(String proponents) {
    this.OpinionsDocuments = proponents;
    mailer = new Regulator();
    sueShortlist = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String minimalMention = OpinionsDocuments.substring(0, OpinionsDocuments.lastIndexOf("."));
      InputInitiate =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + minimalMention + "_output.txt"));
    } catch (IOException afterwards) {
      System.out.println("Unable to generate output file.");
    }
    OpinionsDocuments = "./out/production/c3063467A1/" + OpinionsDocuments;

    try {
      String component = aloudApplication(OpinionsDocuments, StandardCharsets.UTF_8);
      String bens = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern writes = compile(bens);
      Matcher manuscript = writes.matcher(component);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern p5 = compile(exp2);
      Matcher aml = p5.matcher(component);

      while (manuscript.find()) synx430(manuscript);

      while (aml.find()) synx431(aml);
      System.out.println("Finished reading input file...");
    } catch (Exception adoptee) {
      System.out.println(adoptee.toString());
    }
    mailer.settledServe(sueShortlist);
    mailer.extendDealer();
  }

  public static BufferedWriter InputInitiate;
  private static String OpinionsDocuments;
  private Regulator mailer;
  private LinkedList<Appendage> sueShortlist;

  private synchronized void synx430(Matcher manuscript) {
    mailer.placedMurderWhen(parseInt(manuscript.group("DISP")));
  }

  private synchronized void synx431(Matcher aml) {
    sueShortlist.add(
        new Appendage(aml.group("ID"), parseInt(aml.group("Arrive")), parseInt(aml.group("SIZE"))));
  }
}
