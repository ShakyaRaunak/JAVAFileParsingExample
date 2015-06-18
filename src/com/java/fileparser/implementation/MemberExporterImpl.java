package com.java.fileparser.implementation;

import com.java.fileparser.Member;

import java.io.IOException;
import java.io.Writer;

/**
 * Created by raunakshakya on 6/16/15.
 */
public class MemberExporterImpl {//implements MemberExporter {

    //@Override
    public void exportMember(Member member, Writer writer) { // FileOutputStream fos) {
        try {
            writer.write(member.toString());

            // byte[] buffer = member.toString().getBytes();
            // fos.write(buffer);
        } catch (IOException e) {
            System.out.println(/*"Could not write member " + member.getId() + " to the file!", */e.getMessage());
        }
    }

}
