import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<String> letterCombinations(String digits) {
        List list = new ArrayList();
        char[] chars = digits.toCharArray();
        for (char c : chars) {
            String[] str = getLetters(c);

        }
        return list;
    }

    private String[] getLetters(char c) {
        Map<Character, String[]> map = new HashMap<Character, String[]>();
        map.put('2', new String[]{"a", "b", "c"});
        map.put('3', new String[]{"d", "e", "f"});
        map.put('4', new String[]{"g", "h", "i"});
        map.put('5', new String[]{"j", "k", "l"});
        map.put('6', new String[]{"m", "n", "o"});
        map.put('7', new String[]{"p", "q", "r", "s"});
        map.put('8', new String[]{"t", "u", "v"});
        map.put('9', new String[]{"w", "x", "y", "z"});
        return map.get(c);
    }

    public static void main(String[] args) {
        String str = "123";
        char[] chars = str.toCharArray();
        for (char c : chars) {
            System.out.println(c);
        }
    }
}
