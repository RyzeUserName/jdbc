package com.example.jdbc.generate;

import com.ccbuluo.dao.BaseDao;
import com.google.common.collect.Maps;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 内部账户 dao
 * @author Ryze
 * @date 2019-05-08 13:52:08
 * @version V 2.0.0
 */
@Repository
public class BizFinanceAccountDao extends BaseDao<BizFinanceAccount> {
    @Resource
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
    return namedParameterJdbcTemplate;
    }

    /**
     * 保存 内部账户实体
     * @param entity 内部账户实体
     * @return int 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int saveBizFinanceAccount(BizFinanceAccount entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO biz_finance_account ( account_code,account_name,")
            .append("business_type,business_item_type,organization_code,organization_name,")
            .append("account_balance,account_type,organization_type,account_pwd,")
            .append("pwd_set_time,creator,create_time,operator,operate_time,delete_flag,")
            .append("app_id,account_control_code,account_status,overdraft_amount,")
            .append("account_channel,associated_fee_code ) VALUES (  :accountCode,")
            .append(" :accountName, :businessType, :businessItemType, :organizationCode,")
            .append(" :organizationName, :accountBalance, :accountType, :organizationType,")
            .append(" :accountPwd, :pwdSetTime, :creator, :createTime, :operator,")
            .append(" :operateTime, :deleteFlag, :appId, :accountControlCode,")
            .append(" :accountStatus, :overdraftAmount, :accountChannel,")
            .append(" :associatedFeeCode )");
        return super.save(sql.toString(), entity);
    }

    /**
     * 编辑 内部账户实体
     * @param entity 内部账户实体
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int updateBizFinanceAccount(BizFinanceAccount entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE biz_finance_account SET account_code = :accountCode,")
            .append("account_name = :accountName,business_type = :businessType,")
            .append("business_item_type = :businessItemType,")
            .append("organization_code = :organizationCode,")
            .append("organization_name = :organizationName,")
            .append("account_balance = :accountBalance,account_type = :accountType,")
            .append("organization_type = :organizationType,account_pwd = :accountPwd,")
            .append("pwd_set_time = :pwdSetTime,creator = :creator,")
            .append("create_time = :createTime,operator = :operator,")
            .append("operate_time = :operateTime,delete_flag = :deleteFlag,")
            .append("app_id = :appId,account_control_code = :accountControlCode,")
            .append("account_status = :accountStatus,overdraft_amount = :overdraftAmount,")
            .append("account_channel = :accountChannel,")
            .append("associated_fee_code = :associatedFeeCode WHERE id= :id");
        return super.updateForBean(sql.toString(), entity);
    }

    /**
     * 获取内部账户详情
     * @param id  id
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public BizFinanceAccount getBizFinanceAccountById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT bfa.id,bfa.account_code,bfa.account_name,bfa.business_type,")
            .append("bfa.business_item_type,bfa.organization_code,bfa.organization_name,")
            .append("bfa.account_balance,bfa.account_type,bfa.organization_type,")
            .append("bfa.account_pwd,bfa.pwd_set_time,bfa.creator,bfa.create_time,")
            .append("bfa.operator,bfa.operate_time,bfa.delete_flag,bfa.app_id,")
            .append("bfa.account_control_code,bfa.account_status,bfa.overdraft_amount,")
            .append("bfa.account_channel,bfa.associated_fee_code FROM biz_finance_account")
            .append(" bfa WHERE bfa.id= :id");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.findForBean(BizFinanceAccount.class, sql.toString(), params);
    }

    /**
     * 删除内部账户
     * @param id  id
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int deleteBizFinanceAccountById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE  FROM biz_finance_account WHERE id= :id ");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.updateForMap(sql.toString(), params);
    }
}
