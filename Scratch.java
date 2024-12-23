import java.util.StringJoiner;

public class Scratch {
    public static void main(String[] args) throws CloneNotSupportedException {
        int[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 0 };
        User u1 = new User(1, "zhangsan", "1234qwer", "girl11", data);
        User u2 = (User) u1.clone();
        // System.out.println(u1);
        // System.out.println(u2);
        String s1 = "hah";
        String s2 = new String("hah");
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(s1 == s2);

        s2 = s1;

        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(s1 == s2);

    }
}

class User implements Cloneable {
    private int id;
    private String username;
    private String password;
    private String path;
    private int[] data;

    public User() {
    }

    public User(int id, String username, String password, String path, int[] data) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.path = path;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    /**
     * 设置
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    /**
     * 设置
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     *
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取
     *
     * @return data
     */
    public int[] getData() {
        return data;
    }

    /**
     * 设置
     *
     * @param data
     */
    public void setData(int[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "角色编号为：" + id + "，用户名为：" + username + "密码为：" + password + ", 游戏图片为:" + path + ", 进度:" + arrToString();
    }

    public String arrToString() {
        StringJoiner sj = new StringJoiner(", ", "[", "]");

        for (int i = 0; i < data.length; i++) {
            sj.add(data[i] + "");
        }
        return sj.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 调用父类中的clone方法
        // 相当于让Java帮我们克隆一个对象，并把克隆之后的对象返回出去。

        // 先把被克隆对象中的数组获取出来
        int[] data = this.data;
        // 创建新的数组
        int[] newData = new int[data.length];
        // 拷贝数组中的数据
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        // 调用父类中的方法克隆对象
        User u = (User) super.clone();
        // 因为父类中的克隆方法是浅克隆，替换克隆出来对象中的数组地址值
        u.data = newData;
        return u;
    }
}