import java.util.Stack;
class Main
{
    public static void main(String[] args)
    {
        int n;
        Stack<Integer> obj = new Stack<>();
        for(int i=0; i<args.length; i++)
        {
            n = Integer.parseInt(args[i]);
            obj.push(n);
            System.out.println(n + " Added to Stack");
        }
        for(int i=0; i<args.length; i++)
        {
            n = obj.pop();
            System.out.println(n + " Removed From Stack");
        }
    }
}