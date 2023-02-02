class First
{
   public static void main(String []args)
  {
         int []arr={30,20,10,50};
        //bubble sort
       /* for(int i=0;i<4;i++)
        {
              for(int j=1;j<4;j++)
             {
                  if(arr[j-1]>arr[j])
                  {
                          int temp=arr[j-1];
                         arr[j-1]=arr[j];
                         arr[j]=temp;
                 }
             }
        }*/
      //insertion sort
    /* int key;
      for(int i=1;i<4;i++)
     {
          key=arr[i];
          int j=i-1;
         while(j>=0 && arr[j]>key)
         {
               arr[j+1]=arr[j];
               j=j-1;
          }
       arr[j+1]=key;
     }*/
   //Selection code
  for(int i=0;i<4;i++)
  {
       int index=i;
       for(int j=i+1;j<4;j++)
       {
                if(arr[j]<arr[index])
                      index=j;
       }
      int temp=arr[index];
      arr[index]=arr[i];
     arr[i]=temp;
  }
    
      for(int i=0;i<4;i++)
           System.out.println(arr[i]);
      
   }
}