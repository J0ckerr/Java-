package com.jockerr.snake;

import javax.swing.*;
import java.net.URL;

//存放外部数据
public class Date {
    //头部的图片 URL:定位图片地址 ImageIcon：图片
    public static URL headerURL = Date.class.getResource("/statics/header.png");
    public static ImageIcon header = new ImageIcon(headerURL);
    //body
    public static URL bodyURL = Date.class.getResource("/statics/body.png");
    public static ImageIcon body = new ImageIcon(bodyURL);
    //down
    public static URL downURL = Date.class.getResource("/statics/down.png");
    public static ImageIcon down = new ImageIcon(downURL);
    //food
    public static URL foodURL = Date.class.getResource("/statics/food.png");
    public static ImageIcon food = new ImageIcon(foodURL);
    //left
    public static URL leftURL = Date.class.getResource("/statics/left.png");
    public static ImageIcon left = new ImageIcon(leftURL);
    //rifht
    public static URL rightYRL = Date.class.getResource("/statics/right.png");
    public static ImageIcon right = new ImageIcon(rightYRL);
    //up
    public static URL upURL = Date.class.getResource("/statics/up.png");
    public static ImageIcon up = new ImageIcon(upURL);
}
