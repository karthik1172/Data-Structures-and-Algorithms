// "static void main" must be defined in a public class.
import java.util.*;
public class Main {
    public static class NewsPaper {
        //double [] week = new double[7];
        double total = 0.0;
        String name;
        NewsPaper(double[] price, String name) {
            this.name = name;
            for(int i=0; i<price.length; i++) {
                //week[i] = price[i];
                total += price[i];
            }
        }
    }

    static void solve(double ip, NewsPaper[] arr, int it, ArrayList<String> ans) {
        //ArrayList<String> ans = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            // 1
            if(i == it) continue;
            else if(ip >= arr[i].total) {
                ip = ip - arr[i].total;
                ans.add(arr[i].name);
            }
        }
        //return ans;
    }

    public static void main(String[] args) {

        //input
        Scanner scn = new Scanner(System.in);

        String str = "ABC";

        //1st
        char[] ch = str.toCharArray();
        ch[0] = 'Z';
        //2sn
        StringBuilder sb = new StringBuilder();
        sb.append("ABC");
        sb.setCharAt(0, 'Z');
        System.out.println(sb);//ZBC




        double[] one = {3,3,3,3,3,5,6};//toi
        double[] two = {2.5,2.5,2.5,2.5,2.5,4,4};//hidnu
        double[] three = {4,4,4,4,4,4,10};//et
        double[] four = {1.5,1.5,1.5,1.5,1.5,1.5,1.5};//bm
        double[] five = {2,2,2,2,2,4,4};//ht

        NewsPaper toi = new NewsPaper(one, "toi");//26
        NewsPaper hindu = new NewsPaper(two, "hindu");//20.5
        NewsPaper et = new NewsPaper(three, "et");//24
        NewsPaper bm = new NewsPaper(four, "bm");
        NewsPaper ht = new NewsPaper(five, "ht");

        //Array
        NewsPaper arr[] = {toi, hindu, et, bm, ht};


        double input = scn.nextInt();

        ArrayList<ArrayList<String>> res = new ArrayList<>();

        for(int i=0; i<arr.length; i++) {
            double val = input - arr[i].total;
            ArrayList<String> ans = new ArrayList<>();
            ans.add(arr[i].name);
            solve(val, arr, i, ans);
            // 2
            if(ans.size() > 0)
                res.add(ans);
        }
        System.out.println(res);
    }
}