<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<title>xx管理</title>
<div id="container" class="wrapper wrapper-content">
    <div id="breadcrumb">
        <bread-crumb :crumbs="breadcrumbs"></bread-crumb>
    </div>
    <!-- ibox start -->
    <div class="ibox">
        <div class="ibox-content">
            <div class="row">
                <form id="searchForm" @submit.prevent="query">
                    <div class="col-md-2">
                        <div class="form-group">
                            <label class="sr-only" for="keyword"></label>
                            <input
                                    v-model="form.keyword"
                                    id="keyword"
                                    name="keyword"
                                    type="text"
                                    placeholder="关键字" class="form-control"/>
                        </div>
                    </div>
                    <div class="col-md-1">
                        <div class="form-group">
                            <button id="searchBtn" type="submit" class="btn btn-block btn-outline btn-default"
                                    alt="搜索"
                                    title="搜索">
                                <i class="fa fa-search"></i>
                            </button>
                        </div>
                    </div>
                    <div class="col-md-2">

                    </div>
                    <!-- 将剩余栅栏的长度全部给button -->
                    <div class="col-md-7 text-right">
                        <shiro:hasPermission name="position:add">
                            <div class="form-group">
                                <button @click="createBtnClickHandler" id="createBtn" type="button"
                                        class="btn btn-outline btn-primary">新增
                                </button>
                            </div>
                        </shiro:hasPermission>
                    </div>
                </form>
            </div>
            <!-- <div class="columns columns-right btn-group pull-right"></div> -->
            <table v-el:data-table id="dataTable" width="100%"
                   class="table table-striped table-bordered table-hover">
            </table>
        </div>
    </div>
    <!-- ibox end -->
</div>
<!-- 添加/编辑的modal-->
<div id="modal" class="modal fade" tabindex="-1" data-width="760">
    <validator name="validation">
        <form name="createMirror" novalidate class="form-horizontal" role="form">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h3>xxx管理</h3>
            </div>
            <div class="modal-body">
                <#list attrs as attr>
                    <#if attr.name !='id'>
                 <div class="form-group" :class="{'has-error':$validation.${attr.name}.invalid && submitBtnClick}">
                     <label for="${attr.name}" class="col-sm-2 control-label"> ${attr.remark}</label>
                     <div class="col-sm-8">
                         <input v-model="${className?lower_case}.${attr.name}"
                                v-validate:${attr.name?replace("([a-z])([A-Z]+)","$1-$2","r")?lower_case}="{
                     required:{rule:true,message:'请输入 ${attr.remark}'}
                   }"
                                id="${attr.name}" type="text" class="form-control" placeholder="请输入 ${attr.remark}">
                         <span v-cloak v-if="$validation.${attr.name}.invalid && submitBtnClick"
                               class="help-absolute">
                <span v-for="error in $validation.${attr.name}.errors">
                  {{error.message}} {{($index !== ($validation.positionName.errors.length -1)) ? ',':''}}
                </span>
            </span>
                     </div>
                 </div>
                    </#if>
                 </#list>
            </div>
            <div class="modal-footer">
                <button :disabled="disabled" type="button" data-dismiss="modal" class="btn">取消</button>
                <button @click="submit" :disabled="disabled" type="button" class="btn btn-primary">提交</button>
            </div>
        </form>
    </validator>
</div>


<script src="/static/js/containers/business/${className}.js"></script>


