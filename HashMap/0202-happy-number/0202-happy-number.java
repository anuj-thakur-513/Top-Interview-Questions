class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = getNext(n);
        while(fast != 1 && slow != fast) {
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }

        return fast == 1;
    }

    private int getNext(int n) {
        int total = 0;
        while(n != 0) {
            int temp = n % 10;
            n /= 10;
            total += temp * temp;
        }

        return total;
    }
}