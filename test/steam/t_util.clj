(ns steam.t-util
  (:use [midje.sweet])
  (:require [steam.util :as u]))

(tabular
 (fact "`name->symbol` turns camelcased strings into dash-separated symbols, dropping prefixes 'I', 'ISteam' and 'Get'"
  (u/name->symbol ?string) => ?symbol)
 ?string           ?symbol
 "foo"             'foo
 "AbstractFactory" 'abstract-factory
 "Foo_420"         'foo-420
 "FooAPI"          'foo-api
 "IFoo"            'foo
 "ISteamFoo"       'foo
 "GetFoo"          'foo)

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
