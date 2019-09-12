<%@ page pageEncoding="UTF-8" %>
<html>
<head>
    <title>Hello</title>
    <script src="../resources/js/jquery-3.1.0.min.js"></script>
    <script src="../resources/js/commonAjax.js"></script>
</head>
<body>

<h1>Hello!</h1>

<button id="test">test</button>

<script type="text/javascript">

    $(function () {
        $("#test").click(function () {
            commonAjax.Ajax("helloworld1", "post", "", function (data) {
                alert(data);
            })
        });
    });

</script>
</body>
</html>