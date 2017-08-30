package mapper;

import domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by WLP on 2017/8/3.
 */
@Mapper
public interface UserMapper {

    @Select("select * from user where userName=#{userName}")
    User isExist(String userName);

    @Select("select * from user")
    List<User> selectAll();

    //查询总数
    @Select("select count(*) from user")
    int usersNum();
}
