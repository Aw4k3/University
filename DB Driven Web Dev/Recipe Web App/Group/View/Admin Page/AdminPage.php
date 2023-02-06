<!-- https://fonts.google.com/icons -->
<!DOCTYPE html>
<html>

<head>
    <title>Admin Page</title>
    <style>
        <?php require_once "AdminPageStyle.css"; ?>
    </style>
    <link rel="stylesheet"
        href="https://fonts.googleapis.com/css2?family=Material+Symbols+Rounded:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
</head>

<body>
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

    <!-- Pages -->
    <div class="viewport">
        <div class="page active-page" id="recipespage">
            <!-- Entries -->
            <section class="data-card">
                <h1>Recipes</h1>
                <br>
                <div class="tile-viewer">
                    <?php foreach ($results as $recipe): ?>
                        <div class="tile">
                            <h1><?= $recipe->Name ?></h1>
                            <h1 style="text-align: end;">Rating: <?= $recipe->Rating ?>/5</h1>
                            <p style="grid-column: 1 / 3;"><?= $recipe->GetInstructions() ?></p>
                            <div class="sub-tile" style="grid-column: 1 / 3;">
                                <b>Warnings</b>
                            </div>
                            <button class="edit-button">Edit</button>
                        </div>
                    <?php endforeach ?>
                </div>
            </section>
            <br>
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
</body>

<script>
    <?php require_once "script.js"; ?>
</script>

</html>