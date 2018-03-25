package chapter22;

import java.io.File;
import java.util.Arrays;
import java.util.Stack;

public class DirectorySize22_21 {

    public static void main(String[] gg) {

        System.out.println(getSize(new File("C:\\Users\\sun_m\\Desktop\\evennumberedexercise")));

    }

    private static long getSize(File directory) {
        long size = 0;
        Stack<File> stack = new Stack<>();
        stack.add(directory);

        while (!stack.isEmpty()) {
            File t = stack.pop();
            if (t.isDirectory()) {
                stack.addAll(Arrays.asList(t.listFiles()));
            } else size += t.length();
        }
        return size;
    }
}
