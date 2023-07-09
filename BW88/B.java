package LeetCode_Contest.BW88;

public class B {
    public static void main(String[] args) {

        LUPrefix lu = new LUPrefix(4);
        lu.upload(3);
        lu.longest();
        lu.upload(1);
        lu.longest();
        lu.upload(2);
        lu.longest();

    }

    static class LUPrefix {
        boolean list[];
        int max = 1;
        public LUPrefix(int n) {
            list = new boolean[n+2];
            list[0] = true;
            max = 1;

        }

        public void upload(int video) {
            // list.add(video, true);
            list[video] = true;
            while(list[max] == true) max++;
        }

        public int longest() {
            return max-1;
        }
    }

/**
 * Your LUPrefix object will be instantiated and called as such:
 * LUPrefix obj = new LUPrefix(n);
 * obj.upload(video);
 * int param_2 = obj.longest();
 */
}
