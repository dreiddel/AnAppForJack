<?php
    $con = mysqli_connect("databases-auth.000webhost.com", "id1470694_bigbluehusky", "Cheasybean1", "id1470694_user");

    $email = $_POST["email"];
    $username = $_POST["username"];
    $password = $_POST["password"];
    $passwordcheck = $_POST["passwordcheck"];
    $statement = mysqli_prepare($con, "INSERT INTO user (email, username, password, passwordcheck) VALUES (?, ?, ?, ?)");
    mysqli_stmt_bind_param($statement, "ssss", $email, $username, $password, $passwordcheck);
    mysqli_stmt_execute($statement);

    $response = array();
    $response["success"] = true;

    echo json_encode($response);
?>