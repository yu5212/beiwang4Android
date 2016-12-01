package online.beiwang.userManager;

import java.util.Set;

import online.beiwang.models.UserModel;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by yuying on 2016/12/1.
 */

public class UserManager implements UserManagerInterface {

    @Override
    public String Reg(String email, String password) {
        String msg="";
        try {
            JedisPool pool = new JedisPool(new JedisPoolConfig(), "localhost");
            try (Jedis jedis = pool.getResource()) {
                jedis.lpush(email, password);
            }
            pool.destroy();
        }
        catch (Exception e)
        {

        }
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
