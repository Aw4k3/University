<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Recipes for Disaster</title>
    <style>
        <?php require_once "Homepage.css"; ?>
    </style>
</head>

<body>
    <nav>
        <h1 style="padding: 0px 10px;">Recipes for Disaster</h1>
    </nav>
    <div class="landing">
        <img style="width: 100%; height: 600px; object-fit: cover;" src="https://upload.wikimedia.org/wikipedia/commons/6/6d/Good_Food_Display_-_NCI_Visuals_Online.jpg">
    </div>
    <main>
        <form class="filter-panel" action="../../Controller/HomepageC.php">
            <div class="filter-options">
                <p>Recipe Name</p>
                <input type="text" name="recipe-name">
            </div>

            <div class="filter-options">
                <p>Rating</p>
                <input type="range" name="rating" min="1" max="5" value="1">
            </div>

            <div class="filter-options">
                <input type="checkbox" name="is-vegetarian">
                <label>Vegetarian</label>
            </div>

            <div class="filter-options">
                <input type="checkbox" name="is-vegan">
                <label>Vegan</label>
            </div>

            <div class="filter-options">
                <input type="checkbox" name="is-halal">
                <label>Halal</label>
            </div>

            <button type="submit">Apply</button>
        </form>
        <div class="card-viewer">
            <?php foreach ($results as $recipe) : ?>
                <div class="dish-card" id="<?= $recipe->id ?>">
                    <img src="<?= $recipe->coverimage ?>" alt="Dish Image">
                    <div style="display: flex; justify-content: space-between;">
                        <h1><?= $recipe->name ?></h1>
                        <h1><?= $recipe->GetStars() ?></h1>
                    </div>
                    <h2><?= $recipe->GetWarnings() ?></h2>
                </div>
            <?php endforeach ?>
        </div>
    </main>
</body>

</html>