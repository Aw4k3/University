<!-- https://fonts.google.com/icons -->
<!-- https://kunet.uk/k2130178/Project/Controller/AdminPageC.php -->
<!DOCTYPE html>
<html>

<head>
    <title>Admin Page</title>
    <style>
        <?php require_once "AdminPageStyle.css"; ?>
    </style>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Rounded:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
</head>

<body>
    <div class="grid">
        <!-- Navigation Sidebar -->
        <nav class="navbar">
            <div style="display: flex;">
                <h2 style="padding: 5px 20px; font-size: 20px;">Recipes for Disaster: Admin Page</h2>
                <button id="menubutton">
                    <span class="material-symbols-rounded" style="color: white;">menu</span>
                </button>
            </div>
            <button class="navbutton active-navbutton" id="recipesbutton">Recipes</button>
            <button class="navbutton" id="customersbutton">Customers</button>
            <button class="navbutton" id="ordersbutton">Orders</button>
        </nav>

        <!-- User Bar -->
        <div class="user-bar">
            User stuff like profile button, page settings etc
        </div>
        <!-- Pages -->
        <div class="viewport">
            <div class="page active-page" id="recipespage">
                <!-- Entries -->
                <section class="recipe-section">
                    <div style="display: grid; grid-template-columns: auto auto;">
                        <h1>Recipes</h1>
                        <div style="display: flex; align-items: center; justify-content: flex-end;">
                            <div class="filter">
                                <p style="margin: 0px 4px;">Search</p>
                                <input type="text" value="text">
                            </div>

                            <div class="filter">
                                <p style="margin: 0px 4px;">Minimum Rating</p>
                                <input type="range" min="1" max="5" value="5">
                            </div>

                            <div class="filter">
                                <p style="margin: 0px 4px;">Vegan</p>
                                <input type="checkbox">
                            </div>

                            <div class="filter">
                                <p style="margin: 0px 4px;">Halal</p>
                                <input type="checkbox">
                            </div>
                        </div>
                    </div>
                    <br>
                    <div class="tile-viewer">
                        <?php foreach ($results as $recipe) : ?>
                            <div id="<?php $recipe->RecipeID ?>" class="tile">
                                <div style="display: flex; justify-content: space-between;">
                                    <h1><?= $recipe->Name ?></h1>
                                    <h1>Rating: <?= $recipe->Rating ?>/5</h1>
                                </div>
                                <p style="grid-column: 1 / 3; font-weight: lighter; height: 100%;"><?= $recipe->GetInstructions() ?></p>
                                <div style="grid-column: 1 / 3;">
                                    <button class="edit-button">Buy</button>
                                    <button class="edit-button">Edit</button>
                                    <button class="edit-button" style="background-color: rgb(180, 0, 0)">Delete</button>
                                </div>
                            </div>
                        <?php endforeach ?>
                    </div>
                </section>
            </div>

            <div class="page" id="customerspage">
                <!-- Entries -->
                <fieldset>
                    <legend>Customers</legend>
                    <table>
                        <tr>
                            <th>Name</th>
                            <th>Edit</th>
                        </tr>
                        <tr>
                            <td>data 1</td>
                            <td><button>Edit</button></td>
                        </tr>
                    </table>
                </fieldset>
            </div>

            <div class="page" id="orderspage">
                <!-- Entries -->
                <fieldset>
                    <legend>Orders</legend>
                    <table>
                        <tr>
                            <th>Name</th>
                            <th>Edit</th>
                        </tr>
                        <tr>
                            <td>data 1</td>
                            <td><button>Edit</button></td>
                        </tr>
                    </table>
                </fieldset>
            </div>
        </div>
    </div>

    <div id="recipeeditor" class="overlay">
        <div class="tile recipe-editor">
            <div style="display: flex; justify-content: space-between;">
                <input type="text" value="name">

                <div class="filter">
                    <p style="margin: 0px 4px;">Vegan</p>
                    <input type="checkbox">
                </div>

                <div class="filter">
                    <p style="margin: 0px 4px;">Halal</p>
                    <input type="checkbox">
                </div>

                <input type="range" min="1" max="5" value="5">
            </div>
            <textarea style="grid-column: 1 / 3; font-weight: lighter; height: 100%;" type="text" value="instructions"></textarea>
            <div style="grid-column: 1 / 3;">
                <button id="savechangesbutton" class="edit-button" style="background-color: rgb(0, 140, 30);">Save</button>
                <button id="cancelchangesbutton" class="edit-button" style="background-color: rgb(156, 139, 0);">Cancel</button>>
            </div>
        </div>
</body>

<script>
    <?php require_once "script.js"; ?>
</script>

</html>