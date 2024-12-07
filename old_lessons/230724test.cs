



int [] li=new int[1,2,3,4,5,6];
int n=5;

def reverseLi(arr,n)
{
int temp;
int count;

for i in range(0, li.length)
{
    if (li[i]==n)
    {
        count++;
    }
    if (li[i+1]>li[i])
    {
        temp=li[i];
        li[i]=li[i+1];
        li[i+1]=temp;
    }
}

return li;
}






