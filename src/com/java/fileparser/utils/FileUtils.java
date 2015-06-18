package com.java.fileparser.utils;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created by raunakshakya on 6/17/15.
 */
public class FileUtils {

    public final static File MEMBERS_FILE = new File("./src/members.dat");
    public final static File ELIGIBILITIES_FILE = new File("./src/eligibility.dat");
    public final static File OUTPUT_FILE = new File("./src/output.csv");

    public static void checkIfFileExists(File file) throws FileNotFoundException {
        if (!file.exists())
            throw new FileNotFoundException("File " + file.getName() + " not found!");
        System.out.println("File " + file.getName() + " found");
    }

}
