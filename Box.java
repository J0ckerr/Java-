import java.util.Scanner;
	public class Box{
		int length ;
		int width ;
		int height ;
	public  void setBox(int l,int w,int h){
		 length = l;
		 width =  w;
		 height = h;
	}
	public  int volume(){
	  return length * width * height;
	}
	public static void main(String[] args) {
		Box b = new Box();
		Scanner input = new Scanner(System.in);
		System.out.print("�����볤��ߣ�");
		int l = input.nextInt();
		int w = input.nextInt();
		int h =input.nextInt();
		b.setBox(l, w, h);
		System.out.println("����������Ϊ��" + b.volume());
       System.out.println("��Ϣ����171 ������");
		input.close();
		
	}
}
