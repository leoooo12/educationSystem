package com.demo.dao.examinee;

import com.demo.entity.MyExam;
import com.demo.entity.User;
import com.demo.entity.examinee.Examinee;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ExamineeDao{
    /**
     * 查询所有不过期考试
     * @return
     */
    @Select("select * from user")
    public List<Examinee> findAll();

    @Select("select * from user where username=#{username} and password=#{password}")
    @Results(id="addressOnly",value = {
            @Result(property="address",
                    column = "address",
                    one = @One(select = "com.demo.dao.AddressDao.findById")
            )
    })
    public User findByUser(@Param("username") String username,@Param("password") String password);

    @Select("select * from user where id=#{id}")
    @ResultMap("addressOnly")
    public User findById(Integer id);

    /**
     * 根据用户及考试id查询个人考试信息
     * 使用级联查询之一对一关联映射
     * @param userId
     * @param examId
     * @return
     */
    @Select("select * from myexam where user_id=#{userId} and exam_id=#{examId} and pay=0")
    @Results(id="user_exam",value ={
         @Result(property="user",
                 column = "user_id",
                 one = @One(select = "com.demo.dao.examinee.ExamineeDao.findById")
         ),
        @Result(property="exam",
                column = "exam_id",
                one = @One(select = "com.demo.dao.ExamDao.findById")
        ),
         @Result(property="examNum",column = "exam_num"),
         @Result(property="roomNum",column = "room_num")
    })
    public MyExam findByUserAndExam(@Param("userId") Integer userId, @Param("examId") Integer examId);

    /**
     * 根据支付状态判断是否支付：0未支付，1支付
     * @param userId
     * @param pay
     * @return
     */
    @Select("select * from myexam where user_id=#{userId} and pay=#{pay} and score<0")
    @Results(id="examOnly",value ={
            @Result(property="exam",
                    column = "exam_id",
                    one = @One(select = "com.demo.dao.ExamDao.findById")
            ),
            @Result(property="examNum",column = "exam_num"),
            @Result(property="roomNum",column = "room_num")
    })
    public List<MyExam> findByUserAndPay(@Param("userId") Integer userId,@Param("pay") Integer pay);

    /**
     * 根据分数状态判断是否考试：score为负代表未参加，大于等于0表示参加，
     * 另外由考试中心给分时
     * @param userId
     * @return
     */
    @Select("select * from myexam where user_id=#{userId} and score>=0")
    @ResultMap("examOnly")
    public List<MyExam> findByUserAndExamed(@Param("userId") Integer userId);

    /**
     * 查询单项考试个人成绩
     * @param userId
     * @param examId
     * @return
     */
    @Select("select * from myexam where user_id=#{userId} and exam_id=#{examId} and score>=0")
    @ResultMap("examOnly")
    public List<MyExam> findOneByUserAndExamed(@Param("userId") Integer userId,@Param("examId")  Integer examId);

    /**
     * 更新支付状态
     * @param myExam
     */
    @Update("update myexam set pay=1 where id=#{id}")
    public void updateMyExamPay(MyExam myExam);

    /**
     * 更新用户信息
     * @param user
     */
    @Update("update user set name=#{name},sex=#{sex},email=#{email},phone=#{phone},idnumber=#{idnumber}," +
            "eduback=#{eduback},address=#{address.id} where id=#{id}")
    public int updateUser(User user);

    /**
     * 根据考试id查询已报名考生信息
     * @param examId
     * @return
     */
    @Select("select * from myexam where exam_id=#{examId}")
    @Results(id="userOnly",value ={
            @Result(property="user",
                    column = "user_id",
                    one = @One(select = "com.demo.dao.examinee.ExamineeDao.findById")
            ),
            @Result(property="examNum",column = "exam_num"),
            @Result(property="roomNum",column = "room_num")
    })
    public List<MyExam> findMyExamByExamId(Integer examId);

    /**
     * 返回所有个人考试信息
     * @return
     */
    @Select("select * from myexam")
    @ResultMap("userOnly")
    public List<MyExam> findMyExam();

    /**
     * 返回所有考生个人考试信息
     * @return
     */
    @Select("select * from myexam where id=#{id}")
    @ResultMap("user_exam")
    public MyExam findMyexamById(Integer id);

    @Insert("insert user(username,password,phone,role) values(#{username},#{password},#{phone},2)")
    public Integer registUser(User user);

    @Update("update user set perimage=#{fileName} where id=#{id}")
    public Integer saveUserImage(@Param("fileName") String fileName,@Param("id")Integer id);
}
