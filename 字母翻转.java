package String类;

import java.util.Scanner;

/**
 * @author 孙志强
 * @create 2022/3/21 15:36
 *
 * 1.编写一个方法，将一段文本中的各个单词的字母顺序翻转，
 * 例如："I like writing code best"，将变成"I ekil gnitirw edoc tseb"。
 */

public class 字母翻转 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String[] ts = text.split(" ");//将输入的字符串以空格为分隔符分成字符串数组(数组元素中不包含分隔符)
        int a = ts.length;//a为数组长度
        for(int i=0;i<a;i++){
            ts[i] = reverse(ts[i]);//将每个单词字符串都以中线翻转
        }
        StringBuffer sb = new StringBuffer();//使用StringBuffer来拼接字符串,不会造成内存空间被垃圾数据占用
        for(int j=0;j<a;j++){
            sb.append(ts[j]);
            if(j!=a-1){
                sb.append(" ");//从新加上空格,但最后不用加
            }
        }
        System.out.println(sb.toString());

    }

    /**
     * 将单词以中线翻转
     * @param text
     * @return
     */
    public static String reverse(String text){
        String[] t= text.split("");//将字符串分隔为字符数组,数组每个数据元素都只有一个字符
        String s;
        int l = text.length();
        //翻转
        for(int i=0;i<l/2;i++){
            s = t[i];
            t[i] = t[l-1-i];
            t[l-1-i] = s;
        }
        StringBuffer sb = new StringBuffer();//使用StringBuffer来拼接字符串
        for(int i=0;i<l;i++){
            sb.append(t[i]);
        }
        text = sb.toString();
        return text;
    }
}
