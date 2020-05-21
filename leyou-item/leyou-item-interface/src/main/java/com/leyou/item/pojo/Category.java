package com.leyou.item.pojo;
import lombok.Data;

import javax.persistence.*;

/**
 * @author GuoXing
 * @date 2020/5/20 14:28
 */
@Data
@Table(name = "tb_category")
public class Category {
    /**
     * 类目id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Long id;

    /**
     * 类目名称
     */
    private String name;

    /**
     * 父类目id,顶级类目填0
     */
    @Column(name = "parent_id")
    private Long parentId;

    /**
     * 是否为父节点，0为否，1为是
     */
    @Column(name = "is_parent")
    private Boolean isParent;

    /**
     * 排序指数，越小越靠前
     */
    private Integer sort;
}