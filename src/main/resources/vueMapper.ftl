<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="cn.ccbuluo.repository.business.${className}DAO">
    <resultMap id="BaseResultMap" type="cn.ccbuluo.entity.business.${className}">
       <#list attrs as attr>
            <#if attr.name =='id'>
                <id column="id" property="id"/>
            <#else >
                <result column="${attr.columnName}" property="${attr.name}"/>
            </#if>
       </#list>
    </resultMap>
    <sql id="Base_Column_List">
        <#list attrs as attr>
            <#if attr_has_next>
                ${attr.columnName},
            <#else >
                ${attr.columnName}
            </#if>
        </#list>
    </sql>
    <select id="getById" resultMap="BaseResultMap">
        select
        <include refid="Base_Column_List"/>
        from ${tableOgrName}
        where id = ${"#"}{id}
    </select>
    <delete id="deleteById">
        delete from ${tableOgrName}
        where id = ${"#"}{id}
    </delete>
    <insert id="insert" keyColumn="id" keyProperty="id" useGeneratedKeys="true">
        insert into ${tableOgrName}
        <trim prefix="(" suffix=")" suffixOverrides=",">
              <#list attrs as attr>
               <#if attr.name !='id'>
                    <if test="${attr.name} != null">
                        ${attr.columnName},
                    </if>
               </#if>
              </#list>
        </trim>
        <trim prefix="values (" suffix=")" suffixOverrides=",">
            <#list attrs as attr>
               <#if attr.name !='id'>
                    <if test="${attr.name} != null">
                        ${"#"}{${attr.name}},
                    </if>
               </#if>
            </#list>
        </trim>
    </insert>
    <update id="update">
        update  ${tableOgrName}
        <set>
             <#list attrs as attr>
               <#if attr.name !='id'>
                    <if test="${attr.name} != null">
                        ${attr.columnName} = ${"#"}{${attr.name}},
                    </if>
               </#if>
             </#list>
        </set>
        where id = ${"#"}{id}
    </update>

    <select id="search" parameterType="map" resultMap="BaseResultMap">
        SELECT
        <include refid="Base_Column_List"/>
        <include refid="searchFromWhere"/>
        <if test="sort != null">
            ORDER BY
            <foreach collection="sort" item="order" separator=",">
            ${"$"}{order.property} ${"$"}{order.direction}
            </foreach>
        </if>
    </select>
    <sql id="searchFromWhere">
        FROM ${tableOgrName}
        <where>
            <if test="keyword != null">
                AND keyword LIKE CONCAT('%',${"#"}{keyword},'%')
            </if>
        </where>
    </sql>
</mapper>