package online.beiwang.userManager;

/**
 * Created by yuying on 2016/12/1.
 */

public interface UserManagerInterface {
    String Reg(String email,String password);
    Boolean CheckLogin(String email,String password);
    void  Login(String email);
    String Update(online.beiwang.models.UserModel userModel);

}
