<?php
require_once "../Model/User.php";
require_once "../Model/DataAccess.php";

Init();
$user = $_SESSION["user"];
$basket = $_SESSION["basket"];

require_once "../View/NavBar.php";

if (isset($_REQUEST["logout"])) {
    session_unset();
    // Using "header()" and "exit()" rather than "require_once" as "require_once" doesn't actually seem to redirect
    header("Location: https://kunet.uk/k2130178/Project/Controller/HomePage.php");
    exit();
}

if ($_SESSION["user"]->guest) {
    $user = TryLogin();
    require_once "../View/NavBar.php";
    if ($user != null) {
        $_SESSION["user"] = $user;
        require_once "../View/NavBar.php";

        if ($user->admin == 1) header("Location: https://kunet.uk/k2130178/Project/Controller/AdminPage.php");
        else header("Location: https://kunet.uk/k2130178/Project/Controller/HomePage.php");
        exit();
    } else {
        require_once "../View/LoginPageV.php";
    }
}