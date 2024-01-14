package com.example.demo.until;

import lombok.Data;

/**
 * author : hwang
 * date : 2024/1/13 15:03
 * description : QueryInfo
 */
@Data
public class QueryInfo {
//当前页码
    private int pageCode;
    //每页显示记录数
    private int pageSize = 5;
    //开始索引
    private int startIndex;
    //模糊查询关键字
    private String query;
    //查询状态
    private String queryState;

}
