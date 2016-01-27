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

(defn slog [& m]
  "Simple logging tentative"
  (.log js/console (reduce str m)))

(slog "S Y S T E M S")

(defn title []
  [:div "S Y S T E M S"])

(defn current-system [cs]
  [:div
    (str cs)])

(defn debug [input]
  [:div (str input)])

(defn app []
  [:div
    [title]
    [current-system (get state :current-system)]
    [debug state]])

(defn ^:export run []
  (r/render [app]
            (js/document.getElementById "app")))
