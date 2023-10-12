package com.lion.usercenter.common;

import lombok.Data;

/**
 * 注释@Data 自动生成get set toString equals hashCode
 *
 * @Author: Lion
 * @Date: 2023/10/12/19:19
 * @Description:
 */
@Data
public class PageRequest {
    /**
     * 当前页
     */
    private Integer currentPage = 1;
    /**
     * 每页数量
     */
    private Integer pageSize = 10;
    /**
     * 排序字段
     */
    private String sortField;
}
