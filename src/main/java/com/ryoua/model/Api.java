package com.ryoua.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * * @Author: RyouA
 * * @Date: 2020/7/22
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@TableName("m_api")
public class Api {
    private Integer id;

    private String url;
    private String method;
    private String status;

    private Integer user;
    private Integer valid;
    private String updateTime;
    private String createTime;
}
