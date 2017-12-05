(defproject advent-day-5-cljs-node "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.946"]]
  :plugins [[lein-cljsbuild "1.1.7"]]
  :main advent-day-5.core
  :cljsbuild {:builds [{:source-paths ["src"]
                        :compiler     {:main          advent-day-5.core
                                       :output-to     "main.js"
                                       :optimizations :advanced
                                       :target        :nodejs}}]})
