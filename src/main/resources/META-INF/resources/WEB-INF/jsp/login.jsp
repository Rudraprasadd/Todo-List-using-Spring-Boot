<html>
<head>
    <title>Login page</title>
</head>
<body>
    This is Login JSP Page ${name}!
    <pre>${Error}</pre>
    <form method="post">
        <label for="name">Name:</label>
        <input type="text" name="name">
 
        <label for="password">Password:</label>
        <input type="password" name="password" id="pass">
        <input type="submit">
    </form>
</body>
</html>