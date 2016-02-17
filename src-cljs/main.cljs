(ns seagiant.systems
  (:require [reagent.core :as r]))

(def state {
  :current-system :solar
  :systems {
    :solar {
      :name "solar"
      :planets {
        :mercury "mercury"
        :mars "mars"
      }}}})

(def cards-1
  {:player "1st"
  :cards (array "blip" "blap" "bloup")})

(defn slog [& m]
  "Simple logging tentative"
  (.log js/console (reduce str m)))

(slog "S Y S T E M S")

(slog (str cards-1))
(slog (nth (get cards-1 :cards) 0))

(defn title []
  [:div "S Y S T E M S"])

(defn current-system [cs]
  [:div
    (str cs)])

(defn debug [input]
  [:div (str input)])

(defn card [c]
  [:div
    (str c)])

(defn app []
  [:div
    [title]
    [current-system (get state :current-system)]
    [debug cards-1]
    [card (nth (get cards-1 :cards) 0)]])

(defn ^:export run []
  (r/render [app]
    (js/document.getElementById "app")))
