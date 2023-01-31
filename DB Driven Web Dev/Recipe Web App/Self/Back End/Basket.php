<?php
class Basket {
    private $items = [""];
    private $totalcost = 0.0;

    function __get($name) {
        return $this->$name;
    }

    function __set($name, $value) {
        $this->$name = $value;
    }
}
?>