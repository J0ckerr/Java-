package com.jockerr.snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel implements KeyListener {
    int lenth;//蛇的长度
    int[] snakeX = new int[600];//蛇坐标X
    int[] snakeY = new int[500];//蛇坐标Y
    String fx;//R右 L左 U上 D下
    boolean isStart = false;//游戏是否开始
    //构造器
    public GamePanel(){
        init();
    }
    //初始化
    public void init(){
        lenth = 3;
        snakeX[0] = 100;snakeY[0] = 100;//头部坐标
        snakeX[1] = 75;snakeY[1] = 100;//第一个身体坐标
        snakeX[2] = 50;snakeY[2] = 100;//第二个身体坐标
        fx = "R";
    }
    //面板：画界面画蛇
    //Graphics：画笔
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);//清屏
        this.setBackground(Color.WHITE);//设置背景颜色
        Date.header.paintIcon(this, g, 25, 11);//绘制头部广告栏
        g.fillRect(25, 75, 850, 600);//绘制游戏

        //画一条静态蛇
        if (fx.equals("R")) {
            Date.right.paintIcon(this, g, snakeX[0], snakeY[0]);
        } else if (fx.equals("L")) {
            Date.left.paintIcon(this, g, snakeX[0], snakeY[0]);
        } else if (fx.equals("U")) {
            Date.up.paintIcon(this, g, snakeX[0], snakeY[0]);
        } else if (fx.equals("D")) {
            Date.down.paintIcon(this, g, snakeX[0], snakeY[0]);
        }


        for (int i = 1; i < lenth; i++) {
            Date.body.paintIcon(this, g, snakeX[i], snakeY[i]);//蛇的身体长度通过lenth控制
        }

        //游戏提示：是否开始
        if (isStart == false) {
            //画一个文字，String
            g.setColor(Color.WHITE);//设置画笔颜色
            g.setFont(new Font("微软雅黑", Font.BOLD, 40));//设置字体
            g.drawString("按下空格开始游戏", 300, 300);
        }


        @Override//键盘按下，未释放 只需要用这个
        public void keyPressed (KeyEvent e){

        }
        @Override//键盘按下，弹起
        public void keyTyped (KeyEvent e){
        }
        @Override//释放某个键
        public void keyReleased (KeyEvent e){
        }

    }
    //接收键盘输入：监听

}
