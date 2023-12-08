//Nick Zambri
// 11/06/22
package cop2805;
class recursive extends Thread {
public static int fibonacci(int n){
if(n == 0) return 0;
if(n == 1) return 1;
return fibonacci(n-1) + fibonacci(n-2);
}
@Override
public void run()
{
long k=System.currentTimeMillis();
int p=fibonacci(40);
k=System.currentTimeMillis()-k;
System.out.println("Using recursive:\n Output is " +p+" \n time taken is "+k+"\n");
}
}