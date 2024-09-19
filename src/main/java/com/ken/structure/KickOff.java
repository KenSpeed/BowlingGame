package com.ken.structure;

public class KickOff {

    /**
     * Returns the first number greater than n and equal to 2 to the power of k
     * 返回第一个比n大，且为2的k次方的数
     *
     * @param n param
     * @return the first number of result
     */
    private int function(int n) {
        int result = 1;
        while (result <= n)
            result = result * 2;
        return result;
    }

    public static void main(String[] args) {
        KickOff kickOff = new KickOff();
        int result = kickOff.function(4);
        System.out.println("the first number greater than 4 and equal to 2 to the power of k: " + result);
    }
}
