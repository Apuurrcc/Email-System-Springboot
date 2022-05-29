<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Subscription Mail</title>
</head>

<body>
		Dear Sales Team,
		<br>
		<br>

Here is the customer information who has requested for the Enterprise plan. So please do connect with customer and answer his query
<br>
<br>
First name: ${fname}
<br>
Last name: ${lname}
<br>
Email: ${cmail}
<br>
<#if phone??>
Phone: ${phone}
</#if>
<br>
<#if query??>
Query: ${query}
</#if>

<br>
Thanks,
<br>
${fname} ${lname}						
</body>
</html>