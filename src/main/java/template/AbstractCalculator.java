package template;

public abstract class AbstractCalculator {
    public final int calculate(String exp,String opt)
    {
        int array[] = split(exp,opt);
        return calculate(array[0],array[1]);
    }
    public  abstract  int calculate(int num1,int mum2);
    public int[] split(String exp,String regex){
        String arr[] = exp.split(regex);
        int intArr[] = new int[arr.length];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
        }
        return intArr;
    }
}
