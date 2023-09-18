
//User function Template for Java

class GFG
{
    ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here
        ArrayList<Long> fl = new ArrayList<>();
        long f=-1,l=-1;
        for(int i=0; i<n; i++){
            if(arr[i]==x){
              if(l==-1)
              f=i;
              l=i;
            }
        }
        fl.add(f);
        fl.add(l);
        return fl;
    }
}

