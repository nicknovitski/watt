(ns steam.t-core
  (:use midje.sweet)
  (:require [steam.core :as steam]
            [steam.util :as util]
            [clj-http.client :as http]
            [clojure.data.json :as json]))

(facts "`get-request`"
  (fact "returns the data at the specified endpoint"
    (steam/get-request ...options...) => ..data..
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

(facts "`make-interface`"
  (fact "creates a namespace from :name"
    (steam/make-interface {:name ...name...}) => ...ns...
    (provided
      (util/name->ns ...name...) => ...ns...))
  (fact "passes :name and the :methods sequence to `make-method`"
    (steam/make-interface { :name ...name...
                       :methods [...method-1... ...method-2...]}) => anything
    (provided
      (steam/make-method ...name... ...method-1...) => anything 
      (steam/make-method ...name... ...method-2...) => anything)))

(fact "`make-method` should exist")
