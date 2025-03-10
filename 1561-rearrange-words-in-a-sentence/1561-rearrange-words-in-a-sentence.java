class Solution {
    public String arrangeWords(String text) {
        text=text.toLowerCase();
        String[] words = text.split(" ");
        List<String> sorted = new ArrayList<>();
        for (String word : words) {
            Stack<String> stack = new Stack<>();

            while (!sorted.isEmpty() && sorted.get(sorted.size() - 1).length() > word.length()) {
                stack.push(sorted.remove(sorted.size() - 1));
            }

               sorted.add(word);

            while (!stack.isEmpty()) {
                sorted.add(stack.pop());
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sorted.size(); i++) {
            sb.append(sorted.get(i));
            if (i != sorted.size() - 1) {
                sb.append(" ");
            }
        }

        // Step 6: Capitalize first letter
        String result = sb.toString();
        return result.substring(0, 1).toUpperCase() + result.substring(1);
    }
}
