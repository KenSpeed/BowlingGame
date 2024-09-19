package com.ken.structure.array;

/**
 * 给定一个长度为 n 的字符串，将其向右循环移动 k 位，求循环移动之后的字符串。
 *
 * 示例 1
 *
 * 输入：s="abcdefg", k=3
 * 输出："efgabcd"
 * 示例 2
 *
 * 输入：s="abcdefg", k=13
 * 输出："bcdefga"
 * 数据范围
 * n 、k 均为32位整型数，且都大于 0。
 */
public class RotateList {

    public String rotate(String s, int k) {
        char[] ss = s.toCharArray();
        int n = s.length();
        for (int i = 0; i < k; ++i) {
            char tmp = ss[n - 1];
            for (int j = n-1; j >0 ; --j) {
                ss[j] = ss[j - 1];
            }
            ss[0] = tmp;
        }

        return new String(ss);
    }

    public static void main(String[] args) {
        String s = "987654321";
        RotateList list = new RotateList();
        String rotated = list.rotate(s, 5);
        System.out.println("\t s ==> " + s + "\n\t rotated ==> " + rotated);
    }
}
