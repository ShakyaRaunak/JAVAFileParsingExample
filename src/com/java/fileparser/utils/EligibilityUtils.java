package com.java.fileparser.utils;

import com.java.fileparser.Eligibility;
import com.java.fileparser.Member;

import java.util.ArrayList;

/**
 * Created by raunakshakya on 6/17/15.
 */
public class EligibilityUtils {

    public static Eligibility findEligibilityForMember(Member member, ArrayList<Eligibility> eligibilities) {
        for (Eligibility eligibility : eligibilities) {
            if (eligibility.getId().equals(member.getId())) {
                return eligibility;
            }
        }
        return null;
    }
}
