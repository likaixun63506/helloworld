commonAjax={}

commonAjax.POST="post";

commonAjax.GET="get";

commonAjax.Ajax=function (url,type,obj,fn) {
    $.ajax({
        url: url,
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        type: type,
        dateType: "application/json",
        data: JSON.stringify(obj),
        success:function(result){
            fn(result);
        },
        error:function () {
            alert("加载出错");
        },
    })
}
