<!DOCTYPE html>
<html lang="en">
<head>

</head>
<body>
<table>
    <tr>
        <th>Product</th>
        <th>Qt.</th>
        <th>Product Price (€)</th>
        <#if user-type == 1>
            <th>Discount (%)</th>
        </#if>
    </tr>
    <#list products as product>
        <tr>
            <td>${product.product-name}</td>
            <td>${product.quantity}</td>
            <td>${product.product-price}</td>
            <#if user-type == 1>
                <td>${product.discount}</td>
            </#if>
        </tr>
    </#list>
</table>
<div>Bill info:</div>
<div>${user-name} ${user-lastname}</div>
<div>${user-address}</div>
<div>Total order price: ${total-price}</div>
</body>
</html>