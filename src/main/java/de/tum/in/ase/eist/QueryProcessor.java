package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "Kilian";
        } else if(query.contains("largest")) { // TODO extend the programm here
            List<String> temp = splitter(query) ;

            List<String> fin = new ArrayList<>();

            for(String s : temp) {
                s = s.replaceAll("\\s+","");
                fin.add(s);
                System.out.println(s);
            }

            List<Integer> intList = new ArrayList<>();

            for(String s : temp) {
                s = s.replaceAll("\\s+","");
                intList.add(Integer.parseInt(s));
            }

            Integer highestNumber = Collections.max(intList);


            return highestNumber.toString();
        } else {
            return "HI";
        }
    }

    public List<String> splitter(String string) {
        String s = string.substring(57);
        return Arrays.asList(s.split(","));
    }



}
