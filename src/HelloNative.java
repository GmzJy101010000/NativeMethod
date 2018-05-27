import java.awt.Dimension;

import javax.swing.JFrame;


public class HelloNative {  
    public native void displayHelloWorld();// java native方法申明  
  
    static {  
        System.loadLibrary("HelloNative");// 装入动态链接库，"HelloWorldImpl"是要装入的动态链接库名称。  
    }  
  
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
        HelloNative helloWorld = new HelloNative();  
        helloWorld.displayHelloWorld();  
        //System.out.println(8&9);
       
        int x=7,y=3;
        x<<=3;
        x=x&x+1|x+2^x+3;
        x>>=2;
      // int c=x+(x++)+(++x)+y;
       // System.out.println(c+" "+x);
        boolean a,b,c,d;
        a=b=c=d=true;
        System.out.println(a^false);
        System.out.println(x);
    }  
}   