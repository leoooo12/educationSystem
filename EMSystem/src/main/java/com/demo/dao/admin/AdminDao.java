package com.demo.dao.admin;

import com.demo.entity.Address;
import com.demo.entity.Room;
import com.demo.entity.User;
import com.demo.entity.MyExam;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AdminDao {
    /**
     *查询所有考点区域
     * @return
     */
    @Select("select * from address")
    public List<Address> findArea();

    /**
     *根据id查询所在考点区域
     * @return
     */
    @Select("select * from address where id=#{id}")
    public Address findAreaById(Integer id);

    /**
     * 根据考点名及考试区域查询
     * @param name
     * @param area
     * @return
     */
    @Select("<script>"+
            "select * from room as r where 1=1" +
            "<if test='name!=null and name != \"\"'>" +
            "and r.name like CONCAT('%',#{name},'%')" +
            "</if>" +
            "<if test='areaId!=null'>" +
            "and r.address_id=#{areaId}" +
            "</if>" +
            "</script>")
    @Results(id="addressOnly",value = {
            @Result(property="address",
                    column = "address_id",
                    one = @One(select = "com.demo.dao.admin.AdminDao.findAreaById")
            )
    })
    public List<Room> searchByNameAndArea(@Param("name")String name, @Param("areaId")Integer area);

    /**
     * 根据id查找考点信息
     * @param id
     * @return
     */
    @Select("select * from room where id=#{id}")
    @ResultMap("addressOnly")
    public Room findRoomById(Integer id);

    /**
     * 根据id更新考点信息
     * @param room
     * @return
     */
    @Update("update room set num=#{num},name=#{name},size=#{size},detail=#{detail},address_id=#{address.id} where id=#{id}")
    public int updateRoom(Room room);

    /**
     * 新增考点信息
     * @param room
     * @return
     */
    @Insert("insert room(num,name,size,detail,address_id) values(#{num},#{name},#{size},#{detail},#{address.id})")
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
    public int saveRoom(Room room);

    /**
     * 删除考点
     * @param room
     * @return
     */
    @Delete("delete from room where id=#{id}")
    public int deleteRoom(Room room);

    /**
     * 根据某项考试（已付款）查找所有考生成绩
     * @param examId
     * @return
     */
    @Select("<script>"+
            "select * from myexam where pay=1" +
            "<if test='examId!=null and examId != \"\"'>" +
            "and exam_id=#{examId}" +
            "</if>" +
            "</script>")
    @Results(id="user_exam",value = {
            @Result(property="user",
                    column = "user_id",
                    one = @One(select = "com.demo.dao.examinee.ExamineeDao.findById")
            ),
            @Result(property="exam",
                    column = "exam_id",
                    one = @One(select = "com.demo.dao.ExamDao.findById")
            ),
            @Result(property="address",
                    column = "address",
                    one = @One(select = "com.demo.dao.admin.AdminDao.findAreaById")
            ),
            @Result(property="examNum",column = "exam_num"),
            @Result(property="roomNum",column = "room_num")
    })
    public List<MyExam> findScoreByExam(@Param("examId") Integer examId);

    /**
     * 根据个人考试成绩项id查询单条信息
     * @param id
     * @return
     */
    @Select("select * from myexam where id=#{id}")
    @ResultMap("user_exam")
    public MyExam findScoreById(Integer id);

    /**
     * 更新个人考试成绩
     * @param myExam
     * @return
     */
    @Update("update myexam set score=#{score} where id=#{id}")
    public int updateScore(MyExam myExam);

    /**
     * 批量更新考号，考室号
     * @param e
     * @return
     */
    @Update("<script>"+
            "<foreach collection='list' item='l' separator=\';\' >" +
            "update myexam set exam_num=#{l.examNum},room_num=#{l.roomNum}" +
            " where id=#{l.id}" +
            "</foreach>" +
            "</script>")
    public int batchCreateExamNum(@Param("list") List<MyExam> e);

    /**
     * 根据角色查找用户信息列表
     * @param user
     * @return
     */
    @Select("select * from user where role=#{role}")
    public List<User> findUser(User user);

    @Insert("insert user(name,username,password,sex,idnumber,eduback,phone,role) " +
            "values(#{name},#{username},#{username},#{sex},#{idnumber},#{eduback},#{phone},#{role})")
    public Integer saveUser(User user);

    @Delete("delete from user where id=#{id}")
    public Integer deleteUser(User user);
}
