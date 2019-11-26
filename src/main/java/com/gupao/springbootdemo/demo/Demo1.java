package com.gupao.springbootdemo.demo;

/**
 * @ClassName Demo1
 * @Author SongShuaiDong
 * @Description
 * @Date 2019/11/26 11:23 上午
 * @Version 1.0
 **/
public class Demo1 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int x : numbers) {
            if (x == 30) {
                break;
            }
            System.out.println(x);
        }
    }
}
