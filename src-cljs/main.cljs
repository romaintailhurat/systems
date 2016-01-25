(ns seagiant.systems
  (:require [reagent.core :as r]))

(def state {
  :current-system :solar
  :systems {
    :solar "solar"}})

(defn slog [& m]
  "Simple logging tentative"
  (.log js/console (reduce str m)))

(slog "S Y S T E M S")

(slog (get state :current-system))

(defn hello []
  [:h1 "HELLO PLAYER"])

(defn ^:export run []
  (r/render [hello]
            (js/document.getElementById "app")))
