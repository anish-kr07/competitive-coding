package LeetCode;

import com.sun.jdi.event.StepEvent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubdomainVisitCount811 {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        List<String> list = new ArrayList<>();
        for (String st : cpdomains) {
            String domains[] = st.split(" ");
            int count = Integer.parseInt(domains[0]);
            int numberOfSubdomains = domains[1].split("\\.").length;
            StringBuilder stringBuilder = new StringBuilder(domains[1]);

            hashMap.put(domains[1], hashMap.getOrDefault(domains[1],0)+ count);

            for (int i = 1; i < numberOfSubdomains; i++) {
                String sub = stringBuilder.substring(stringBuilder.indexOf(".") + 1);
                hashMap.put(sub, (hashMap.get(sub) == null ? 0 : hashMap.get(sub)) + count);
                String st1 = stringBuilder.substring(stringBuilder.indexOf(".") + 1);
                stringBuilder = new StringBuilder(st1);
            }
        }
        for (String st : hashMap.keySet()) {
            list.add(hashMap.get(st) + " " + st);
        }
        return list;
    }
}
