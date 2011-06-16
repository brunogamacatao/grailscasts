<html>
    <head>
        <title>Product Registration</title>
        <meta name="layout" content="main" />
        <link rel="stylesheet" href="${resource(dir:'css',file:'index.css')}" />
    </head>
    <body>
        <div id="pageBody">
            <div id="controllerList">
                <h2>Options:</h2>
                <ul>
                	<g:link controller="manufacturer"><li class="controller manufacturer">Manufacturers</li></g:link>
                	<g:link controller="product"><li class="controller product">Products</li></g:link>
                </ul>
            </div>
        </div>
    </body>
</html>
