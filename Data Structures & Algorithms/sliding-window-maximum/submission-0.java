class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int[] result = new int[nums.length - k + 1];
        Deque<Integer> deque = new ArrayDeque<>(); // stores indices
        int l = 0, resIdx = 0;

        for (int r = 0; r < nums.length; r++) {

            // remove from BACK — smaller elements are useless
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[r])
                deque.pollLast();

            deque.addLast(r); // add current index to back

            // remove from FRONT — if it's outside window
            if (deque.peekFirst() < l)
                deque.pollFirst();

            // window is full — record max (always at front)
            if (r - l + 1 == k) {
                result[resIdx++] = nums[deque.peekFirst()];
                l++;
            }
        }
        return result;
    }
}
