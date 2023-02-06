const PAGES = document.getElementsByClassName("page");
const NAV_BUTTONS = document.getElementsByClassName("navbutton");

for (var b of NAV_BUTTONS) b.addEventListener("click", PageSwitcher);

function PageSwitcher() {
    console.log("Hidden all pages");
    for (var p of PAGES) p.classList.remove("active-page");
    for (var b of NAV_BUTTONS) b.classList.remove("active-navbutton");
    
    switch (this.id) {
        case "recipesbutton":
            console.log("Showing recipes page");
            document.getElementById("recipespage").classList.add("active-page");
            document.getElementById("recipesbutton").classList.add("active-navbutton");
            break;

        case "customersbutton":
            console.log("Showing customers page");
            document.getElementById("customerspage").classList.add("active-page");
            document.getElementById("customersbutton").classList.add("active-navbutton");
            break;

        case "ordersbutton":
            console.log("Showing orders page");
            document.getElementById("orderspage").classList.add("active-page");
            document.getElementById("ordersbutton").classList.add("active-navbutton");
            break;
    }
}