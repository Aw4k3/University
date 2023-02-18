<?php
$pdo = new PDO ("mysql:host=localhost; dbname=db_k2130178","k2130178","eengeidi", [PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION]);

function getAllRecipes()
{
    global $pdo;
    $statement = $pdo->prepare("SET NAMES \"utf8\"");
    $statement->execute();
    $statement = $pdo->prepare("SELECT * FROM Recipes");
    $statement->execute();
    $results = $statement->fetchAll(PDO::FETCH_CLASS, "Recipe");
    return $results;
}
?>