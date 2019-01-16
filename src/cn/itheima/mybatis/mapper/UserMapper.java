package cn.itheima.mybatis.mapper;

import java.util.List;

import cn.itheima.mybatis.pojo.User;

public interface UserMapper {

	// 遵循四个原则
	// 1.接口的方法名==User.xml中的id名
	// 2.返回值类型 与 mapper.xml文件中的resultType返回值类型一致
	// 3.方法的入参parameterType类型 与 Mapper.xml中的入参类型要一致
	// 4.命名空间 绑定此接口

	public User findUserById(Integer id);

	public List<User> findUserByUseranme(String username);

	public int insertUser(User user);

	public int updateUser(User user);

	public int deleteUser(Integer id);

}
