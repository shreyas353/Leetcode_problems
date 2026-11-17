class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        String[] arr1=num1.split("\\+");
        String[] arr2=num2.split("\\+");
        int a=Integer.parseInt(arr1[0]);
        int b=Integer.parseInt(arr1[1].replace("i",""));
        int c=Integer.parseInt(arr2[0]);
        int d=Integer.parseInt(arr2[1].replace("i",""));
        int real=(a*c)-(b*d);
        int imaginary=(a*d)+(b*c);
        return real+"+"+imaginary+"i";
    }
}