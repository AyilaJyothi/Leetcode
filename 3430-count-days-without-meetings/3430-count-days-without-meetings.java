class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        int totalMeetingDays = 0;
        int start = meetings[0][0];
        int end = meetings[0][1];

        for (int i = 1; i < meetings.length; i++) {
            int currStart = meetings[i][0];
            int currEnd = meetings[i][1];

            if (currStart <= end) {
                end = Math.max(end, currEnd); // merge overlapping
            } else {
                totalMeetingDays += (end - start + 1);
                start = currStart;
                end = currEnd;
            }
        }

        totalMeetingDays += (end - start + 1); // add last interval
        return days - totalMeetingDays;
    }
}