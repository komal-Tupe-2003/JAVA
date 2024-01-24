// Define a thread called PrintText_Thread for printing text on command prompt for n number of times. Create three threads and run them.  Pass the text and n as parameters to the thread constructor. Example:
      //  i. First thread prints I am in FY 10 times
     //   ii. Second thread prints I am in SY 20 times
     //   iii. Third thread prints I am in TY 30 times
 
class PrintText extends Thread
{
String msg;
int i,no;
public PrintText(String s,String msg,int no)
{
super(s);
this.msg=msg;
this.no=no;
start();
}
    public void run()
    {
    for(i=0;i<no;i++)
        System.out.println(msg);
    }

}

public class thread1
{
public static void main(String[] arg) throws InterruptedException
{
PrintText p=new PrintText("First","I am in FY",10);
p.join();
PrintText p1=new PrintText("Second","I am in SY",20);
p1.join();
PrintText p2=new PrintText("Thrid","I am in TY",30);
p2.join();
}
}








