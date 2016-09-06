<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Sample Web App</title>


    <spring:url value="/webjars/bootstrap/3.3.6/css/bootstrap.min.css" var="bootstrapCss"/>
    <link href="${bootstrapCss}" rel="stylesheet"/>

    <spring:url value="/resources/css/sample.css" var="sampleCss"/>
    <link href="${sampleCss}" rel="stylesheet"/>

    <spring:url value="/webjars/jquery/2.2.0/jquery.js" var="jQuery"/>
    <script src="${jQuery}"></script>

    <!-- jquery-ui.js file is really big so we only load what we need instead of loading everything -->
    <spring:url value="/webjars/jquery-ui/1.11.4/jquery-ui.min.js" var="jQueryUiCore"/>
    <script src="${jQueryUiCore}"></script>

    <!-- jquery-ui.css file is not that big so we can afford to load it -->
    <spring:url value="/webjars/jquery-ui/1.11.4/jquery-ui.min.css" var="jQueryUiCss"/>
    <link href="${jQueryUiCss}" rel="stylesheet"></link>
    
</head>


