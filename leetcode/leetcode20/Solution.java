package leetcode.leetcode20;

/**
 * leetcode 20
 */

public class Solution {
    public boolean isValid(String s) {
        if (s == null || s.length() <= 0) {
            return true;
        }

        char[] checkingArray = new char[s.length()];

        int checking_count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ingredient = s.charAt(i);

            if (ingredient == '(' || ingredient == '[' || ingredient == '{') {
                checkingArray[checking_count++] = ingredient;
                continue;
//                直接就略过后面，开始下一轮 不会执行到后面if
            }

            if (checking_count <= 0) {
                return false;
            }

            if ((ingredient == ')' && checkingArray[checking_count - 1] == '(') ||
                    (ingredient == ']' && checkingArray[checking_count - 1] == '[') ||
                    (ingredient == '}' && checkingArray[checking_count - 1] == '{')){
                --checking_count;
                continue;
            }
            
//            如果还能执行到这一句 则return false
            return false;
        }
//        是则return true, 不符合则return false
        return checking_count == 0;
    }
}
