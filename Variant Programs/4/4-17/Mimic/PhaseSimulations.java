package Mimic;

import Caller.Distributor;
import Organizer.Appendage;
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

public class PhaseSimulations {
  private static final String synX928String = "SIZE";
  private static final String synX927String = "Arrive";
  private static final String synX926String = "ID";
  private static final String synX925String = "DISP";
  private static final String synX924String = "Finished reading input file...";
  private static final String synX923String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX922String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX921String = "./out/production/c3063467A1/";
  private static final String synX920String = "Unable to generate output file.";
  private static final String synX919String = "_output.txt";
  private static final String synX918String = "./out/production/c3063467A1/";
  private static final String synX917String = ".";
  private static final int synX916int = 0;
  private static final String synX915String = "Reading in input file...";
  public static java.io.BufferedWriter AmperageSubmitting;
  private static java.lang.String StimulusRegister;
  private Caller.Distributor retailer;
  private java.util.LinkedList<Appendage> outgrowthBlacklist;

  public synchronized void extend(java.lang.String entries) {
    this.StimulusRegister = entries;
    retailer = new Caller.Distributor();
    outgrowthBlacklist = new java.util.LinkedList<>();
    out.println(synX915String);

    try {
      java.lang.String confiscatedDistinguish;
      confiscatedDistinguish =
          StimulusRegister.substring(synX916int, StimulusRegister.lastIndexOf(synX917String));
      AmperageSubmitting =
          new java.io.BufferedWriter(
              new java.io.FileWriter(synX918String + confiscatedDistinguish + synX919String));
    } catch (java.io.IOException adoptee) {
      out.println(synX920String);
    }
    StimulusRegister = synX921String + StimulusRegister;

    try {
      java.lang.String opinion;
      java.lang.String bens;
      java.util.regex.Pattern postscript;
      java.util.regex.Matcher dos;
      java.lang.String exp2;
      java.util.regex.Pattern a;
      java.util.regex.Matcher d;
      opinion = sayFolder(StimulusRegister, UTF_8);
      bens = synX922String;
      postscript = compile(bens);
      dos = postscript.matcher(opinion);
      exp2 = synX923String;
      a = compile(exp2);
      d = a.matcher(opinion);

      while (dos.find()) synx118(dos);

      while (d.find()) synx119(d);
      out.println(synX924String);
    } catch (java.lang.Exception past) {
      out.println(past.toString());
    }
    retailer.bentTechnologies(outgrowthBlacklist);
    retailer.extendDealer();
  }

  private static synchronized java.lang.String sayFolder(
      java.lang.String roadway, java.nio.charset.Charset codec) throws IOException {
    byte[] interleaves = readAllBytes(get(roadway));
    return new java.lang.String(interleaves, codec);
  }

  private synchronized void synx118(Matcher dos) {
    retailer.placedMurderWhen(parseInt(dos.group(synX925String)));
  }

  private synchronized void synx119(Matcher d) {
    outgrowthBlacklist.add(
        new Organizer.Appendage(
            d.group(synX926String),
            parseInt(d.group(synX927String)),
            parseInt(d.group(synX928String))));
  }
}
