package school;

import java.util.ArrayList;
import java.util.Scanner;

public class SchoolSystem implements ISignUp, IParams {
    int big, medium, small;

    static Scanner s = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<String> str = new ArrayList<>();

    public SchoolSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addStudent(int stuType) {
        if (stuType < 1 || stuType > 3) {
            str.add("null");
            return false;
        }

        if (stuType == 1 && big > 0) {
            list.add(1);
            str.add("true");
            big--;
            return true;

        } else if (stuType == 2 && medium > 0) {
            list.add(2);
            str.add("true");
            medium--;
            return true;
        } else if (stuType == 3 && small > 0) {
            list.add(3);
            str.add("true");
            small--;
            return true;
        }

        str.add("false");
        return false;
    }

    String[] parse(String input) {
        String[] name = input.split(",");
        return name;
    }

    public static IParams parse() throws Exception {
        System.out.print("输入大，中，小班幼儿园的剩余名额:\n");
        return new SchoolSystem(s.nextInt(), s.nextInt(), s.nextInt());
    }

    @Override
    public void print() {
        System.out.println(str);
    }

    @Override
    public int getBig() {
        return this.big;
    }

    @Override
    public int getMedium() {
        return this.medium;
    }

    @Override
    public int getSmall() {
        return this.small;
    }

    @Override
    public ArrayList<Integer> getPlanSignUp() {
        System.out.println("输入学生姓名:");
        int n = parse(s.next()).length;
        System.out.print("输入想进入的班级:\n");
        for (int i = 0; i < n; i++) {
            list.add(s.nextInt());
        }
        return list;
    }
}
