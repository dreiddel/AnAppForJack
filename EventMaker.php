<?php
    $con = mysqli_connect("p179.entrydns.org", "jducharme", "abc123", "appJack");
    $email = $_POST["event"];
    $username = $_POST["location"];
    $password = $_POST["time"];
    $statement = mysqli_prepare($con, "INSERT INTO events (event, location, password, time) VALUES (?, ?, ?)");
    mysqli_stmt_bind_param($statement, "sss", $email, $username, $password);
    mysqli_stmt_execute($statement);

    $response = array();
    $response["success"] = true;

    echo json_encode($response);
?>