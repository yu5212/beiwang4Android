package online.beiwang.models;

/**
 * Created by yuying on 2016/12/1.
 */

public class UserModel {

    /**
     * Name :
     * Password :
     * RegTime :
     * LoginTime :
     * Point : 200
     * Icon :
     */

    private String Name;
    private String Password;
    private String RegTime;
    private String LoginTime;
    private int Point;
    private String Icon;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getRegTime() {
        return RegTime;
    }

    public void setRegTime(String RegTime) {
        this.RegTime = RegTime;
    }

    public String getLoginTime() {
        return LoginTime;
    }

    public void setLoginTime(String LoginTime) {
        this.LoginTime = LoginTime;
    }

    public int getPoint() {
        return Point;
    }

    public void setPoint(int Point) {
        this.Point = Point;
    }

    public String getIcon() {
        return Icon;
    }

    public void setIcon(String Icon) {
        this.Icon = Icon;
    }
}



