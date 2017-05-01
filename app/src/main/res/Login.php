<?php
    $con = mysqli_connect("p179.entrydns.org", "jducharme", "abc123", "appJack");

    $username = $_POST["username"];
    $password = $_POST["password"];

    $statement = mysqli_prepare($con, "SELECT * FROM user WHERE username = ? AND password = ?");
    mysqli_stmt_bind_param($statement, "ss", $username, $password);
    mysqli_stmt_execute($statement);

    mysqli_stmt_store_result($statement);
    mysqli_stmt_bind_result($statement, $userID, $email, $username, $password, $passwordcheck);

    $response = array();
    $response["success"] = false;

    while(mysqli_stmt_fetch($statement)){
        $response["success"] = true;
        $response["email"] = $email;
        $response["username"] = $username;
        $response["password"] = $password;
        $response["passwordcheck"] = $passwordcheck;
    }
   echo json_encode($response);
?>