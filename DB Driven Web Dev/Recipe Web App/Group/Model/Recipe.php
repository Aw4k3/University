<?php
class Recipe {
    private $RecipeID = -1;
    private $Name = "";
    private $CookingTime = -1;
    private $Price = 0.0;
    private $DateAdded = "";
    private $Rating = 1;
    private $instructions = "";
    // private $description = "";
    // private $ingredients = [""];
    // private $warnings = [""]; // Dietary Restrictions and Allergens

    function __get($name) {
        return $this->$name;
    }

    function __set($name, $value) {
        $this->$name = $value;
    }

    function SetRating($rating) {
        if ($rating > 5 || $rating < 1) return; // Range check
        $this->$rating = $rating;
    }

    function AddIngredients($ingredients) {
        // If a single ingredient is passed through
        if (is_string($ingredients)) array_push($this->$ingredients, $ingredients);

        // If an array of ingredients is passed through
        if (is_array($ingredients))
            foreach ($ingredients as $ingredient)
                array_push($this->$ingredients, $ingredient);
    }

    function AddInstructions($instructions) {
        // If a single instruction is passed through
        if (is_string($instructions)) array_push($this->$instructions, $instructions);

        // If an array of instructions is passed through
        if (is_array($instructions))
            foreach ($instructions as $instruction)
                array_push($this->$instructions, $instruction);
    }

    function AddWarnings($warnings) {
        // If a single instruction is passed through
        if (is_string($warnings)) array_push($this->$warnings, $warnings);

        // If an array of instructions is passed through
        if (is_array($warnings))
            foreach ($warnings as $warning)
                array_push($this->$warnings, $warning);
    }

    function GetInstructions() {
        return nl2br($this->instructions);
    }
}
?>