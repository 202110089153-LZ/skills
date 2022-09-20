package school;

//报名入学接口
public interface ISignUp {
    // 打印输出结果
    public void print();

    // 检查是否有 stuType对应的班级名额
    // 如果没有剩余名额，请返回 false ，否则学生将报名进入该班级并返回 true
    public boolean addStudent(int stuType);

    // 解析命令行输入的参数（格式），如文档描述
    public static IParams parse() throws Exception {
        return null;
    }
}
