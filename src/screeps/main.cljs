(ns screeps.main
  (:require [cljs.nodejs :as nodejs]))

(set! (.-loop (.-exports js/module))
      (fn []
        (.log js/console "Things")))
