<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Thank You</title>
    <link rel="stylesheet" href="styles/main.css">
</head>
<body>
<main class="page">
    <h1 class="title">Thank You!</h1>
    <p class="intro">We appreciate your time. Here is the information you submitted:</p>

    <ul>
        <li><b>First Name:</b> ${firstName}</li>
        <li><b>Last Name:</b> ${lastName}</li>
        <li><b>Email:</b> ${email}</li>
        <li><b>Date of Birth:</b> ${dob}</li>
        <li><b>Heard about us via:</b> ${hear}</li>
        <li><b>Offers:</b> ${offers}</li>
        <li><b>Email Offers:</b> ${emailoffers}</li>
        <li><b>Preferred Contact:</b> ${contact}</li>
    </ul>

    <p class="intro">Once again, thank you for filling out our survey!</p>
</main>
</body>
</html>
