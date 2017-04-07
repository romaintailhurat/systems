(ns seagiant.systems
  (:require [reagent.core :as r]))

;; utils
(defn slog [& m]
  "Simple logging tentative"
  (.log js/console (reduce str m)))

(defn debug [input]
  [:div (str input)])

;; logic
(defn gen-card [name attack life]
  {:name name :attack attack :life life})

;;(defn gen-map [x y])

;; game state
(def state {
  :current-player :player-one
  :players :player-one
  :player-one-cards {
    :c1 (gen-card "oliver" 2 2)
    :c2 (gen-card "eric" 5 1)
    :c3 (gen-card "bernard" 0 8)
    :c4 (gen-card "romain" 0 0)
  }
  :player-two-cards {
    :c1 (gen-card "oliver" 2 2)
    :c2 (gen-card "eric" 5 1)
    :c3 (gen-card "bernard" 0 8)
    :c4 (gen-card "romain" 0 0)
    }})


;; components
(defn title []
  [:div "KARDS"])

(defn card [c]
  [:div
    (str c)])

(defn cards [player cards]
  [:div
    [:p (str "player is " player)]
    (for [c cards]
      [:p (str c)])])

;; app
(defn app []
  [:div
    [title]
    [cards "player one" (get state :player-one-cards)]
    [cards "player two" (get state :player-two-cards)]
  ])

(defn ^:export run []
  (r/render [app]
    (js/document.getElementById "app")))
