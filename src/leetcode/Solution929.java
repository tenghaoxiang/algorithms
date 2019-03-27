package leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution929 {

    public int numUniqueEmails(String[] emails) {
        Set<String> normalized = new HashSet<>();
        String email_local;
        for (String email : emails) {
            String[] split = email.split("@");
            email_local = split[0].split("\\+")[0];
            normalized.add(email_local.replace(".", "") + "@" + split[1]);
        }
        return normalized.size();

    }

}
