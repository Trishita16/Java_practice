class Main3
{
	public static void main(String[] args) 
    {
	    int i,flag=0,e = 5;
        int [] a = {1,2,3,4,5};
        for (i=0;i<5;i++)
        {
          if(a[i]==e)
          {
              flag=1;
              break;
          }
        }
    if(flag==1)
        System.out.println("Element found in "+(i+1));
    else
        System.out.println("Not found");
    
   }
}