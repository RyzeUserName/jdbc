var vueIndex = null;
+(function (RocoUtils) {
    $('#systemMenu').addClass('active');
    $('#admin').addClass('active');
    vueIndex = new Vue({
        el: '#container',
        data: {
            $dataTable: null,
            fUser: null,
            form: {
                keyword: '',
                status: ''
            },
            system: null,
        },
        methods: {
            auto: function () {
                this.$dataTable.bootstrapTable('selectPage', 1);
            },
            drawTable: function () {
                var self = this;
                self.$dataTable = $(this.$els.dataTable).bootstrapTable({
                    url: '/api/business/${className?lower_case}?system=' + self.system,
                    method: 'get',
                    dataType: 'json',
                    cache: false, //去缓存
                    pagination: true, //是否分页
                    sidePagination: 'server', //服务端分页
                    queryParams: function (params) {
                        // 将table 参数与搜索表单参数合并
                        return _.extend({}, params, self.form);
                    },
                    mobileResponsive: true,
                    undefinedText: '-', //空数据的默认显示字符
                    striped: true, //斑马线
                    maintainSelected: true, //维护checkbox选项
                    sortName: 'id', //默认排序列名
                    sortOrder: 'desc', //默认排序方式
                    columns: [
                    <#list attrs as attr>
                      {
                        field: '${attr.name}',
                        title: '${attr.remark}',
                        align: 'center'
                    },
                    </#list>
                    {
                        field: '', //将id作为排序时会和将id作为操作field内容冲突，导致无法排序
                        title: "操作",
                        align: 'center',
                        formatter: function (value, row, index) {
                            var fragment = '';
                            //if (RocoUtils.hasPermission('${className?lower_case}:edit'))
                                fragment += ('<button data-handle="operate-edit" data-id="' + row.id + '" type="button" class="m-r-xs btn btn-xs btn-info">编辑</button>');
                            //if (RocoUtils.hasPermission('${className?lower_case}:delete'))
                                fragment += ('<button data-handle="operate-del" data-id="' + row.id + '" type="button" class="m-r-xs btn btn-xs btn-danger">删除</button>');
                            return fragment;
                        }
                    }]
                });

                // 编辑按钮
                self.$dataTable.on('click', '[data-handle="operate-edit"]', function (e) {
                    var id = $(this).data('id');
                    self.$http.get('/api/${className?lower_case}/' + id).then(function (res) {
                        if (res.data.code == 1) {
                            var ${className?lower_case} = res.data.data;
                            this.showModel(${className?lower_case}, true);
                        }
                    });
                });

                // 删除
                self.$dataTable.on('click', '[data-handle="operate-del"]', function (e) {
                    var id = $(this).data('id');
                    swal({
                        title: '删除信息',
                        text: '确定要删除该信息？',
                        type: 'info',
                        confirmButtonText: '确定',
                        cancelButtonText: '取消',
                        showCancelButton: true,
                        showConfirmButton: true,
                        showLoaderOnConfirm: true,
                        confirmButtonColor: '#ed5565',
                        closeOnConfirm: false
                    }, function () {
                        self.$http.get('/api/${className?lower_case}/del/' + id).then(function (res) {
                            if (res.data.code == 1) {
                                self.$toastr.success('操作成功');
                                self.$dataTable.bootstrapTable('refresh');
                            }
                        }).finally(function () {
                            swal.close();
                        });
                    });
                    e.stopPropagation();
                });
            },
            query: function () {
                this.$dataTable.bootstrapTable('refresh', {pageNumber: 1});
            },
            createBtnClickHandler: function (e) {
                var ${className?lower_case} = {
                <#list attrs as attr>
                     ${attr.name}: '',
                </#list>
                };
                this.showModel(${className?lower_case}, false);
            },
            showModel: function (${className?lower_case}, isEdit) {
                var _$modal = $('#modal').clone();
                var $modal = _$modal.modal({
                    height: 450,
                    maxHeight: 450,
                    backdrop: 'static',
                    keyboard: false
                });
                modal($modal, ${className?lower_case}, isEdit);
            }
        },
        created: function () {
            this.fUser = window.RocoUser;
            this.system = RocoUtils.getQueryString('id');
        },
        ready: function () {
            this.drawTable();
        }
    });

    // 实现弹窗方法
    function modal($el, model, isEdit) {
        // 获取 node
        var el = $el.get(0);
        isEdit = isEdit || false;
        // 创建 Vue 对象编译节点
        var vueModal = new Vue({
            el: el,
            // 模式窗体必须引用 ModalMixin
            mixins: [RocoVueMixins.ModalMixin],
            $modal: $el, //模式窗体 jQuery 对象
            data: {
                //控制 按钮是否可点击
                disabled: false,
                //模型复制给对应的key
        ${className?lower_case}: model,
                submitBtnClick: false
            },
            methods: {
                submit: function () {
                    var self = this;
                    self.submitBtnClick = true;
                    self.$validate(true, function () {
                        if (self.$validation.valid) {
                            self.disabled = true;
                            self.${className?lower_case}.systemId = vueIndex.system;
                            if (isEdit) {
                                self.$http.post('/api/${className?lower_case}/update', self.${className?lower_case}).then(function (response) {
                                    self.processResponse(response);
                                })
                            } else {
                                self.$http.post('/api/${className?lower_case}/insert', self.${className?lower_case}).then(function (response) {
                                    self.processResponse(response);
                                })
                            }
                        }
                    });
                },
                processResponse: function (response) {
                    var self = this;
                    var res = response.data;
                    if (res.code == 1) {
                        $el.on('hidden.bs.modal', function () {
                            vueIndex.$dataTable.bootstrapTable('refresh');
                            self.$toastr.success('操作成功');
                        });
                        $el.modal('hide');
                    } else {
                        self.$toastr.error(res.message);
                        self.disabled = false;
                    }
                }
            }
        });
        // 创建的Vue对象应该被返回
        return vueModal;
    }
})
(this.RocoUtils);