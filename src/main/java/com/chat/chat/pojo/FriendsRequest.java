package com.chat.chat.pojo;

import java.util.Date;

public class FriendsRequest {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column friends_request.id
     *
     * @mbg.generated Fri Dec 27 19:42:59 CST 2019
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column friends_request.send_user_id
     *
     * @mbg.generated Fri Dec 27 19:42:59 CST 2019
     */
    private String sendUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column friends_request.accept_user_id
     *
     * @mbg.generated Fri Dec 27 19:42:59 CST 2019
     */
    private String acceptUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column friends_request.request_date_name
     *
     * @mbg.generated Fri Dec 27 19:42:59 CST 2019
     */
    private Date requestDateName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column friends_request.id
     *
     * @return the value of friends_request.id
     *
     * @mbg.generated Fri Dec 27 19:42:59 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column friends_request.id
     *
     * @param id the value for friends_request.id
     *
     * @mbg.generated Fri Dec 27 19:42:59 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column friends_request.send_user_id
     *
     * @return the value of friends_request.send_user_id
     *
     * @mbg.generated Fri Dec 27 19:42:59 CST 2019
     */
    public String getSendUserId() {
        return sendUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column friends_request.send_user_id
     *
     * @param sendUserId the value for friends_request.send_user_id
     *
     * @mbg.generated Fri Dec 27 19:42:59 CST 2019
     */
    public void setSendUserId(String sendUserId) {
        this.sendUserId = sendUserId == null ? null : sendUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column friends_request.accept_user_id
     *
     * @return the value of friends_request.accept_user_id
     *
     * @mbg.generated Fri Dec 27 19:42:59 CST 2019
     */
    public String getAcceptUserId() {
        return acceptUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column friends_request.accept_user_id
     *
     * @param acceptUserId the value for friends_request.accept_user_id
     *
     * @mbg.generated Fri Dec 27 19:42:59 CST 2019
     */
    public void setAcceptUserId(String acceptUserId) {
        this.acceptUserId = acceptUserId == null ? null : acceptUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column friends_request.request_date_name
     *
     * @return the value of friends_request.request_date_name
     *
     * @mbg.generated Fri Dec 27 19:42:59 CST 2019
     */
    public Date getRequestDateName() {
        return requestDateName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column friends_request.request_date_name
     *
     * @param requestDateName the value for friends_request.request_date_name
     *
     * @mbg.generated Fri Dec 27 19:42:59 CST 2019
     */
    public void setRequestDateName(Date requestDateName) {
        this.requestDateName = requestDateName;
    }
}