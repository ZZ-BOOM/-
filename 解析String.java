package String类;

/**
 * @author 孙志强
 * @create 2022/3/21 16:20
 *
 * String s="name=王五 age=18 classNum=1101”;
 * 将上面的字符串中包含的信息存放到 Student（里面有 name，age，classNum 三个属性）的对象中
 *
 */

public class 解析String {
    public static void main(String[] args) {
        Student stu = new Student();
        String s = "name=王五 age=18 classNum=1101";
        String[] ts = s.split(" ");//将s以空格为分隔符分成字符串数组ts
        int length = ts.length;
        for(int i=0;i<length;i++){
            String[] ss = ts[i].split("=");//将ts的每一个字符串元素再以=为分隔符分为字符串数组ss
            //以ss[0]为基准分支选择给stu属性赋值
            switch (ss[0]){
                case "name":
                    stu.setName(ss[1]);
                    break;
                case "age":
                    stu.setAge(Integer.parseInt(ss[1]));
                    break;
                case "classNum":
                    stu.setClassNum(ss[1]);
                    break;
            }
        }
        System.out.println(stu.toString());
    }
}

class Student{
    private String name;
    private int age;
    private String classNum;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", classNum='" + classNum + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }
}
