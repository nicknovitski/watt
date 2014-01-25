(defproject steam "0.0.1"
  :description "idiomatic client to the Steam APIs, built with schema reflection"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/data.json "0.2.3"]
                 [org.clojure/data.xml "0.0.7"]
                 [clj-http "0.7.8"]
                 [environ "0.2.1"]
                 [ring/ring-codec "1.0.0"]]
  :profiles {:dev {:dependencies [[midje "1.6.0"]]}})

