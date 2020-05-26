package com.leyou.item.bo;

import com.leyou.item.pojo.Sku;
import com.leyou.item.pojo.Spu;
import com.leyou.item.pojo.SpuDetail;
import lombok.Data;

import java.util.List;

/**
 * @author GuoXing
 * @date 2020/5/26 16:13
 */
@Data
public class SpuBO extends Spu {
    String cname;
    String bname;
    SpuDetail spuDetail;
    List<Sku> skus;
}
