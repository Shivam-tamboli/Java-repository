package August;

import java.util.*;

public class UniqueEmailAddress {
    public static Integer soluInteger(String[] emails){
    HashSet <String> uniqueEmails = new HashSet<>();
    for(String email : emails){
        String[] parts = email.split("@");
        String local = parts[0];
        String domain = parts[1];
        if(local.contains("+")){
            local = local.substring(0, local.indexOf("+"));
        }
        local = local.replace("." , "");

        String finalemail = local + "@" + domain;

        uniqueEmails.add(finalemail);

    }

    return uniqueEmails.size();
}



public static void main(String[] args) {
    

    String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
    int result = soluInteger(emails);
    System.out.println(result);

    
}

}