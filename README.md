# Watt

A very lazy client for the Steam Web API

## Usage

The Steam Web API consists of endpoints called "methods", which are grouped
into "interfaces". In perfect correspondence, watt consists of functions
grouped into namespaces.

Most of the functions have optional or required keyword arguments, described in their respective docstrings. All of them return ring-style response maps.

Say you wanted to know how many people are playing Team Fortress 2 right this second.

```clojure
=> (require '[watt.user-stats :refer [number-of-current-players]])
nil
=> (number-of-current-players :appid 440)
{:orig-content-encoding nil, :trace-redirects ["http://api.steampowered.com/ISteamUserStats/GetNumberOfCurrentPlayers/v0001/?appid=440"], :request-time 135, :status 200, :headers {"content-length" "60", "content-type" "application/json; charset=UTF-8", "expires" "Wed, 25 Feb 2015 05:37:05 GMT", "Date" "Wed, 25 Feb 2015 05:37:05 GMT"}, :body {:response {:player_count 34331, :result 1}}}
```

Some methods are open, but others require an api key. You can pass in the key
to each function call (as `:key`), but I recommend instead putting it in the
environment variable `$STEAM_API_KEY`.

Say you wanted to compare the steam levels of all your friends.

```clojure
$ STEAM_API_KEY=WHATEVERYOURKEYIS lein repl
...
=> (require '[watt.player :refer [steam-level]])
nil
=> (require '[watt.user :refer [friend-list]])
nil
=> (defn add-level [p]
     (merge p (-> (steam-level :steamid (:steamid p)) :body :response)))
#'steam.build/add-level
=> (defn friends-vec [id]
	(-> (friend-list :steamid id) :body :friendslist :friends)
#'steam.build/friends-vec
=> (sort-by :player-level (map add-level (friends-vec 76561197972495328))) ;Robin Walker, traditionally used in examples
({:player_level 2, :steamid "7656...
```

## Contributing

The only namespaces which need to be changed manually are `watt.core` and
`watt.build`. The rest are generated.  Hence, I call the library "lazy".

## wat

James Watt didn't invent the steam engine, but he made it much more useful.
