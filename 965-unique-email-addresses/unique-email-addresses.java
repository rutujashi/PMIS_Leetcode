import java.util.HashSet;

class Solution {
    public int numUniqueEmails(String[] emails) {

        HashSet<String> set = new HashSet<>();

        for (String email : emails) {
            String[] parts = email.split("@");

            String local = parts[0];
            String domain = parts[1];

            local = local.split("\\+")[0];
            local = local.replace(".", "");

            String newEmail = local + "@" + domain;

            set.add(newEmail);
        }

        return set.size();
    }
}