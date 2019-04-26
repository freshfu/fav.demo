<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <link href="${pageContext.request.contextPath}/static/bootstrap400/css/bootstrap.min.css"  rel="stylesheet">
        <link href="${pageContext.request.contextPath}/static/css/sticky-footer-navbar.css"  rel="stylesheet">
        <title>你是我的欢喜</title>
    </head>
    <body>
    <header>
        <!-- Fixed navbar -->
        <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
            <a class="navbar-brand" href="gotoHome">首页</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarCollapse">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="#">电影<span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">图书</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link disabled" href="#">歌曲</a>
                    </li>
                </ul>
                <form class="form-inline mt-2 mt-md-0">
                    <input class="form-control mr-sm-2" type="text" placeholder="请输入电影/图书/歌曲名称" aria-label="Search">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">搜索</button>
                </form>
            </div>
        </nav>
    </header>
    <!-- Begin page content -->
    <main role="main" class="container">
        <h1 class="mt-5">这些class都是什么玩意</h1>
        <p class="lead">谁给你们起的名字，你们自己瞧瞧，这是个正经名字吗 <br/><code>form-inline mt-2 mt-md-0 collapse navbar-collapse" id="navbarCollapse .container</code>.</p>
        <p>Back to <a href="../sticky-footer">the default sticky footer</a> minus the navbar.</p>
        <h1 class="mt-5">这些class都是什么玩意</h1>
        <p class="lead">谁给你们起的名字，你们自己瞧瞧，这是个正经名字吗 <br/><code>form-inline mt-2 mt-md-0 collapse navbar-collapse" id="navbarCollapse .container</code>.</p>
        <p>Back to <a href="../sticky-footer">the default sticky footer</a> minus the navbar.</p>
    </main>
    <footer class="footer">
        <div class="container">
            <span class="text-muted">这儿是固定的底部工具条.</span>
        </div>
    </footer>
    <script src="${pageContext.request.contextPath}/static/js/jquery-3.4.0.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/popper.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/bootstrap400/js/bootstrap.js"></script>
    </body>
</html>
