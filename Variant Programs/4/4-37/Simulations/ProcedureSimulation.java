package Simulations;

import Yardmaster.Distributor;
import Parser.Proceedings;
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

public class ProcedureSimulation {

  public static synchronized java.lang.String learnRegister(
      java.lang.String step, java.nio.charset.Charset codifying) throws IOException {
    double surname;
    surname = (0.5598382575775208);
    byte[] decrypt = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(step));
    return new java.lang.String(decrypt, codifying);
  }

  public java.util.LinkedList<Proceedings> negotiationsListings;
  public static java.lang.String StimulusRegister;
  public static java.io.BufferedWriter InputInitiate;

  public synchronized void drive(java.lang.String nsi) {
    int bottomConfine;
    bottomConfine = (1977594363);
    this.StimulusRegister = (nsi);
    resellers = (new Yardmaster.Distributor());
    negotiationsListings = (new java.util.LinkedList<>());
    out.println("Reading in input file...");

    try {
      java.lang.String undoneForename;
      undoneForename = (StimulusRegister.substring(0, StimulusRegister.lastIndexOf(".")));
      InputInitiate =
          (new java.io.BufferedWriter(
              new java.io.FileWriter(
                  ("./out/production/c3063467A1/" + undoneForename + "_output.txt"))));
    } catch (java.io.IOException abdul) {
      out.println("Unable to generate output file.");
    }
    StimulusRegister = ("./out/production/c3063467A1/" + StimulusRegister);

    try {
      java.lang.String comments;
      java.lang.String pkg;
      java.util.regex.Pattern writes;
      java.util.regex.Matcher dos;
      java.lang.String exp2;
      java.util.regex.Pattern a;
      java.util.regex.Matcher ff;
      comments = (learnRegister(StimulusRegister, UTF_8));
      pkg = ("DISP:[\\s]+(?<DISP>[\\d]+)");
      writes = (java.util.regex.Pattern.compile(pkg));
      dos = (writes.matcher(comments));
      exp2 =
          ("ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END");
      a = (java.util.regex.Pattern.compile(exp2));
      ff = (a.matcher(comments));

      while (dos.find()) {
        resellers.doForwardingAgain(java.lang.Integer.parseInt(dos.group("DISP")));
      }

      while (ff.find()) {
        negotiationsListings.add(
            new Parser.Proceedings(
                ff.group("ID"),
                java.lang.Integer.parseInt(ff.group("Arrive")),
                java.lang.Integer.parseInt(ff.group("SIZE"))));
      }
      out.println("Finished reading input file...");
    } catch (java.lang.Exception former) {
      out.println(former.toString());
    }
    resellers.dictatedWork(negotiationsListings);
    resellers.outpouringPlenum();
  }

  public static double list = 0.13153848626584042;
  public Yardmaster.Distributor resellers;
}
