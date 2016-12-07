package online.beiwang.userManager;

import java.io.InputStream;
import java.util.Set;

import online.beiwang.models.UserModel;

import static android.provider.ContactsContract.CommonDataKinds.Website.URL;

/**
 * Created by yuying on 2016/12/1.
 */

public class UserManager implements UserManagerInterface {

    @Override
    public String Reg(String email, String password) {
        String msg="";




        return  msg;
    }

    @Override
    public Boolean CheckLogin(String email, String password) {
        return null;
    }

    @Override
    public void Login(String email) {

    }

    @Override
    public String Update(UserModel userModel) {
        return null;
    }
}
