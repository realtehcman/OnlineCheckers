package com.practice;

/*SCENARIOS
 * 1. Survived all
 * 2. No survivors
 * 3. Survived few
 *
 * diff scenarios -> diff replacement
 *
 * USING GROUPS to bind with the switch case
 * */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlphabetNuclearWar {
    
    public static String alphabetWar(String battlefield){
        if(battlefield.matches(".*\\d.*"))
            throw new IllegalArgumentException("Only characters allowed");
        
        
        //SCENARIOS:
        //1
        String survivedAll = "(?!#)(\\w+)(?!#)";
        
        //2
        String dieAllNoShelter = "(?![\\w*])(#+)(?![\\w*])";
        
        //3
        @SuppressWarnings("RegExpRedundantEscape") String oneStrike = "([a-z]*[#]|[#][a-z]*)(\\[\\w*\\])";
        
        //4
        //String nukeHitsAtTheStart = "(([#]|[a-z])+)(\\[\\w*\\])";
        //String nukeHitsAtTheStart = "^(?=((#+)|(\\w+)))";
        //String nukeHitsAtTheStart = "^(((#*)(\\w*)|(\\w*)(#*))(\\[\\w*\\])((#*)(\\w*)|(\\w*)(#*)))";
        String nukeHitsAtTheStart = "((#+)(\\w+)|(\\w+)(#+))(\\[\\w*\\])(.*)";
        
        //5
        String nukeHitsInTheMiddle = "((#*)(\\w*)|(\\w*)(#*)|((\\w*)|(#*)))(\\[\\w*\\])((#*)(\\w*)|(\\w*)(#*)|((\\w*)|(#*)))(\\[\\w*\\])";
        
        
        if(battlefield.matches(survivedAll)){
            return battlefield;
        }
        else if(battlefield.matches(dieAllNoShelter)){
            return battlefield.replaceAll(dieAllNoShelter, "");
        }
        else if(battlefield.matches(oneStrike)){
            Pattern pattern1 = Pattern.compile(oneStrike);
            Matcher matcher1 = pattern1.matcher(battlefield);
            if(matcher1.find()) return matcher1.group(2).replaceAll("[\\[\\]]", "");
        }
        else if(battlefield.matches(nukeHitsAtTheStart)){ //boom###[a]
            //StringBuilder stringBuilder = new StringBuilder(battlefield);
            Pattern pattern = Pattern.compile(nukeHitsAtTheStart);
            Matcher matcher = pattern.matcher(battlefield);
            while(matcher.find()){
                int amountOfNukes = 0;
                for(int i = matcher.start(); i < matcher.end(); i++){
                    if(battlefield.charAt(i) == '#'){
                        amountOfNukes++;
                    }
                }
                switch(amountOfNukes){
                    case 0:
                        break;
                    case 1:
                        battlefield = matcher.group(1).replaceAll(".*", "");
                        battlefield = matcher.group(6).replaceAll("[\\[\\]]", "");
                        String battlefield2 = matcher.group(7).replaceAll("[\\[\\]]", "");
                        battlefield += battlefield2;
                        break;
                    default:
                        battlefield = matcher.group(0).replaceAll(".*", "");
                }
            }
        }
        
        else if(battlefield.matches(nukeHitsInTheMiddle)){
            Pattern pattern = Pattern.compile(nukeHitsAtTheStart);
            Matcher matcher = pattern.matcher(battlefield);
            while(matcher.find()){
                int amountOfNukes = 0;
                for(int i = matcher.start(); i < matcher.end(); i++){
                    if(battlefield.charAt(i) == '#'){
                        amountOfNukes++;
                    }
                }
                switch(amountOfNukes){
                    case 0:
                        break;
                    case 1:
                        battlefield = matcher.group(1).replaceAll(".*", "");
                        battlefield = matcher.group(6).replaceAll("[\\[\\]]", "");
                        String battlefield2 = matcher.group(7).replaceAll("[\\[\\]]", "");
                        battlefield += battlefield2;
                        break;
                    default:
                        battlefield = matcher.group(0).replaceAll(".*", "");
                }
            }
        }
        return battlefield;
    }
    
}
