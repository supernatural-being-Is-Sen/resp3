package cn.kgc.test;

import cn.kgc.utils.BCrypt;
import cn.kgc.utils.IdWorker;

/**
 * @author 吴雨森
 * @data 2020/5/10
 */
public class BCryptTest {

    public static void main(String[] args) {

        String password = "123456";

        String hashpw = BCrypt.hashpw(password, BCrypt.gensalt());

        System.out.println(hashpw);

        System.out.println(BCrypt.checkpw(password,"$2a$10$lEV9y4EL9n8YU7Omcc4KqeocQp3bFkN/59wX9xEMabMJ/3C69l7zy"));

        IdWorker idWorker = new IdWorker();
        System.out.println(idWorker.nextId());

    }
}
