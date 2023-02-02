class First
{
   public static void main(String []args)
  {
         int []arr={30,20,10,50};
        for(int i=0;i<4;i++)
        {
              for(int j=0;j<4;j++)
             {
                  if(arr[j]>arr[j+1])
                  {
                          int temp=arr[j];
                         arr[j]=arr[j+1];
                         arr[j+1]=temp;
                 }
             }
        }
   }
}