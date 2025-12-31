package stack;
import java.util.Arrays;
public class MainApp {
	public static void reverseArray(int [] arr,StackADT stack)
	{
		for(int i=0;i<arr.length;++i)
		{
			stack.push(arr[i]);
		}
		
		int i=0;
		while (!stack.isEmpty())
		{
			arr[i]=stack.pop();
			++i;
			
		}
	}
   public static void main(String[] args) {
	   int[] arr= {1,2,3,4,5};
	   StackADT stackobj = new ArrayStack(10);
      System.out.println("before insertion :"+Arrays.toString(arr));
      reverseArray(arr,stackobj);
      System.out.println("stack size:"+arr.length);
      System.out.println("After reversing an array"+Arrays.toString(arr));
   }
}