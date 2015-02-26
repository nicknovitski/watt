(defproject watt "0.0.1"
  :description "idiomatic client to the Steam APIs"
  :dependencies [[org.clojure/data.json "0.2.5"]
                 [clj-http "1.0.1"]
                 [ring/ring-codec "1.0.0"]]
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.6.0"]]}}
  :main ^:skip-aot watt.build)
