<?php
    $con = mysqli_connect("anappforjack.000webhostapp.com", "id1470694_jducharme", "Cheasybean1", "id1470694_anappforjack");

    $email = $_POST["email"];
    $username = $_POST["username"];
    $password = $_POST["password"];
    $passwordcheck = $_POST["passwordcheck"];
    $statement = mysqli_prepare($con, "INSERT INTO Register (email, username, password, passwordcheck) VALUES (?, ?, ?, ?)");
    mysqli_stmt_bind_param($statement, "siss", $email, $username, $password, $passwordcheck);
    mysqli_stmt_execute($statement);

    $response = array();
    $response["success"] = true;

    echo json_encode($response);
?>