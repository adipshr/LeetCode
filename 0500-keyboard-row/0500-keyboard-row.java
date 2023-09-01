class Solution {
    public String[] findWords(String[] words) {
        List<String> result = new ArrayList<>();
        Set<Character> row1 = new HashSet<>(Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'));
        Set<Character> row2 = new HashSet<>(Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'));
        Set<Character> row3 = new HashSet<>(Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm'));

        for (String word : words) {
            int row = 0;
            boolean valid = true;
            
            for (char ch : word.toLowerCase().toCharArray()) {
                if (row == 0) {
                    if (row1.contains(ch)) {
                        row = 1;
                    } else if (row2.contains(ch)) {
                        row = 2;
                    } else if (row3.contains(ch)) {
                        row = 3;
                    }
                } else if ((row == 1 && !row1.contains(ch)) ||
                           (row == 2 && !row2.contains(ch)) ||
                           (row == 3 && !row3.contains(ch))) {
                    valid = false;
                    break;
                }
            }
            
            if (valid) {
                result.add(word);
            }
        }

        return result.toArray(new String[result.size()]);
    }
}