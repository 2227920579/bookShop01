package example.Pojo;
/*
* 用户实体类
* */
public class User {
    int id;
    String Username;
    String Password;

    public User() {
    }

    public User(int id, String Username, String Password) {
        this.id = id;
        this.Username = Username;
        this.Password = Password;
    }

    /**
     * 获取
     * @return User_ID
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return Username
     */
    public String getUsername() {
        return Username;
    }

    /**
     * 设置
     * @param Username
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * 获取
     * @return Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * 设置
     * @param Password
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String toString() {
        return "User{User_ID = " + id + ", Username = " + Username + ", Password = " + Password + "}";
    }
}
