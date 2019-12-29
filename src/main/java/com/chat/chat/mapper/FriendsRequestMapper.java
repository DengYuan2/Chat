package com.chat.chat.mapper;

import com.chat.chat.pojo.FriendsRequest;
import com.chat.chat.pojo.FriendsRequestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FriendsRequestMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends_request
     *
     * @mbg.generated Fri Dec 27 19:42:59 CST 2019
     */
    long countByExample(FriendsRequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends_request
     *
     * @mbg.generated Fri Dec 27 19:42:59 CST 2019
     */
    int deleteByExample(FriendsRequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends_request
     *
     * @mbg.generated Fri Dec 27 19:42:59 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends_request
     *
     * @mbg.generated Fri Dec 27 19:42:59 CST 2019
     */
    int insert(FriendsRequest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends_request
     *
     * @mbg.generated Fri Dec 27 19:42:59 CST 2019
     */
    int insertSelective(FriendsRequest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends_request
     *
     * @mbg.generated Fri Dec 27 19:42:59 CST 2019
     */
    List<FriendsRequest> selectByExample(FriendsRequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends_request
     *
     * @mbg.generated Fri Dec 27 19:42:59 CST 2019
     */
    FriendsRequest selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends_request
     *
     * @mbg.generated Fri Dec 27 19:42:59 CST 2019
     */
    int updateByExampleSelective(@Param("record") FriendsRequest record, @Param("example") FriendsRequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends_request
     *
     * @mbg.generated Fri Dec 27 19:42:59 CST 2019
     */
    int updateByExample(@Param("record") FriendsRequest record, @Param("example") FriendsRequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends_request
     *
     * @mbg.generated Fri Dec 27 19:42:59 CST 2019
     */
    int updateByPrimaryKeySelective(FriendsRequest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends_request
     *
     * @mbg.generated Fri Dec 27 19:42:59 CST 2019
     */
    int updateByPrimaryKey(FriendsRequest record);
}