package weivretni.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an array of strings, return all groups of strings that are anagrams.
 * 
 * Note: All inputs will be in lower-case.
 * 
 * For example, ["tea","and","ace","ad","eat","dan"] => ["and", "dan", "tea", "eat"]
 * 
 * <p/>
 * Solution:
 * 
 * http://n00tc0d3r.blogspot.com/2013/01/find-anagrams.html
 * 
 * use a hash key algorithm: 
 * 
 * E.g. "and" => "a1d1n1", "array" => "a2r2y1"
 * 
 * @author gzhang
 * 
 */
public class Q049_Anagrams {

    public List<String> anagrams(String[] strs) {
        List<String> result = new ArrayList<String>();
        Map<String, List<String>> occuranceMap = new HashMap<String, List<String>>();

        for (String str : strs) {
            String key = hashKey(str);
            if (occuranceMap.containsKey(key)) {
                List<String> occurances = occuranceMap.get(key);
                occurances.add(str);
            } else {
                List<String> occurances = new ArrayList<String>();
                occurances.add(str);
                occuranceMap.put(key, occurances);
            }
        }

        for (Map.Entry<String, List<String>> entry : occuranceMap.entrySet()) {
            List<String> values = entry.getValue();
            if (values.size() > 1) {
                result.addAll(values);
            }
        }
        
        
        return result;
    }

    /**
     * Generate the hashKey for a string
     * 
     * @param str
     * @return
     */
    private String hashKey(String str) {
        int[] locations = new int[26];

        // init locations array
        for (int i = 0; i < locations.length; i++) {
            locations[i] = 0;
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int locationOfc = (int) c - (int) 'a';
            locations[locationOfc]++;
        }

        // Now generate the compact key
        String key = "";
        for (int i = 0; i < locations.length; i++) {
            if (locations[i] > 0) {
                key = key + (char) (i + (int) 'a') + "" + locations[i];
            }
        }

        return key;
    }
}
