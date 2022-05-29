<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Subscription Mail</title>
</head>

<body>
		
Hi ${fname} ${lname}, your plan has been updated with the following details
<br>
<br>
Plan : ${Plantype}
<br>
<#if nousers??>
Number of Users : ${nousers}
</#if>
<br>
<#if cycle??>
Contract Cycle: ${cycle}
</#if>
<br>
<#if addons??>
New Addons Selected : ${addons}
</#if>
<br>
<#if amount??>
Prorated Amount : ${amount}
</#if>
<br>
<#if down??>
You have successfuly downgraded to ${Plantype}. You are not entitled to any refund
</#if>
<br>
<br>
For more details please login and check out in your License management page
<br>
<br>
Thanks,
<br>
Nimble Team					
</body>
</html>