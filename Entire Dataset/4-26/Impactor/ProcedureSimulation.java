package Impactor;

import Mailer.Sender;
import Database.Methodology;
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
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class ProcedureSimulation {
  private static final double synX1479double = 0.17610599361085455;
  private static final String synX1478String = "Finished reading input file...";
  private static final String synX1477String = "SIZE";
  private static final String synX1476String = "Arrive";
  private static final String synX1475String = "ID";
  private static final String synX1474String = "DISP";
  private static final String synX1473String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX1472String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX1471String = "./out/production/c3063467A1/";
  private static final String synX1470String = "Unable to generate output file.";
  private static final String synX1469String = "_output.txt";
  private static final String synX1468String = "./out/production/c3063467A1/";
  private static final String synX1467String = ".";
  private static final int synX1466int = 0;
  private static final String synX1465String = "Reading in input file...";
  private static final double synX1464double = 0.31068807609978333;
  public static BufferedWriter TurnoutCharge = null;
  private static String AdviceDocumentation = null;
  private Sender distributor = null;
  private LinkedList<Methodology> proceduresCompendium = null;
  static int occasion = -2061005486;

  public synchronized void pass(String establishment) {
    double coin;
    coin = synX1464double;
    this.AdviceDocumentation = establishment;
    distributor = new Sender();
    proceduresCompendium = new LinkedList<>();
    System.out.println(synX1465String);

    try {
      String minimumNominate;
      minimumNominate =
          AdviceDocumentation.substring(
              synX1466int, AdviceDocumentation.lastIndexOf(synX1467String));
      TurnoutCharge =
          new BufferedWriter(new FileWriter(synX1468String + minimumNominate + synX1469String));
    } catch (IOException combatants) {
      System.out.println(synX1470String);
    }
    AdviceDocumentation = synX1471String + AdviceDocumentation;

    try {
      String feedback;
      String cust;
      Pattern postscript;
      Matcher sm;
      String exp2;
      Pattern a2;
      Matcher ap;
      feedback = perusedArchives(AdviceDocumentation, StandardCharsets.UTF_8);
      cust = synX1472String;
      postscript = compile(cust);
      sm = postscript.matcher(feedback);
      exp2 = synX1473String;
      a2 = compile(exp2);
      ap = a2.matcher(feedback);

      while (sm.find()) {
        distributor.settledHitPeriods(parseInt(sm.group(synX1474String)));
      }

      while (ap.find()) {
        proceduresCompendium.add(
            new Methodology(
                ap.group(synX1475String),
                parseInt(ap.group(synX1476String)),
                parseInt(ap.group(synX1477String))));
      }
      System.out.println(synX1478String);
    } catch (Exception adoptee) {
      System.out.println(adoptee.toString());
    }
    distributor.primedAppendage(proceduresCompendium);
    distributor.bleedOriginator();
  }

  private static synchronized String perusedArchives(String pathways, Charset decoding)
      throws IOException {
    double measure;
    measure = synX1479double;
    byte[] entered = readAllBytes(get(pathways));
    return new String(entered, decoding);
  }
}
