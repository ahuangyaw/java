package com.example.demo.until;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * author : hwang
 * date : 2024/1/13 15:00
 * description : PageResult
 * 分页结果类
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PageResult extends Result{
    //总记录数
    private Long total;
    //当前页数据
    private List list;

    public PageResult(boolean flag, String message, Object data, Long total, list list) {
        super(flag, message, data);
        this.total = total;
        this.list = list;
    }


}
