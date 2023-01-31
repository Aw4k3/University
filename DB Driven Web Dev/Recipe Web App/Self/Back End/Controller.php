<?php

$pdo = new PDO ("mysql:host=localhost;
dbname=db_maroon","maroon","tiedeita",
[PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION]);

function getAllRecipes()
{
    global $pdo;
    $statement = $pdo->prepare("SELECT * FROM Recipes");
    $statement->execute();
    $results = $statement->fetchAll(PDO::FETCH_CLASS,"Recipes");
    return $results;
}

/*
the html for the this could look something like this
<form action="dataAccess.php" method="get">
    <input type="text" name="recipename">
    <input type="number" name="recipecookingtime">
    <input type="number" name="recipeprice">
    <input type="date" name="recipedate">
    <input type="number" name="reciperating">
</form>
*/

function filterByName() {
    global $pdo;
    $statement = $pdo->prepare("SELECT * FROM Recipes WHERE Name LIKE \"%$_GET["recipename"]%\"");
    $statement->execute();
    $results = $statement->fetchAll(PDO::FETCH_CLASS,"Recipes");
    return $results;
}

function filterByCookingTime() {
    global $pdo;
    $statement = $pdo->prepare("SELECT * FROM Recipes WHERE CookingTime LIKE \"%$_GET["recipecookingtime"]%\"");
    $statement->execute();
    $results = $statement->fetchAll(PDO::FETCH_CLASS,"Recipes");
    return $results;
}

function filterByPrice() {
    global $pdo;
    $statement = $pdo->prepare("SELECT * FROM Recipes WHERE Price LIKE \"%$_GET["recipeprice"]%\"");
    $statement->execute();
    $results = $statement->fetchAll(PDO::FETCH_CLASS,"Recipes");
    return $results;
}

function filterByDateAdded() {
    global $pdo;
    $statement = $pdo->prepare("SELECT * FROM Recipes WHERE DateAdded LIKE \"%$_GET["recipedate"]%\"");
    $statement->execute();
    $results = $statement->fetchAll(PDO::FETCH_CLASS,"Recipes");
    return $results;
}

function filterByRating() {
    global $pdo;
    $statement = $pdo->prepare("SELECT * FROM Recipes WHERE DateAdded LIKE \"%$_GET["reciperating"]%\"");
    $statement->execute();
    $results = $statement->fetchAll(PDO::FETCH_CLASS,"Recipes");
    return $results;
}

?>