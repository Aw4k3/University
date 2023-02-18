<?php
session_start();

require_once "../Model/Recipe.php";
require_once "../Model/DataAccess.php";

$results = getAllRecipes();

require_once "../View/Homepage/Homepage.php"
?>