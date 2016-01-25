(ns seagiant.systems)

(def state {
  :system "solar"})

(defn slog [& m]
  "Simple logging tentative"
  (.log js/console (str m)))

(slog "S Y S T E M S")

(slog (get state :system))

(slog "multiple" "message")
