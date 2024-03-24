package example.Pojo;

public class Admin {
    /*管理员ID（aId）：唯一标识一个用户的标识符。
   管理员姓名（aName）：用户的登录名。
   管理员密码（aPwd）：用户的登录密码。*/
    String aId;
    String aName;
    String aPwd;

    public Admin() {
    }

    public Admin(String aId, String aName, String aPwd) {
        this.aId = aId;
        this.aName = aName;
        this.aPwd = aPwd;
    }

    /**
     * 获取
     * @return aId
     */
    public String getAId() {
        return aId;
    }

    /**
     * 设置
     * @param aId
     */
    public void setAId(String aId) {
        this.aId = aId;
    }

    /**
     * 获取
     * @return aName
     */
    public String getAName() {
        return aName;
    }

    /**
     * 设置
     * @param aName
     */
    public void setAName(String aName) {
        this.aName = aName;
    }

    /**
     * 获取
     * @return aPwd
     */
    public String getAPwd() {
        return aPwd;
    }

    /**
     * 设置
     * @param aPwd
     */
    public void setAPwd(String aPwd) {
        this.aPwd = aPwd;
    }

    public String toString() {
        return "root{aId = " + aId + ", aName = " + aName + ", aPwd = " + aPwd + "}";
    }
}
