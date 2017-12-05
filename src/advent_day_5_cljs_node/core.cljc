(ns advent-day-5-cljs-node.core
  #?(:cljs (:require [cljs.nodejs :as nodejs])))

#?(:cljs (nodejs/enable-util-print!))

(defn -main [& args]
  (println "Hello world!"))

#?(:cljs (set! *main-cli-fn* -main))
