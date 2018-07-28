package com.jyh.api.plat.console;

import java.util.List;

import com.jyh.entity.plat.console.User;

/**
 * @author jiangyonghua
 * @date 2018年3月5日 下午3:03:31
 */
public interface UserService {

	List<User> load();

	List<User> query(String param);

	List<User> roleUsers(String roleid);
}
