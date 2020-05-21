package com.jockerr.snake;

import javax.swing.*;

public class StartGames {
    public static void main(String[] args) {
        //1.绘制静态窗口 JFrame
        JFrame frame = new JFrame("Jockerr第一次Java-贪吃蛇");
        //设置界面大小
        frame.setBounds(10,10,900,720);//设置界面大小
        frame.setResizable(false);//不可动
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置关闭
        //2.面板JPanel 可以加入到JFrame
        frame.add(new GamePanel());


        frame.setVisible(true);//窗口显现出来
    }
}
