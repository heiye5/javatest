import java.io.File;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        File file = new File("F:\\2018608119");
        listAllFile(file);
    }

    public static void listAllFile(File file) {
        File[] strs = file.listFiles();
        for (int i = 0; i < strs.length; i++) {
            // 判断strs[i]是不是目录
            if (strs[i].isDirectory()) {
                listAllFile(strs[i]);//递归调用自己
                System.out.println("目录="+strs[i].getName());
            } else {
                System.out.println("文件名="+strs[i].getName());
            }
        }
    }
}
