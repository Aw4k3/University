<nav>
    <h1>Recipes for Disaster</h1>
    <div class="user-items">
        <a href="../Controller/Checkout.php" style="text-decoration: none; display: flex; align-items: center; gap: 4px; color: black;">
            <span><?= count($basket->items); ?></span>
            <span class="material-symbols-outlined">shopping_basket</span>
        </a>
        <div style="display: flex; align-items: center; gap: 4px;">
            <p class="hidden-on-mobile"><?= $user->displayname; ?></p>
            <div class="dropdown" style="height: 40px; z-index: 1; position: relative; display: inline-block;">
                <a href="../Controller/LoginPage.php">
                    <img src="https://www.iconpacks.net/icons/2/free-user-icon-3296-thumb.png" width="40px" alt="Profile Picture">
                </a>
                <div class="dropdown-container">
                    <p><?= $user->displayname; ?></p>
                    <form action="../Controller/LoginPage.php" method="post">
                        <button name="logout">Logout</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</nav>