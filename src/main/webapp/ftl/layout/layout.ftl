<#macro layout menu_index>
    <!doctype html>
    <html>
        <head>
            <meta charset="utf-8">
            <meta http-equiv="x-ua-compatible" content="ie=edge">
            <title>后台管理系统</title>
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <link rel="shortcut icon" type="image/png" href="${ctx}/assets/images/icon/favicon.ico">
            <link rel="stylesheet" href="${ctx}/assets/css/bootstrap.min.css">
            <link rel="stylesheet" href="${ctx}/assets/css/font-awesome.min.css">
            <link rel="stylesheet" href="${ctx}/assets/css/themify-icons.css">
            <link rel="stylesheet" href="${ctx}/assets/css/metisMenu.css">
            <link rel="stylesheet" href="${ctx}/assets/css/owl.carousel.min.css">
            <link rel="stylesheet" href="${ctx}/assets/css/slicknav.min.css">
            <!-- amchart css -->
            <link rel="stylesheet" href="https://www.amcharts.com/lib/3/plugins/export/export.css" type="text/css"
                  media="all"/>
            <!-- others css -->
            <link rel="stylesheet" href="${ctx}/assets/css/typography.css">
            <link rel="stylesheet" href="${ctx}/assets/css/default-css.css">
            <link rel="stylesheet" href="${ctx}/assets/css/styles.css">
            <link rel="stylesheet" href="${ctx}/assets/css/responsive.css">
            <!-- modernizr css -->
            <script src="${ctx}/assets/js/vendor/modernizr-2.8.3.min.js"></script>
            <!-- bootstrapValidator -->
            <link href="http://cdn.bootcss.com/bootstrap-validator/0.5.3/css/bootstrapValidator.min.css" rel="stylesheet" />
            <!-- jquery latest version -->
            <script src="${ctx}/assets/js/vendor/jquery-2.2.4.min.js"></script>
            <script src="${ctx}/assets/js/jquery.form.js"></script>
            <script src="http://cdn.bootcss.com/bootstrap-validator/0.5.3/js/bootstrapValidator.min.js"></script>
        </head>
        <body class="body-bg">
            <!--[if lt IE 8]>
            <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
            <![endif]-->
            <!-- preloader area start -->
            <div id="preloader">
                <div class="loader"></div>
            </div>
            <!-- preloader area end -->
            <!-- main wrapper start -->
            <div class="horizontal-main-wrapper">
                <!-- 顶部引用 -->
                <#import "${ctx}/layout/header.ftl" as header>
                <@header.header>
                </@header.header>
                <!-- 菜单栏引用 -->
                <#import "${ctx}/layout/sidebar.ftl" as sidebar>
                <@sidebar.sidebar menu_index>
                </@sidebar.sidebar>
                <!-- 展示区域 -->
                <#nested>
                <!-- 底部引用 -->
                <#import "${ctx}/layout/footer.ftl" as footer>
                <@footer.footer>
                </@footer.footer>
            </div>
            <!-- main wrapper start -->
            <!-- bootstrap 4 js -->
            <script src="${ctx}/assets/js/popper.min.js"></script>
            <script src="${ctx}/assets/js/bootstrap.min.js"></script>
            <script src="${ctx}/assets/js/owl.carousel.min.js"></script>
            <script src="${ctx}/assets/js/metisMenu.min.js"></script>
            <script src="${ctx}/assets/js/jquery.slimscroll.min.js"></script>
            <script src="${ctx}/assets/js/jquery.slicknav.min.js"></script>
            <!-- start chart js -->
            <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.2/Chart.min.js"></script>
            <!-- start highcharts js -->
            <script src="https://code.highcharts.com/highcharts.js"></script>
            <script src="https://code.highcharts.com/modules/exporting.js"></script>
            <script src="https://code.highcharts.com/modules/export-data.js"></script>
            <!-- start amcharts -->
            <script src="https://www.amcharts.com/lib/3/amcharts.js"></script>
            <script src="https://www.amcharts.com/lib/3/ammap.js"></script>
            <script src="https://www.amcharts.com/lib/3/maps/js/worldLow.js"></script>
            <script src="https://www.amcharts.com/lib/3/serial.js"></script>
            <script src="https://www.amcharts.com/lib/3/plugins/export/export.min.js"></script>
            <script src="https://www.amcharts.com/lib/3/themes/light.js"></script>
            <!-- all line chart activation -->
            <script src="${ctx}/assets/js/line-chart.js"></script>
            <!-- all pie chart -->
            <script src="${ctx}/assets/js/pie-chart.js"></script>
            <!-- all bar chart -->
            <script src="${ctx}/assets/js/bar-chart.js"></script>
            <!-- all map chart -->
            <script src="${ctx}/assets/js/maps.js"></script>
            <!-- others plugins -->
            <script src="${ctx}/assets/js/plugins.js"></script>
            <script src="${ctx}/assets/js/scripts.js"></script>
        </body>
    </html>
</#macro>