$('#commits').on('uncheck.bs.table check.bs.table check-all.bs.table uncheck-all.bs.table',function(e,rows) {
    var datas = $.isArray(rows) ? rows : [rows];        // 点击时获取选中的行或取消选中的行
    examine(e.type, datas);                      // 保存到全局 Set() 里
})
// var overAllIds = new Array();  //全局数组
function examine(type,datas,overAllIds){
    if(type === 'check' || type === 'check-all'){
        for(var i = 0;i<datas.length;i++) {
            var id = datas[i].commentId;
            var index = overAllIds.indexOf(id);
            if(index === -1) {
                overAllIds.push(id);
            }
        }
    }else{
        if (type === 'uncheck-all') {
            overAllIds = new Array();
        } else {
            for(var i = 0;i<datas.length;i++) {
                var id = datas[i].commentId;
                var index = overAllIds.indexOf(id);
                if(index > -1) {
                    overAllIds.splice(index,1);
                }
            }
        }
    }
}

function initTable(tableId,url,myColumns,toolbarId) {
    $("#" + tableId).bootstrapTable('destroy');//销毁表格
    $('#' + tableId).bootstrapTable({
        clickToSelect: true,//启用单击选中
        striped:true,//斑马线效果
        showRefresh:true,//刷新按钮
        showColumns:true,//可以勾选隐藏或显示特定列
        pagination: true,//启用分页
        url: url,//请求地址
        toolbar: '#' + toolbarId,
        // contentType: "application/x-www-form-urlencoded",//post提交必须要有
        method: 'get',//提交方式
        singleSelect: false,
        height: $(window).height() - 100,
        pageNumber: 1,     //初始化加载第一页，默认第一页
        pageSize: 100,      //每页的记录行数（*）
        pageList: [100, 200, 300, 400,500],  //可供选择的每页的行数（*）
        queryParamsType: 'limit',//传入参数类型
        queryParams: function (params) {
            return {
                pageSize: params.limit,//每页显示多少条
                pageNumber: params.offset / params.limit + 1//当前页码
            }
        },
        sidePagination: "server",//服务端分页
        columns: myColumns
    });
}
/*不分页*/
function initTableNoPage(tableId,url,myColumns,toolbarId) {
    // var columns = [{checkbox: true}];
    // columns.push(myColumns);
    $("#" + tableId).bootstrapTable('destroy');//销毁表格
    $('#' + tableId).bootstrapTable({
        clickToSelect: true,//启用单击选中
        striped:true,//斑马线效果
        showRefresh:true,//刷新按钮
        // showColumns:true,//可以勾选隐藏或显示特定列
        // pagination: true,//启用分页
        url: url,//请求地址
        toolbar: '#' + toolbarId,
        // contentType: "application/x-www-form-urlencoded",//post提交必须要有
        method: 'get',//提交方式
        singleSelect: true,
        height: $(window).height() - 100,
        // pageNumber: 1,     //初始化加载第一页，默认第一页
        // pageSize: 100,      //每页的记录行数（*）
        // pageList: [100, 200, 300, 400,500],  //可供选择的每页的行数（*）
        // queryParamsType: 'limit',//传入参数类型
        /*queryParams: function (params) {
            return {
                pageSize: params.limit,//每页显示多少条
                pageNumber: params.offset / params.limit + 1//当前页码
            }
        },
        sidePagination: "server",//服务端分页*/
        /*responseHandler: function (res) {//自定义回传数据
            if (res.data == null) {
                return {
                    "total": res.data,//总页数
                    "rows": res.data   //回传的数据
                }
            }
            else {
                return {
                    "total": res.data.total,
                    "rows": res.data.data
                };
            }
        },*/
        columns: myColumns
    });
}

function keydownFun(id,Fun) {
    $("#" + id).keydown(function (event) {
        var code = event.keyCode;
        if (code == 13) {
            Fun();
        }
    })
}

/**
 * 动态生成select选项
 * @param selectId
 * @param parentId
 * @returns
 */
function initSelectOptions(selectId, url,rows,key,value) {
    var selectObj = $("#" + selectId);
    $.ajax({
        url : url,
        async : false,
        type : "GET",
        success : function(result) {
            var configs = result[rows];
            selectObj.find("option:not(:first)").remove();
            for (var i in configs) {
                var addressConfig = configs[i];
                var optionValue = addressConfig[value];
                var optionText = addressConfig[key];
               //  var op = "<option value='" + optionValue + "'>" + optionText + "</option>"
                selectObj.append(new Option(optionValue, optionText));
                // selectObj.append(op);
            }
            // 刷新select
            selectObj.selectpicker('refresh');
        },
        error : function(result) {
            // toastr.error('获取信息失败，原因：' + result.errorMessage);
        }
    });// ajax
}
/**
 * min - max 之间的随机数
 * @param min
 * @param max
 * @returns {*}
 */
function ranNUm(min, max) {
    return Math.floor(Math.random() * (max - min)) + min;
}