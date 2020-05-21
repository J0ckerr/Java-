import java.util.*;
public class Die {
    private int faceValue;
    public void roll()
    {              
       Random random=new Random();
       
       this.faceValue=Math.abs(random.nextInt()) %6+1;//取1-6间任意整数 
    }
    public  int getFaceValue()
    {
       return this.faceValue;
    }
}
定义一个掷骰子的游戏类：
public class DieGame {
   public Die die1=new Die();
   public Die die2=new Die();
   public boolean play()   //掷骰子,两粒骰子数相加得7为true, 否则为假                            
   {
      boolean flag=false;
      die1.roll();
      die2.roll();
System.out.println(die1.getFaceValue());
      System.out.println(die2.getFaceValue());//输出本次掷得的骰子数
      int num=die1.getFaceValue()+die2.getFaceValue();
      if(num==7)
      {
         flag=true;
      }
      else
      {
         flag=false;   
      }
      return flag;
   }
}

定义一个测试类：
public class DieTest {
   public static void main(String[] args) {
      DieGame dg=new DieGame();
      System.out.println("若掷出的两点和为7，则赢，反之，则输");
      //System.out.println("信息工程171 张智棚");
      if(dg.play())
      {
         System.out.println("您赢了!");
      }
      else
      {
         System.out.println("您输了,请下次努力!");
      }
   }
}
