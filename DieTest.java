import java.util.*;
public class Die {
    private int faceValue;
    public void roll()
    {              
       Random random=new Random();
       
       this.faceValue=Math.abs(random.nextInt()) %6+1;//ȡ1-6���������� 
    }
    public  int getFaceValue()
    {
       return this.faceValue;
    }
}
����һ�������ӵ���Ϸ�ࣺ
public class DieGame {
   public Die die1=new Die();
   public Die die2=new Die();
   public boolean play()   //������,������������ӵ�7Ϊtrue, ����Ϊ��                            
   {
      boolean flag=false;
      die1.roll();
      die2.roll();
System.out.println(die1.getFaceValue());
      System.out.println(die2.getFaceValue());//����������õ�������
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

����һ�������ࣺ
public class DieTest {
   public static void main(String[] args) {
      DieGame dg=new DieGame();
      System.out.println("�������������Ϊ7����Ӯ����֮������");
      //System.out.println("��Ϣ����171 ������");
      if(dg.play())
      {
         System.out.println("��Ӯ��!");
      }
      else
      {
         System.out.println("������,���´�Ŭ��!");
      }
   }
}
