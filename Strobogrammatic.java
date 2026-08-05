import java.util.*;

public class Strobogrammatic {
    public static boolean isStrobogrammatic(String num) {
        // Mapping of valid strobogrammatic pairs
        Map<Character, Character> map = new HashMap<>();
        map.put('0', '0');
        map.put('1', '1');
        map.put('6', '9');
        map.put('8', '8');
        map.put('9', '6');
        
        int left = 0, right = num.length() - 1;
        
        while (left <= right) {
            char l = num.charAt(left);
            char r = num.charAt(right);
            
            if (!map.containsKey(l) || map.get(l) != r) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(isStrobogrammatic("69"));   // true
        System.out.println(isStrobogrammatic("88"));   // true
        System.out.println(isStrobogrammatic("962"));  // false
        System.out.println(isStrobogrammatic("180"));  // true
    }
}
