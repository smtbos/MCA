class Main
{
    public static void main(String[] args)
    {
        int n, x;
        boolean flag;
        for(int i=0; i<args.length; i++)
        {
            flag = true;
            n = Integer.parseInt(args[i]);
            if(n==1 || n%2==0){
                flag = false;
            }else{
                x = (n/2);
                for(int j=2; j<x; j+=2)
                {
                    if(n%j == 0)
                    {
                        flag = false;
                        break;
                    }
                }
            }
            if(flag)
                System.out.println(n + " Is Prime Number");
        }
    }
}