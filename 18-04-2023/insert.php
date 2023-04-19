<?php

include "conn.php";

$name = $_POST['name'];
$email = $_POST['email'];
$password = $_POST['password'];

//echo "$name - $email - $password";

//preparar
$stmt = $conn->prepare("INSERT INTO student (namebd, emailbd, 	passbd) VALUES (:namebd, :emailbd, 	:passbd)");

//trocar
$stmt->bindValue(':namebd', $name);
$stmt->bindValue(':emailbd', $email);
$stmt->bindValue(':passbd', $password);

//excutar

$stmt->execute();

header ('location: index.php');
?>