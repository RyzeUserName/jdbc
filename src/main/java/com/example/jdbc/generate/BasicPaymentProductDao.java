package com.example.jdbc.generate;

import com.ccbuluo.dao.BaseDao;
import com.google.common.collect.Maps;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 支付产品表 dao
 * @author Ryze
 * @date 2019-05-08 13:52:08
 * @version V 2.0.0
 */
@Repository
public class BasicPaymentProductDao extends BaseDao<BasicPaymentProduct> {
    @Resource
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
    return namedParameterJdbcTemplate;
    }

    /**
     * 保存 支付产品表实体
     * @param entity 支付产品表实体
     * @return int 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int saveBasicPaymentProduct(BasicPaymentProduct entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO basic_payment_product ( pay_order_no,business_order_no,")
            .append("product_name,product_num,product_unit_price,product_desc,")
            .append("product_remark,create_time,delete_flag,operator,creator,operate_time")
            .append(" ) VALUES (  :payOrderNo, :businessOrderNo, :productName,")
            .append(" :productNum, :productUnitPrice, :productDesc, :productRemark,")
            .append(" :createTime, :deleteFlag, :operator, :creator, :operateTime )");
        return super.save(sql.toString(), entity);
    }

    /**
     * 编辑 支付产品表实体
     * @param entity 支付产品表实体
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int updateBasicPaymentProduct(BasicPaymentProduct entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE basic_payment_product SET pay_order_no = :payOrderNo,")
            .append("business_order_no = :businessOrderNo,product_name = :productName,")
            .append("product_num = :productNum,product_unit_price = :productUnitPrice,")
            .append("product_desc = :productDesc,product_remark = :productRemark,")
            .append("create_time = :createTime,delete_flag = :deleteFlag,")
            .append("operator = :operator,creator = :creator,operate_time = :operateTime")
            .append(" WHERE id= :id");
        return super.updateForBean(sql.toString(), entity);
    }

    /**
     * 获取支付产品表详情
     * @param id  id
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public BasicPaymentProduct getBasicPaymentProductById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT bpp.id,bpp.pay_order_no,bpp.business_order_no,")
            .append("bpp.product_name,bpp.product_num,bpp.product_unit_price,")
            .append("bpp.product_desc,bpp.product_remark,bpp.create_time,bpp.delete_flag,")
            .append("bpp.operator,bpp.creator,bpp.operate_time FROM basic_payment_product")
            .append(" bpp WHERE bpp.id= :id");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.findForBean(BasicPaymentProduct.class, sql.toString(), params);
    }

    /**
     * 删除支付产品表
     * @param id  id
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int deleteBasicPaymentProductById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE  FROM basic_payment_product WHERE id= :id ");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.updateForMap(sql.toString(), params);
    }
}
