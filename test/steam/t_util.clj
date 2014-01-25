(ns steam.t-util
  (:use [midje.sweet])
  (:require [steam.util :as u]))

(facts "`clojurify`"
  (tabular
    (fact "`clojurify` dash-separates camelcase strings"
      (u/clojurify ?string) => ?formatted)
        ?string           ?formatted
        "foo"             "foo"
        "AbstractFactory" "abstract-factory"
        "Foo_420"         "foo-420"
        "FooAPIUtil"      "foo-api-util"
        "FooOAuth"        "foo-oauth")
  (tabular
    (fact "drops the prefixes 'I', 'ISteam' and 'Get'"
      (u/clojurify ?string) => ?formatted)
        ?string           ?formatted
        "IFoo"            "foo"
        "ISteamFoo"       "foo"
        "GetFoo"          "foo"))

(fact "`name->symbol creates a symbol"
  (u/name->symbol ...string...) => ...symbol...
  (provided (symbol (u/clojurify ...string...)) => ...symbol...))

(fact "`name->ns` creates a namespace in the package"
  (u/name->ns ...string...) => ...ns...
  (provided (create-ns (symbol (str "steam." (u/clojurify ...string...)))) => ...ns...))

(facts "`api-uri`"
  (fact "returns a full uri based on :interface, :method and :version"
    (u/api-uri { :interface ..interface..
                     :method ..method..
                     :version ..version..}) =>
      (clojure.string/join "/" ["http://api.steampowered.com" ..interface.. ..method.. ..version-string..])
    (provided (u/version-string ..version..) => ..version-string..))
  (fact "turns any remaining parameters into a query string"
    (u/api-uri {:foo "bar"}) => #"/\?foo=bar$"))

(facts "`version-string`"
  (fact "zero-pads an integer"
    (u/version-string 1) => "v0001"
    (u/version-string 2) => "v0002")
  (fact "defaults to 1"
     (u/version-string nil) => "v0001"))
