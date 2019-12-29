package com.chat.chat.pojo.vo;

import lombok.Data;

@Data
public class UsersVO {//返回给前端的Users对象，与Users对象的字段几乎相同，但没有必要返回password、cid等信息
    private String id;
    private String username;
    private String faceImage;
    private String faceImageBig;
    private String nickname;
    private String qrcode;

}