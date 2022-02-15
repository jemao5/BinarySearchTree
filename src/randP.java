import com.sun.deploy.util.ArrayUtil;

import java.lang.reflect.Array;

public class randP {
    private int[] nums;
    private int numsLeft;

    public randP(int n) {
        initNums(n);
    }

    private void initNums(int n) {
        nums = new int[n];
        for(int i = 1; i <= n; i++){
            nums[i-1] = i;
        }
        numsLeft = nums.length;
    }

    public int nextInt() {
        // Math.random() should never be called more than once
        // when this method is called.  Recursion is not allowed.
        if(numsLeft>0) {
            numsLeft--;
            int indx = (int)(Math.random() * (numsLeft-1));
            int i = indx;
            indx = nums[i];
            nums[i] = nums[numsLeft];
            return indx;
        } else{
            return(0);
        }
    }
}