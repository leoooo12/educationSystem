package com.demo.dao.manager;

import com.demo.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ManagerDao {
    /**
     * 插入一条考生信息，默认密码与用户名一致，返回插入记录主键
     * @param user
     * @return
     */
    @Insert("insert " +
            "user(name,username,password,sex,idnumber,eduback,address,email,phone,role) " +
            "values(#{name},#{username},#{username},#{sex},#{idnumber},#{eduback},#{address.id},#{email},#{phone},2)")
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
    public int insertExaminee(User user);

    /**
     * 根据用户姓名考试号查询
     * @param name
     * @param examId
     * @return
     */
    @Select("<script>"+
            "select " +
            "distinct u.id as id,u.name as name,u.username as username,u.email as email,u.phone as phone,u.role as role,u.sex as sex,u.idnumber as idnumber,u.eduback as eduback,u.address as address" +
            " from user as u join myexam as me on u.id=me.user_id where 1=1" +
            "<if test='name!=null and name != \"\"'>" +
            "and u.name like CONCAT('%',#{name},'%')" +
            "</if>" +
            "<if test='examId!=null'>" +
            "and me.exam_id=#{examId}" +
            "</if>" +
            "</script>")
    @Results(id="addressOnly",value = {
            @Result(property="address",
                    column = "address",
                    one = @One(select = "com.demo.dao.admin.AdminDao.findAreaById")
            )
    })
    public List<User> searchByNameAndExam(@Param("name") String name, @Param("examId") Integer examId);

    /**
     * 根据用户id查找某用户
     * @param id
     * @return
     */
    @Select("select * from user where id=#{id}")
    @ResultMap("addressOnly")
    public User findUserById(@Param("id") Integer id);


    /**
     * 插入一条考生信息并设置为已支付
     * @param userId
     * @param examId
     * @return
     */
    @Insert("insert myexam(user_id,exam_id,pay) values(#{userId},#{examId},1)")
    public int insertExam(@Param("userId") Integer userId,@Param("examId") Integer examId);

    /**
     * 更新用户信息
     * @param user
     */
    @Update("update user set name=#{name},sex=#{sex},email=#{email},phone=#{phone},idnumber=#{idnumber}," +
            "eduback=#{eduback},address=#{address.id} where id=#{id}")
    public int updateUser(User user);
}
