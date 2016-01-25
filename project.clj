(defproject systems "0.0.1"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.170"]]
  :plugins [[lein-cljsbuild "1.1.2"]
            [lein-figwheel "0.5.0-1"]]
  :cljsbuild {
    :builds [{:id "fig"
              :source-paths ["src-cljs"]
              :figwheel true
              :compiler {:main "seagiant.systems"
                         :asset-path "js/out"
                         :output-to "resources/public/js/main.js"
                         :output-dir "resources/public/js/out"
                         :pretty-print true}}]
    })
