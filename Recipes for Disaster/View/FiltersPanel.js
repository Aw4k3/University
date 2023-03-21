const FILTER_PANEL = document.getElementById("filter-options");
const FILTER_BUTTON = document.getElementById("filter-button");

FILTER_BUTTON.addEventListener("click", ToggleFilterPanel);

function ToggleFilterPanel() {
    if (FILTER_PANEL.style.display == "flex") FILTER_PANEL.style.display = "none";
    else FILTER_PANEL.style.display = "flex";
}