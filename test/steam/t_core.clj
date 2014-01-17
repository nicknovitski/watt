(ns steam.t-core
  (:use midje.sweet)
  (:require [steam.core :as steam]
            [steam.util :as util]
            [clj-http.client :as http]
            [clojure.data.json :as json]))


(facts "`get`"
  (fact "returns the data at the specified endpoint"
    (steam/get ...options...) => ..data..
  (provided
   (http/get (util/api-uri ...options...))
      => {:status 200, :body ...body...}
   (json/read-str ...body... )
      => ..data..)))

(fact "`profile-name->id` requests the named community profile and returns the value in <steamID64>"
 (def uri (str "http://steamcommunity.com/id/" ...name... "?xml=1"))
 (steam/profile->id ...name...) => ...id...
 (provided (http/get uri)
   => {:body (str "<profile><steamID64>" ...id... "</steamID64><otherTags></otherTags></profile>")}))